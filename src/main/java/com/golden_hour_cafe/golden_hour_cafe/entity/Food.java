package com.golden_hour_cafe.golden_hour_cafe.entity;

import com.golden_hour_cafe.golden_hour_cafe.entity.enums.FoodCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Currency;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="foods")
public class Food {
    @Id
    @Column(name = "food_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "food_category")
    private FoodCategory foodCategory;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private String price;

    @Column(name = "fav_status")
    private boolean favStatus;
}
