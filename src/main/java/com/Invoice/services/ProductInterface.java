package com.Invoice.services;



import com.Invoice.models.Product;

import java.util.List;

public interface ProductInterface {
    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

}
