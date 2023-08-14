package org.example;

import org.example.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService {
    private ProductJpaRepository productJpaRepository;
    @Autowired
    public ProductService (ProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    public void addProduct(Product prod) {
        System.out.println("Pridavam produkt s id " + prod.getId() + " s nazvem " + prod.getName());
        productJpaRepository.save(prod);
    }
    public Product getProductById(long id) {
        return productJpaRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundException("Produkt nenalezen.")
        );
    }
    public List<Product> getProducts() {
        return productJpaRepository.findAll();
    }
    public long count() {
        return productJpaRepository.count();
    }}
