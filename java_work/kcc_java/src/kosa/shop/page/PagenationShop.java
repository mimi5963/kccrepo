package kosa.shop.page;

import kosa.shop.domain.Category;
import kosa.shop.domain.Product;
import kosa.shop.util.KeyBoardInput;
import kosa.shop.util.findpolicy.FindProductPolicy;
import kosa.shop.util.sortstrategy.ProductSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import java.util.List;

/// 현재 페이지 1/17 마지막페이지 ->페이지 입력하면 거기부터 쭉 보여줌

public class PagenationShop {
    private static int pageNo;
    private static int endPage;
    private static int startElements=1;
    private static int stopElemnets;
    private static final int SHOW_NEXT_PAGE =10;
    private static int totalElement;
    private static Collection<Product> collection;
    private static List<Product> products;
    public static void showProducts(int page){

        if(page > endPage || page <0){
            System.out.println("페이지 번호를 다시 확인해보세요");
            return;
        }
        startElements = (page-1)*SHOW_NEXT_PAGE;
        stopElemnets = startElements+SHOW_NEXT_PAGE;
        if(stopElemnets > collection.size()){
            stopElemnets = collection.size();
        }
        if(stopElemnets <0){
            stopElemnets =0;
        }
        for(int i=startElements; i<stopElemnets;i++){
            ((ArrayList<Product>)collection).get(i).showInfo();
            System.out.println();
        }
        System.out.println();
        System.out.print("현재 페이지 "+page+"/"+"마지막페이지"+endPage);
        System.out.println();

    }

    public static void selectPage(){
        int page=0;
        while (true){
            System.out.print("페이지를 선택해주세요 : ");
            page = Integer.parseInt(KeyBoardInput.scanner.nextLine());
            if(page > endPage || page <0){
                System.out.println("페이지 번호를 다시 확인해보세요");
                continue;
            }else  break;
        }
        pageNo = page;
        showProducts(page);
    }
    public  static void setInitProductPage(Collection<Product> products, Category category){
        collection = (FindProductPolicy.findProductPolicyMap.get(3).findProduct(products,category));
//        totalElement = collection.size();
//        endPage = (totalElement/SHOW_NEXT_PAGE)+1;
//        startElements=0;
//        pageNo = 1;
        setInitProductPageElements(collection);
        showProducts(pageNo);
        selectOption();

    }
    private static void selectOption(){
        while (true){
            System.out.println("1.페이지 선택, 2.정렬하기, 3.돌아가기");
            String input = KeyBoardInput.scanner.nextLine();
            switch (input){
                case"1": selectPage();
                    break;
                case"2":
                    selectSortProduct();
                    break;
                case "3":return;
            }
        }
    }
    public  static void setInitProductPage(Collection<Product> products,String target){
        collection =  FindProductPolicy.findProductPolicyMap.get(1).findProduct(products, target);
//        totalElement = collection.size();
//        endPage = (totalElement/SHOW_NEXT_PAGE)+1;
//        startElements=0;
//        pageNo = 1;
        setInitProductPageElements(collection);
        showProducts(pageNo);
        selectOption();

    }
    private static void setInitProductPageElements(Collection<Product> collection){
        totalElement = collection.size();
        endPage = (totalElement/SHOW_NEXT_PAGE)+1;
        startElements=0;
        pageNo = 1;

    }
    public static void showCustomer(){

    }



    public static void selectSortProduct() {
        System.out.println("정렬 기준을 선택해주세요 1,이름순, 2.높은가격순 ,3.낮은가격순,4.등록일순");
        String input = KeyBoardInput.scanner.nextLine();
        collection = ProductSort.productSortMap.get(Integer.parseInt(input)).sortProduct(collection);
        showProducts(1);

    }
}
