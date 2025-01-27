package com.golden_hour_cafe.golden_hour_cafe.service.impl;

import com.golden_hour_cafe.golden_hour_cafe.dto.RecievationDTO;
import com.golden_hour_cafe.golden_hour_cafe.entity.Recievation;
import com.golden_hour_cafe.golden_hour_cafe.repo.RecievationRepo;
import com.golden_hour_cafe.golden_hour_cafe.service.RecievationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecievationServiceIMPL implements RecievationService {
    @Autowired
    RecievationRepo recievationRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveRecievation(RecievationDTO recievationDTO){
        Recievation recievation = modelMapper.map(recievationDTO, Recievation.class);
        try {
            recievationRepo.save(recievation);
            return "Saved";
        }catch (Exception ex) {
            System.err.println("Not Saved: " + ex.getMessage());
            return "General error";
        }
    }
}
