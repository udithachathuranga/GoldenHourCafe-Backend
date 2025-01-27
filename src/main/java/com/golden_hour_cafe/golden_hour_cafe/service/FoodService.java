package com.golden_hour_cafe.golden_hour_cafe.service;

import com.golden_hour_cafe.golden_hour_cafe.dto.FoodDTO;
import com.golden_hour_cafe.golden_hour_cafe.entity.enums.FoodCategory;

import java.util.List;

public interface FoodService {
    List<FoodDTO> getFoodByCategory(FoodCategory foodCategory);
    List<FoodDTO> getFavouriteFoods();
}
