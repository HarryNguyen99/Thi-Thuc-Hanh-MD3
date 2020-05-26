package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductITF {
    public List<Product> selectTableProduct();
    public void insertProduc(Product product) throws SQLException;
    public Product getProductById(int id);
    public void editTableProduct(Product product);
    public  void deleteProduct(int id);
}
