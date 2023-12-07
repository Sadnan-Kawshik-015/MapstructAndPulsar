package com.example.PulsarAndMapstructDemo.Service;

import com.example.PulsarAndMapstructDemo.DTO.ProductDTO;
import com.example.PulsarAndMapstructDemo.Entity.Product;
import com.example.PulsarAndMapstructDemo.Mapper.ProductMapper;
import com.example.PulsarAndMapstructDemo.Repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;
    public ProductDTO getProductById(String productId) {
        try {
            Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException(
                    "product not found!"));

            return dto;
        } catch (Exception e) {
            throw e;
        }
        return null;
    }
    public ProductDTO getProductById(String productId) {
        try {
            Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException(
                    "product not found!"));

            return dto;
        } catch (Exception e) {
            throw e;
        }
        return null;
    }
}
