package com.golden_hour_cafe.golden_hour_cafe.repo;

import com.golden_hour_cafe.golden_hour_cafe.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface DrinkRepo extends JpaRepository <Drink, Integer>{
    List<Drink> getDrinksByFavStatus(boolean fav_status);
}
