package kosa.shop.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product implements Comparable<Product>{
    private String productName;
    private int price;
    private Date reg;
    private Category category;
    private int totalCount;

    private static DateFormat dateFormat;
    static {
        dateFormat = new SimpleDateFormat("YYYY년 MM월 dd일");
    }

    public Product(){}
    public Product(String productName, int price,Category category,int totalCount){
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.reg = new Date();
        this.totalCount = totalCount;
    }
    public String getProductName(){
        return this.productName;
    }
    public int getPrice(){
        return this.price;
    }
    public  Category getCategory(){return this.category;}
    public Date getRegDate(){return this.reg;}
    public int getTotalCount(){
        return this.totalCount;
    }
    public void setTotalCount(int totalCount){
        this.totalCount = totalCount;
    }

    @Override
    public int compareTo(Product o) {
        //기본 정렬 기준은 이름순
        return productName.compareTo(o.productName);
    }

    public void showInfo() {

//        System.out.println("상품명 : "+productName);
//        System.out.println("가격 : "+price);
//        System.out.println("상품 등록일 : "+dateFormat.format(this.reg));
//        System.out.println("카테고리 : "+this.category.getCategoryName());
//        System.out.println("남은 수량 : "+this.totalCount);

        System.out.print("상품명"+this.productName+"[가격:"+this.price+",상품등록일:"+dateFormat.format(this.reg)+"카테고리:"+this.category.getCategoryName()+"남은수량:"+this.totalCount+"]");

    }

    @Override
    public String toString() {
        return productName+"{"+
                "\n price=" + price +
                "\n reg=" + reg +
                "\n category=" + category.getCategoryName() +
                "\n totalCount=" + totalCount +
                '}';
    }

    public boolean canOrder(int orderCnt) {
        if(this.totalCount-orderCnt < 0){
            return false;
        }
        this.totalCount-=orderCnt;
        return true;
    }

    public boolean isEmpty() {
        return this.totalCount ==0;
    }
}
