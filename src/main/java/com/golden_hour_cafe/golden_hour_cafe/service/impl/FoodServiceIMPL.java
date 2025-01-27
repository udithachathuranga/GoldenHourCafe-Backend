package com.golden_hour_cafe.golden_hour_cafe.service.impl;

import com.golden_hour_cafe.golden_hour_cafe.dto.FoodDTO;
import com.golden_hour_cafe.golden_hour_cafe.entity.Food;
import com.golden_hour_cafe.golden_hour_cafe.entity.enums.FoodCategory;
import com.golden_hour_cafe.golden_hour_cafe.exception.NotFoundException;
import com.golden_hour_cafe.golden_hour_cafe.repo.FoodRepo;
import com.golden_hour_cafe.golden_hour_cafe.service.FoodService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceIMPL implements FoodService {
    @Autowired
    private FoodRepo foodRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<FoodDTO> getFoodByCategory(FoodCategory foodCategory) {
        List<Food> foodList = foodRepo.findAllByFoodCategory(foodCategory);
        if(foodList.size()>0) {
            return modelMapper.map(foodList, new TypeToken<List<Food>>() {}.getType());
        }else {
            throw new NotFoundException("No Foods Found...!!");
        }
    }

    @Override
    public List<FoodDTO> getFavouriteFoods() {
        List<Food> foodList = foodRepo.findAllByFavStatus(true);
        if(foodList.size()>0) {
            return modelMapper.map(foodList, new TypeToken<List<Food>>() {
            }.getType());
        }else {
            throw new NotFoundException("No Foods Found...!!");
        }
    }
}
