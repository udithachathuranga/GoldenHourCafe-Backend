package com.golden_hour_cafe.golden_hour_cafe.dto;

import com.golden_hour_cafe.golden_hour_cafe.entity.enums.FoodCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Currency;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodDTO {
    private int id;
    private String name;
    private FoodCategory foodCategory;
    private String description;
    private String price;
    private boolean favourite_status;
}
