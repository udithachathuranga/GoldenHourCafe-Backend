package com.golden_hour_cafe.golden_hour_cafe.service.impl;

import com.golden_hour_cafe.golden_hour_cafe.dto.ReviewDTO;
import com.golden_hour_cafe.golden_hour_cafe.entity.Food;
import com.golden_hour_cafe.golden_hour_cafe.entity.Review;
import com.golden_hour_cafe.golden_hour_cafe.exception.NotFoundException;
import com.golden_hour_cafe.golden_hour_cafe.repo.ReviewRepo;
import com.golden_hour_cafe.golden_hour_cafe.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceIMPL implements ReviewService {
    @Autowired
    ReviewRepo reviewRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveReview(ReviewDTO reviewDTO){
        try {
            reviewRepo.save(modelMapper.map(reviewDTO, Review.class));
            return "saved";
        }catch (Exception ex) {
            System.err.println("Not Saved: " + ex.getMessage());
            return "General error";
        }
    }

    @Override
    public List<ReviewDTO> getAllReviews() {
        List<Review> reviews = reviewRepo.findAll();
        if(reviews.size()>0) {
            return modelMapper.map(reviews, new TypeToken<List<ReviewDTO>>() {
            }.getType());
        }else {
            throw new NotFoundException("No Reviews Found...!!");
        }
    }
}
