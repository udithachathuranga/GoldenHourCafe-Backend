package com.golden_hour_cafe.golden_hour_cafe.controller;

import com.golden_hour_cafe.golden_hour_cafe.dto.DrinkDTO;
import com.golden_hour_cafe.golden_hour_cafe.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/drinks/")
public class DrinkController {
    @Autowired
    DrinkService drinkService;

    @GetMapping("/getfavouritedrinks")
    public List<DrinkDTO> GetFavoutiteDrinks(){
        return drinkService.getFavouriteDrinks();
    }
}
