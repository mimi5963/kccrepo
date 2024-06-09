package kosa.shop.advertisement;

import kosa.shop.domain.Product;
import kosa.shop.shopmanager.ShopManagerImpl;

import java.util.Deque;
import java.util.LinkedList;

// 사용자한테는 새로운 상품 등록시 광고볼지
// 물품은 처음에 광고 때릴지 오케

public class NewProductAdvertisementImpl implements  NewProductAdvertisement{
    //첫 등장에는 newProductAdvertisement를 모두에게 보여주고, 상품 하나 등록되면 손님한테 바로 보여주고?ㅇ케
    private static NewProductAdvertisementImpl newProductAdvertisement;

    private Deque<Product> newProduct;

    private ShopManagerImpl shopManagerimpl;

    private NewProductAdvertisementImpl(){

    }
    private NewProductAdvertisementImpl(ShopManagerImpl shopManagerimpl){
        this.shopManagerimpl = shopManagerimpl;
        newProduct = new LinkedList<>();
        removeOldAds();
    }
    public static NewProductAdvertisement FromNewProductAdvertisementImpl(ShopManagerImpl shopManagerimpl){
        if(newProductAdvertisement == null){
            newProductAdvertisement = new NewProductAdvertisementImpl(shopManagerimpl);
        }
       return newProductAdvertisement;
    }


    private void removeOldAds() {
        Thread delteThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        if(!newProduct.isEmpty()){
                            newProduct.pollFirst();
                        }
                        Thread.sleep(1000*60*60);
                    } catch (InterruptedException e) {

                    }
                }
            }
        });
        delteThread.setDaemon(true);
        delteThread.start();
    }



    @Override
    public void notifyAllAds() {
        System.out.println("--------새로 등록된 상품들입니다.--------");
        int cnt = 0;
        while (cnt ++ < newProduct.size()){
            newProduct.peekLast().showInfo();
            newProduct.addFirst(newProduct.pollLast());
        }
        System.out.println("-------------------------------------");
    }

    @Override
    public void addAds(Product product) {
        newProduct.addLast(product);
        if(shopManagerimpl.isCurUserAgreeAds()){
            showNewProductAdd(product);
        }
    }

    private void showNewProductAdd(Product product) {
        System.out.println("********따끈따끈 방금 등록된 신상품입니다*******");
        product.showInfo();
        System.out.println("*************************************");
    }
}
