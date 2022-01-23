package by.alexrom.pavel.DZ16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop implements ShopOptions {

    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> addProduct(Product product) {
        if(products.isEmpty()) {
            products.add(product);
        }
        if(!check(product.getId())) {
            products.add(product);
        }
        return products;
    }

    private boolean check(int prId) {
        for(Product product : products) {
            int id = product.getId();
            if(id == prId) {
                return true;
            }
        }
        return false;
    }

    List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    List<Product> removeProductById(int id) {
        int count = 0;
        for(int i = 0; i < products.size(); i++) {
            int id1 = products.get(i).getId();
            if(id1 == id) {
                products.remove(count);
            }
            count++;
        }
        return products;
    }

    List<Product> compareProductByPrice() {
        List<Product> m = new ArrayList<>(getAllProducts());
        m.sort(Comparator.comparingInt(Product::getPrice));
        return m;
    }

    List<Product> changePrice(Product pr, int setPrice) {
        //        List<Product> list = new ArrayList<>(getAllProducts());
        for(Product product : getAllProducts()) {
            int id1 = product.getId();
            if(id1 == pr.getId()) {
                product.setPrice(setPrice);
            }
        }
        return getAllProducts();
    }
}
