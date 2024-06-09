package kosa.shop.util;

import kosa.shop.domain.Category;

public class ProductValidation {
    private static boolean integerValidation(String target){
        return target.matches("[\\d]{1,}");
    }
    public static Category categoryValidation(String categoryNum){
        Category category = null;
        boolean isMatches = integerValidation(categoryNum);
        while (!isMatches ||
                (category = Category.getCategory(Integer.parseInt(categoryNum))) == null){

            System.out.println("카테고리를 잘못 지정하셨습니다. 다시 선택해주세요 1. 의류, 2. 주방용품, 3. 전자기기 4. 뷰티  (종료하시려면 q를 입력해주세요)");
            categoryNum = KeyBoardInput.scanner.nextLine();
            if("q".equals(categoryNum)){
                return null;
            }
            isMatches = integerValidation(categoryNum);
        }

        return category;
    }

    public static int productPriceValidation(String target) {
        boolean isMaches = integerValidation(target);
        while (!isMaches){
            System.out.println("물품 가격을 정수로 입력해주세요 (종료하시려면 q를 눌러주세요)");
            target = KeyBoardInput.scanner.nextLine();
            if("q".matches(target)){
                return -1;
            }
            isMaches = integerValidation(target);
        }
        return Integer.parseInt(target);
    }

    public static int productQuantityValidation(String target) {
        boolean isMaches = integerValidation(target);
        while (!isMaches){
            System.out.println("물품 수량을 정수로 입력해주세요 (종료하시려면 q를 눌러주세요)");
            target = KeyBoardInput.scanner.nextLine();
            if("q".matches(target)){
                return -1;
            }
            isMaches = integerValidation(target);
        }
        return Integer.parseInt(target);

    }
}
