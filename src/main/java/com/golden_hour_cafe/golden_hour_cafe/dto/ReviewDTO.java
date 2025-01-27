package com.golden_hour_cafe.golden_hour_cafe.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private Date date;
    private String comment;

}


