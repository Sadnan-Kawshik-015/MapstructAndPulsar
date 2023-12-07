package com.example.PulsarAndMapstructDemo.Repositories;

import com.example.PulsarAndMapstructDemo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
}
