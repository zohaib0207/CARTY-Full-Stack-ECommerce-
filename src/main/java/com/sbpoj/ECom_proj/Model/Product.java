package com.sbpoj.ECom_proj.Model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // <-- 'int' ki jagah 'Integer'

    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private Boolean productAvailable; // <-- 'boolean' ki jagah 'Boolean'
    private Integer stockQuantity;    // <-- 'int' ki jagah 'Integer'

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;
}