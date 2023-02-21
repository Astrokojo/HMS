package com.Invoice.services;

import com.Invoice.models.Product;
import com.Invoice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImplementation implements ProductInterface {
    @Autowired
    private ProductRepo repo;
    @Override
    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return repo.findById(id)
                .map(newProduct -> {
                    product.setName(product.getName());
                    product.setDescription(product.getDescription());
                    product.setPrice(product.getPrice());
                    product.setCategory(product.getCategory());
                    return repo.save(newProduct);
                        }).orElseGet(() -> {
                            return repo.save(product);
                        });

    }

    @Override
    public void deleteProduct(Long id) {

    }
}
