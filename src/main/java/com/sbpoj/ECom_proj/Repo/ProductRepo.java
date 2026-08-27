package com.sbpoj.ECom_proj.Repo;

import com.sbpoj.ECom_proj.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//  We have to use ProductRepo as a interface because if we had used class then save() find () ye sab code manually llikhna padta hamein

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

    //JPQL - Instead of querying relational database tables and columns directly (like standard SQL), JPQL queries Java Entity classes and their attributes.

    @Query("SELECT p FROM Product p WHERE " +
            "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Product> searchProduct(String keyword);
}
