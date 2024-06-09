package kosa.shoptester;

import kosa.shop.domain.Category;
import kosa.shop.domain.Customer;
import kosa.shop.domain.Product;
import kosa.shop.shopmanager.ShopManagerImpl;
import kosa.shop.test.Testable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class ShopTester {
    //콘솔입력대신 아!!! 언제 시동걸릴지 내가 지정할 수 있지 !
    private static List<Customer> testCustomers = new ArrayList<>();
    private static List<Product> testProducts = new ArrayList<>();

    private static List<Method> testableMethod = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException {


       ShopManagerImpl shopManager =  preProcess();

        System.out.println("테스트 가능한 기능 목록");
        for (Method method : testableMethod) {
            System.out.println(method.getName());
        }





    }

    private static ShopManagerImpl preProcess() throws IllegalAccessException {


        ShopManagerImpl testShopManager = new ShopManagerImpl();
        Class<? extends ShopManagerImpl> shopManagerClazz = testShopManager.getClass();

        for (Field field : shopManagerClazz.getDeclaredFields()) {
            if(field.getName().equals("products")) {
                field.setAccessible(true);
                field.set(testShopManager, testProducts);
            }else if(field.getName().equals("customers")){
                field.setAccessible(true);
                field.set(testShopManager,testCustomers);
            }
        }

        for(Method m : shopManagerClazz.getDeclaredMethods()){
            Annotation[] annotations = m.getAnnotations();
            for (Annotation annotation : annotations) {
                if(annotation.annotationType().isAssignableFrom(Testable.class)){
                    testableMethod.add(m);
                }
            }
        }
        setTestProducts(100);
        setTestUserData(100);
        return testShopManager;
    }

    private static void setTestUserData(int n){
        for(int i=0; i<n;i++){
            testCustomers.add(new Customer("testId"+i,"test"+i,(i+1%100),new Date(),i%2==0 ? "남":"여",i%3==0 ? true:false));
        }
    }
    private static void setTestProducts(int n){
        for(int i=0; i<n;i++){

            testProducts.add(new Product("test"+i,(int)(Math.random()*10000000)+1,
                    Category.getCategory((int)(Math.random()*4)+1),(int)(Math.random()*1000)+1));
        }
    }
}
