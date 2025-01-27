package com.golden_hour_cafe.golden_hour_cafe.controller;

import com.golden_hour_cafe.golden_hour_cafe.dto.ReviewDTO;
import com.golden_hour_cafe.golden_hour_cafe.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/reviews/")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/savereview")
    public String saveReview(@RequestBody ReviewDTO reviewDTO){
        return reviewService.saveReview(reviewDTO);
    }

    @GetMapping("/getreviews")
    public List<ReviewDTO> getReviews(){
        return reviewService.getAllReviews();
    }
}
