package com.golden_hour_cafe.golden_hour_cafe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecievationDTO {
    private int id;
    private String name;
    private String email;
    private String contactNumber;
    private Date date;
    private LocalTime time;
    private int numberOfGuests;
}
