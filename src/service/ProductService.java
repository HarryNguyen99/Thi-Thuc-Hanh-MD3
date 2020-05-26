package service;

import model.Product;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService extends ConnectionJDBC implements ProductITF {
    @Override
    public List<Product> selectTableProduct() {
        List<Product> listProduct = new ArrayList<>();
        String query = "{call selectTableSP()}";
        Connection connection = getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall(query);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                int idSP= rs.getInt("idSanPham");
                String tenSP = rs.getString("TenSP");
                int Gia = rs.getInt("Gia");
                int SoLuong = rs.getInt("SoLuong");
                String MauSac = rs.getString("MauSac");
                String MoTa = rs.getString("MoTa");
                String TenDM = rs.getString("TenDM");
                listProduct.add(new Product(idSP, tenSP, Gia, SoLuong, MauSac, MoTa, TenDM));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listProduct;
    }

    @Override
    public void insertProduc(Product product) {
        String query = "{call insertTableSP(?,?, ?, ?, ?, ?,?)}";


        try (Connection connection = getConnection();
             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setInt(1, product.getId());
            callableStatement.setString(2, product.getTenSP());
            callableStatement.setInt(3, product.getGia());
            callableStatement.setString(4, product.getMauSac());
            callableStatement.setString(5, product.getMoTa());
            callableStatement.setInt(6, product.getIdDM());
            callableStatement.executeUpdate();
        } catch (SQLException ex) {
            printSQLException(ex);
        }
    }

    @Override
    public Product getProductById(int id) {
        Product product = null;

        String query = "{call get_product_by_id(?)}";
        try (Connection connection = getConnection();
             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setInt(1, id);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                String tenSP = rs.getString("TenSP");
                int Gia = rs.getInt("Gia");
                int SoLuong = rs.getInt("SoLuong");
                String mau = rs.getString("MauSac");
                String mota = rs.getString("MoTa");
                int idDAnhMuc = rs.getInt("idDanhMuc");
                product = new Product(id, tenSP, Gia, SoLuong, mau, mota, idDAnhMuc);

            }

        } catch (SQLException e) {

            printSQLException(e);

        }

        return product;
    }

    @Override
    public void editTableProduct(Product product) {
        String query = "{call edit_table_product(?,?,?,?,?,?);}";
        try (Connection connection = getConnection();

             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setInt(1, product.getId());
            callableStatement.setString(2, product.getTenSP());
            callableStatement.setInt(3, product.getGia());
            callableStatement.setInt(4, product.getSoLuong());
            callableStatement.setString(5, product.getMauSac());
            callableStatement.setString(6, product.getMoTa());
            callableStatement.setInt(7, product.getIdDM());

            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteProduct(int id) {
        String query = "{call delete_Product(?)}";
        try (Connection connection = getConnection();

             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setInt(1, id);

            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

