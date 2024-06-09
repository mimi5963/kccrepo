package kosa.shop.shopmanager;

import kosa.shop.advertisement.NewProductAdvertisement;
import kosa.shop.advertisement.NewProductAdvertisementImpl;
import kosa.shop.domain.*;
import kosa.shop.page.PagenationShop;
import kosa.shop.test.Testable;
import kosa.shop.util.KeyBoardInput;
import kosa.shop.util.CustomerValidation;
import kosa.shop.util.ProductValidation;
import kosa.shop.util.findpolicy.FindProductPolicy;
import kosa.shop.util.sortstrategy.ProductSort;

import java.util.*;

public class ShopManagerImpl implements ShopManager{
    private List<Order> orders;
    private List<Customer> customers; //추후 Map으로 교체 성능 차이 보자
    private Customer curCustomer;
    private  List<Product> products;

    private static Map<Integer, FindProductPolicy> findPolicyMap;
    private static Map<Integer,ProductSort> productSortMap;

    private NewProductAdvertisement  newProductAdvertisement;

    private static int orderNum=0;
    static {
       findPolicyMap = FindProductPolicy.findProductPolicyMap;
       productSortMap = ProductSort.productSortMap;


    }
    public ShopManagerImpl(){
        this.orders = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.products = new ArrayList<>();
        newProductAdvertisement = NewProductAdvertisementImpl.FromNewProductAdvertisementImpl(this);
        setTestProducts(products);
        setTestUserData(customers);
    }





    public boolean isCurUserAgreeAds() {
        return this.curCustomer.getAgreeToAds();
    }

    @Override
    public void categoryList() {

    }

    @Override
    public void addCustomer() {

        System.out.println("-------------고객 등록 페이지---------------");
        System.out.print("고객 아이디를 입력해주세요 :");
        String id = CustomerValidation.getValidatedCustomerId(customers,KeyBoardInput.scanner.nextLine());
        if("".equals(id)) return;

        System.out.print("이름을 입력해주세요 :");
        String name = KeyBoardInput.scanner.nextLine();
        System.out.print("생년월일을 입력해주세요 (ex 1997/04/02):");


        Date birthDate = CustomerValidation.getValidatedCustomerBirth(KeyBoardInput.scanner.nextLine());
        if(birthDate == null){
            return;
        }

        System.out.print("성별을 입력해주세요 (남 혹은 여로 입력해주세요): ");
        String sex = CustomerValidation.getValidatedCustomerSex(KeyBoardInput.scanner.nextLine());
        if("".equals(sex)){
            return;
        }


        System.out.print("신규 물품 등록 시 광로를 받아보시겠습니까? 동의하시면 1번 동의하지않으시면 아무키나 눌러주세요");
        String adsAgree = KeyBoardInput.scanner.nextLine();
        boolean isAgree = false;
        if(adsAgree.matches("1")){
            isAgree=true;
        }
        int age = (int)((CustomerValidation.nowDate.getTime() - birthDate.getTime())/(1000*60*60*24*365));
        customers.add(new Customer(id,name,age,birthDate,sex,isAgree));
    }

    @Override
    public void addProduct() {
        if(this.customers == null){
            System.out.println("상품을 등록하시려면, 회원을 선택 해주세요~~");
        }
        //숫자 검증 로직 추가해야함
        System.out.println("-------------------상품 등록 화면-----------------------");

        System.out.print("상품명을 입력해주세요 :");
        String productName = KeyBoardInput.scanner.nextLine();

        System.out.print("상품 가격을 입력해주세요 :");
        int price = ProductValidation.productPriceValidation(KeyBoardInput.scanner.nextLine());
        if(price == -1){
            return;
        }

        System.out.print("상품 카테고리를 지정해주세요 1. 의류, 2. 주방용품, 3. 전자기기 4. 뷰티");
        Category category = ProductValidation.categoryValidation(KeyBoardInput.scanner.nextLine());
        if(category == null){
            return;
        }

        System.out.print("등록할 총 수량을 입력해주세요");
        int totalCnt = ProductValidation.productQuantityValidation(KeyBoardInput.scanner.nextLine());
        if(totalCnt == -1){
            return;
        }

        Product newProduct = new Product(productName,price,category,totalCnt);
        this.products.add(newProduct);

        System.out.print("신규 상품 광고를 등록하시겠습니까? (1. 예, 아니시면 아무키나 눌러주세요)");
        if(KeyBoardInput.scanner.nextLine().equals("1")){
            newProductAdvertisement.addAds(newProduct);
        }
    }

