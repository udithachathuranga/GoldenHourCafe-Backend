package com.golden_hour_cafe.golden_hour_cafe.controller;

import com.golden_hour_cafe.golden_hour_cafe.dto.RecievationDTO;
import com.golden_hour_cafe.golden_hour_cafe.service.RecievationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/recievations/")
public class RecievationController {
    @Autowired
    RecievationService recievationService;
    //saverecievation
    //deleterecievation
    //updaterecievation

    @PostMapping("/addrecivation")
    public String saveRecievation(@RequestBody RecievationDTO recievationDTO){
        return recievationService.saveRecievation(recievationDTO);
    }
}
