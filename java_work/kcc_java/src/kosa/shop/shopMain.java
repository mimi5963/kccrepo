package kosa.shop;

import kosa.shop.shopmanager.ShopManager;
import kosa.shop.shopmanager.ShopManagerImpl;
import kosa.shop.util.KeyBoardInput;

public class shopMain {

    public static void main(String[] args) {
        ShopManager sm = preProcess();
        String input ="";
        System.out.println("-----------------------------안녕하세요 쇼핑몰 입니다.----------------------------");
        while (true){
            showMenu();
            input = KeyBoardInput.scanner.nextLine();
            switch (input){

                case "1":
                    sm.addCustomer();
                    break;

                case "2":
                    sm.selectUser();
                    break;

                case "3":
                    sm.addProduct();
                    break;

                case "4":
                    sm.showProductByCategory();
                    break;

                case "5":
                    sm.addOrder();
                    break;

                case "6":
                    sm.showIdvOrder();
                    break;

                case "7":
                    sm.findProduct();
                    break;

                    case "8":
                        sm.savestatistics();
                        return;

            }
        }

    }

    private static ShopManagerImpl preProcess(){
        ShopManagerImpl shopManagerimpl = new ShopManagerImpl();
        //데이터 미리 등록된 회원이랑, 물품들 읽어오고 싶어융..

        return shopManagerimpl;
    }
    private static void showMenu(){
        System.out.println("하고 싶은 작업을 선택해주세요~");
        System.out.println("1. 고객 등록,2. 유저 선택, 3. 상품 등록, 4. 카테고리 별 상품 보기, 5. 상품 주문, 6. 나의 주문 목록 보기,7. 상품 찾기, 8. 종료");
    }
}