    @Override
    public void addOrder() {
        if(this.customers == null){
            System.out.println("회원을 선택한 뒤 사용가능한 기능입니다.");
            return;
        }
        Order newOrder = new Order(++orderNum,this.curCustomer);
        addOrder:while (true) {
            System.out.println("-------------------주문 등록 페이지 -------------------------");
            System.out.print("상품 카테고리를 지정해주세요 1. 의류, 2. 주방용품, 3. 전자기기 4. 뷰티, 5. 돌아가기");
            String categoryInput = KeyBoardInput.scanner.nextLine();
            if(categoryInput.equals("5")){
                if(newOrder != null) orders.add(newOrder);
                return;
            }
            Category category = ProductValidation.categoryValidation(categoryInput);
            if (category == null) {
                return;
            }
            order:while (true) {

                System.out.println("1. 목록 보기, 2 주문할 상품 이름 입력, 3.돌아가기");

                String input = KeyBoardInput.scanner.nextLine();

                switch (input) {
                    case "1":
                        System.out.println(category.getCategoryName() + "의 상품 --------------------------");
                        PagenationShop.setInitProductPage(this.products, category);
                        break;
                    case "2":
                        Product orderProduct = findProductByName(KeyBoardInput.scanner.nextLine());
                        if (orderProduct == null) continue;
                        //validation 추가해야함
                        System.out.print("갯수를 선택해 주세요 :");
                        int quan = Integer.parseInt(KeyBoardInput.scanner.nextLine());
                        if(orderProduct.canOrder(quan)){
                            newOrder.addOrderItem(new OrderItem(orderProduct,newOrder,quan));
                            if(orderProduct.isEmpty()){
                                products.remove(orderProduct);
                            }
                        }else{
                            System.out.println("상품 갯수가 부족합니다. 갯수 확인 후 다시 입력해주세요");
                        }

                        break;
                    case "3":
                        break order;

                }
            }
        }


    }

    private Product findProductByName(String nextLine) {
        Collection<Product> findProducts = FindProductPolicy.findProductPolicyMap.get(1).findProduct(products, nextLine);
        if(findProducts != null){
            for (Product findproduct : findProducts) {
                if(findproduct.getProductName().equals(nextLine)){
                    return findproduct;
                }
            }
        }
        System.out.println("해당 상품은 존재하지 않습니다.");
        return null;
    }

    @Override
    public void showIdvOrder() {
        System.out.println("-------------------나의 주문 목록 보기 페이지------------------------");
        List<Order> myOrder = new ArrayList<>();
        for (Order order : orders) {
            if(order.isCurCustomerOrder(this.curCustomer)){
                myOrder.add(order);
            }
        }
        for(Order order: myOrder){
            order.showInfo();
        }

    }

    @Override
    @Testable
    public void findProduct() {


        Order newOrder = new Order(++orderNum,this.curCustomer);
        System.out.println("------------------------상품찾기------------------------------------");
        while (true) {
            System.out.print("상품명을 입력 해주세요 (q를 누르면 돌아갑니다.): ");
            String input = KeyBoardInput.scanner.nextLine();
            if("q".equals(input))return;
           // Collection<Product> product = FindProductPolicy.findProductPolicyMap.get(1).findProduct(products, input);
           // PagenationShop.setInitProductPage(product);
            //PagenationShop.showProducts(1);
            paging:while (true){
                System.out.println("1. 목록 보기, 2 주문할 상품 이름 입력, 3.돌아가기");

                String selectOption = KeyBoardInput.scanner.nextLine();

                switch (selectOption) {
                    case "1":
                        PagenationShop.setInitProductPage(this.products,input);
                        break;
                    case "2":
                        System.out.println("주문하실 상품의 이름을 입력해주세요");
                        Product orderProduct = findProductByName(KeyBoardInput.scanner.nextLine());
                        if (orderProduct == null) continue;
                        //validation 추가해야함
                        System.out.print("갯수를 선택해 주세요 :");
                        int quan = Integer.parseInt(KeyBoardInput.scanner.nextLine());
                        newOrder.addOrderItem(new OrderItem(orderProduct,newOrder,quan));
                        break;
                    case "3":
                        PagenationShop.selectSortProduct();
                        break;
                    case "4":
                        break paging;
                }
            }

        }

    }

    @Override
    public void selectUser() {
        System.out.println("---------------------고객 전환 화면------------------------");
        System.out.println("---------------------등록된 고객---------------------------");
        int cnt =1;
        for (Customer customer : customers) {
            customer.showIdAndName();
            cnt++;
            if(cnt %10 ==0){
                System.out.println();
            }
        }
        System.out.println("---------------------------------------------------------");

        String selectId ="";
        while (true) {
            System.out.print("전환 하실 고객 Id를 입력해주세요 (메인화면으로 돌아가시려면, q를 입력해주세요) :");
            selectId = KeyBoardInput.scanner.nextLine();

            if(findUserById(selectId) || "q".equals(selectId)){
                return;
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }

    private boolean findUserById(String selectId) {
        for (Customer customer : customers) {
            if(customer.getId().equals(selectId)){
                this.curCustomer = customer;
                return true;
            }
        }
        return false;
    }

    @Override
    public void showProductByCategory() {

        System.out.print("카테고리를 선택해주세요");
        System.out.print("상품 카테고리를 지정해주세요 1. 의류, 2. 주방용품, 3. 전자기기 4. 뷰티");
        Category category = ProductValidation.categoryValidation(KeyBoardInput.scanner.nextLine());
        if(category == null){
            return;
        }
    }


    private void setTestUserData(List<Customer> cus){
        for(int i=0; i<100;i++){
            cus.add(new Customer("testId"+i,"test"+i,(i+1%100),new Date(),i%2==0 ? "남":"여",i%3==0 ? true:false));
        }
    }
    private  void setTestProducts(List<Product> ps){
        for(int i=0; i<100;i++){

            ps.add(new Product("test"+i,(int)(Math.random()*10000000)+1,
                    Category.getCategory((int)(Math.random()*4)+1),(int)(Math.random()*1000)+1));
        }
    }

    @Override
    public void savestatistics() {
        //남녀 비율
        //가장 많이 팔린 카테고리 상품
        //사용자 나이


    }
}
