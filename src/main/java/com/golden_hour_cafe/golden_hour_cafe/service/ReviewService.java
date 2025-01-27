package com.golden_hour_cafe.golden_hour_cafe.service;

import com.golden_hour_cafe.golden_hour_cafe.dto.ReviewDTO;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface ReviewService {
    String saveReview(ReviewDTO reviewDTO);
    List<ReviewDTO> getAllReviews();
}
