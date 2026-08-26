package com.sbpoj.ECom_proj.Repo;

import com.sbpoj.ECom_proj.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//  We have to use ProductRepo as a interface because if we had used class then save() find () ye sab code manually llikhna padta hamein

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

}
