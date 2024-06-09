package kosa.shop.domain;

import java.util.Map;
import java.util.WeakHashMap;

public class Category {
    //카테고리는 여러 객체를 생성할 필요가 없음 싱글톤 고고
    // 메모리 단점 보완
    // 단점은 사용안해도 메모리에 남아있어야한다는점 -> WeakHashMap으로 보완
    // 그냥 때려 박지 않고, 요청할 때 없으면 새로 생성
    // 단점 -> 완전 싱글톤 보장 x (시리얼로 바꿀 때) , 손이 쫌 더 많이 감
    //의류,주방용품,가전제품,뷰티
    //카테고리가 하나라는 가정하에 사용 -> 2차 3차 카테고리가 있을 시 EnumSet을 활용하는게 더 현명한 선택일 것 같다.
    // 만약 카테고리가 있었다가 없어진다면? 그냥 그대로 두면 사라짐
    // 한번 도전해 본 것 자체 캐시 구현은 항상 좋지 않은 생각 weakHashMap 잘 봐보자
    //카테고리를 처음에 몇번 등록 후에 다음부턴 사용하지 한동안 쓰지 않을 때 혹은 카테고리가 삭제되었을 때 손쉽게 제거

    public static final String[] CATEGORY_NAMES = {"clothes","kitchen","IT","beauty"};
    //
    private static Map<Integer,Category> categoryCacheMap=new WeakHashMap<>();

    private static Category clothes;
    private static Category kitchen;
    private static Category IT;
    private static Category beauty;

    private final String categoryName;
    private final int categoryNum;

    private Category(String categoryName,int categoryNum){
        this.categoryName = categoryName;
        this.categoryNum =categoryNum;
    }
   public static Category getCategory(int categoryNum) {
       Category result = null;
        if(categoryNum-1 > CATEGORY_NAMES.length){
            return result;
        }
       result = categoryCacheMap.get(categoryNum - 1);
       if (result == null) {
            result = new Category(Category.CATEGORY_NAMES[categoryNum - 1], categoryNum - 1);
           categoryCacheMap.put(categoryNum - 1, result);

       }

       return result;
   }

    public String getCategoryName() {
        return categoryName;
    }


}
