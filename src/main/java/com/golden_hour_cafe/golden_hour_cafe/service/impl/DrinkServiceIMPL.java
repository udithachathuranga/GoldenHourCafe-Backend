package com.golden_hour_cafe.golden_hour_cafe.service.impl;

import com.golden_hour_cafe.golden_hour_cafe.dto.DrinkDTO;
import com.golden_hour_cafe.golden_hour_cafe.entity.Drink;
import com.golden_hour_cafe.golden_hour_cafe.entity.Food;
import com.golden_hour_cafe.golden_hour_cafe.exception.NotFoundException;
import com.golden_hour_cafe.golden_hour_cafe.repo.DrinkRepo;
import com.golden_hour_cafe.golden_hour_cafe.service.DrinkService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkServiceIMPL implements DrinkService {

    @Autowired
    private DrinkRepo drinkRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<DrinkDTO> getFavouriteDrinks(){
        List<Drink> drinkList = drinkRepo.getDrinksByFavStatus(true);
        if(drinkList.size()>0) {
            return modelMapper.map(drinkList, new TypeToken<List<DrinkDTO>>() {
            }.getType());
        }else {
            throw new NotFoundException("No Drinks Found...!!");
        }
    }
}
