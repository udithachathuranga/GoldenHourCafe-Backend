package com.golden_hour_cafe.golden_hour_cafe.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkDTO {
    private int id;
    private String name;
    private String description;
    private String price;
    private boolean favourite_status;
}
