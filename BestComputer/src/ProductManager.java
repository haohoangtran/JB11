import java.util.List;

/**
 * Created by tranh on 05-Aug-16.
 */
public class ProductManager {
    private List<Product> listProduct;

    public ProductManager(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public Product findProduct(String productName) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(productName))
                return listProduct.get(i);
        }
        return null;
    }

    public boolean addProduct(Product prd) {
        return listProduct.add(prd);
    }

    public boolean removeProduct(String productId) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId().equals(productId)) {
                listProduct.remove(i);
                return true;

            }
        }
        return false;
    }

    public void sortProductByName() {
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = 0; j < listProduct.size(); j++) {
                if (listProduct.get(i).getName().compareTo(listProduct.get(j).getName())>0) {
                    Product product = listProduct.get(i);
                    listProduct.set(i,listProduct.get(j));
                    listProduct.set(j,product);
                }
            }
        }
    }

    public void sortByPrice() {
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = 0; j < listProduct.size(); j++) {
                if (listProduct.get(i).getPrice() > listProduct.get(j).getPrice()) {
                    Product product=listProduct.get(i);
                    listProduct.set(i,listProduct.get(j));
                    listProduct.set(j,product);
                }
            }

        }
    }

    public void showAllProduct() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i).toString());
        }
    }

}
