package kosa.shop.domain;

import java.util.Date;

public class Customer {
    private String id;
    private String name;
    private int age;
    private Date birth; //이거 파싱하는거 캐싱가능
    private String sex; //추후 enum으로 바꾸자 -> 코드 줄일 수 있음 //남여는 1,2로도 판단대자나

    private boolean agreeToAds;

    public Customer(){}

    public Customer(String id, String name, int age, Date birth, String sex, boolean agreeToAds) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.sex = sex;
        this.agreeToAds = agreeToAds;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Date getBirth(){
        return this.birth;
    }
    public String getId(){
        return this.id;
    }
    public void setAgreeToAds(boolean isAgree){
        this.agreeToAds = isAgree;
    }
    public boolean getAgreeToAds(){
        return this.agreeToAds;
    }


    public void showIdAndName() {
        System.out.print(this.id+", "+this.name+" ");
    }
}
