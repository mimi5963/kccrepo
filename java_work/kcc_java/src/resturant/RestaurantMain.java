package resturant;

public class RestaurantMain {
    public static void main(String[] args) {
        Order order = new Order();

        while (true){
            System.out.println("안녕하세요!");
            System.out.println("모드를 선택해주세요");
            printRole();
            String input =KeyBoardInput.sc.nextLine();
            switch (input){
                case "1":
                case "2":
                case "3": return;
            }
        }
    }

    private static void printRole(){
        System.out.println("1. 사장님, 2. 손님, 3. 종료하기");
    }
    private static void printOwnerMenu(){
        System.out.println("1. 신메뉴 추가, 2. 총 매출 합계, 3.돌아가기");
    }
    private static void printCustomerMenu(){
        System.out.println("1. 주문추가, 2.주문 삭제, 3.결제,4.돌아가기");
    }
}
