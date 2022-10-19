//package com.ecommerce.microcommerce.dao;
//
//import com.ecommerce.microcommerce.model.Product;
//import org.apache.catalina.connector.Response;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Repository
//public class ProductDaoImpl implements ProductDao{
//
//    public static List<Product> products = new ArrayList<>();
//
//    static {
//        products.add(new Product(1, "Ordinateur portable", 350, 500));
//        products.add(new Product(2, "Aspirateur Robot", 500, 600));
//        products.add(new Product(3, "Table de Ping Pong", 750, 350));
//    }
//
//
//
//    @Override
//    public List<Product> findAll() {
//        return products;
//    }
//
//    @Override
//    public Product findById(int id) {
//        for (Product product : products){
//            if (product.getId() == id){
//                return product;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Product save(Product product) {
//        products.add(product);
//        return product;
//    }
//
//    @Override
//    public Product delete(int id) {
//        for(Product product : products) {
//            if (product.getId() == id) {
//                products.remove(product);
//                return null;
//            }
//        }
//        return null;
//    }
//
//
//
//}
