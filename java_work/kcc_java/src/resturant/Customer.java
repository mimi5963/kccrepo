package resturant;


import java.util.Scanner;

public class Customer {
    private int amount;
    private String name;
    private Menu[] myReceipts;
    private int receiptCount;
    private Scanner sc;

    public Customer() {
        sc = new Scanner(System.in);
        myReceipts = new Menu[10];
        receiptCount = 0;
    }

    public void addCustom() {
        System.out.print("잔액을 충전해주세요 : ");
        int amount = Integer.parseInt(sc.nextLine());
        setAmount(amount);

        System.out.println("고객 정보가 설정되었습니다: " + amount + "원");
    }

    public void order(Menu menu, Owner owner) {

        amount -= menu.getItem();

       // owner.addBalance(menu.getItem());

        myReceipts[receiptCount++] = menu;

        System.out.println("메뉴를 주문했습니다: " + menu.getName() + " ,  " + menu.getItem() + "원");


    }

    public void showReceipts() {
        System.out.println("=== 주문 내역 ===");
        for (int i = 0; i < receiptCount; i++) {
            System.out.println(myReceipts[i].getName() + " - " + myReceipts[i].getPrice() + "원");
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
