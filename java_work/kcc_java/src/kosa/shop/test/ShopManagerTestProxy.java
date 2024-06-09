package kosa.shop.test;

import kosa.shop.domain.Customer;
import kosa.shop.shopmanager.ShopManager;
import kosa.shop.shopmanager.ShopManagerImpl;

public class ShopManagerTestProxy implements ShopManager {
    private final ShopManagerImpl shopManagerimpl;
    public ShopManagerTestProxy(ShopManagerImpl shopManagerimpl){
        this.shopManagerimpl = shopManagerimpl;
    }

    @Override
    public void categoryList() {

    }

    @Override
    public void addCustomer() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void addOrder() {

    }

    @Override
    public void showIdvOrder() {

    }

    @Override
    public void findProduct() {
//        System.out.println(System.currentTimeMillis());
//        shopManagerimpl.findProduct(name);
//        System.out.println(System.name);
    }

    @Override
    public void selectUser() {

    }

    @Override
    public void showProductByCategory() {

    }
}
