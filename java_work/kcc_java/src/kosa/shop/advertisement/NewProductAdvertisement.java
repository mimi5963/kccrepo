package kosa.shop.advertisement;

import kosa.shop.domain.Product;

public interface NewProductAdvertisement {


    void notifyAllAds();
    void addAds(Product product);

}
