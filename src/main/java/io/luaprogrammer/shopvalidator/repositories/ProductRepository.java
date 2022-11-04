package io.luaprogrammer.shopvalidator.repositories;

import io.luaprogrammer.shopvalidator.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByIdentifier(String identifier);
}
