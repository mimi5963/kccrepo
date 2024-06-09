package kosa.shop.shopmanager;

import kosa.shop.domain.Customer;

public interface ShopManager {
    public void categoryList();
    public void addCustomer();
    public void addProduct();
    public void addOrder();

    public void showIdvOrder();
    public void findProduct();
    public void selectUser();


    void showProductByCategory();

    void savestatistics();
}
