package com.golden_hour_cafe.golden_hour_cafe.controller;

import com.golden_hour_cafe.golden_hour_cafe.dto.FoodDTO;
import com.golden_hour_cafe.golden_hour_cafe.entity.enums.FoodCategory;
import com.golden_hour_cafe.golden_hour_cafe.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/foods/")
public class FoodController {

    @Autowired
    FoodService foodService;

    @GetMapping("/getfoods/{category}")
    public List<FoodDTO> GetFoodByCategory(@PathVariable FoodCategory category){
        return foodService.getFoodByCategory(category);
    }

    @GetMapping("/getfavouritefoods")
    public List<FoodDTO> GetFavouriteFoods(){
        return foodService.getFavouriteFoods();
    }
}
