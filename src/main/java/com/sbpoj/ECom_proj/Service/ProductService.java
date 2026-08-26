package com.sbpoj.ECom_proj.Service;

import com.sbpoj.ECom_proj.Model.Product;
import com.sbpoj.ECom_proj.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;
import java.time.format.*;
import java.nio.*;
import java.nio.file.*;
import java.text.*;


@Service
public class ProductService {


    @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById((long) id).orElse(new Product());
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return repo.save(product);
    }
}
