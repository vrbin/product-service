package org.example;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductJpaRepository extends JpaRepository<Product, Long> {
}
