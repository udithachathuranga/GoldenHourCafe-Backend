package com.golden_hour_cafe.golden_hour_cafe.repo;

import com.golden_hour_cafe.golden_hour_cafe.entity.Food;
import com.golden_hour_cafe.golden_hour_cafe.entity.enums.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface FoodRepo extends JpaRepository<Food, Integer> {
    List<Food> findAllByFoodCategory(FoodCategory foodCategory);
    List<Food> findAllByFavStatus(boolean favStatus);
}
