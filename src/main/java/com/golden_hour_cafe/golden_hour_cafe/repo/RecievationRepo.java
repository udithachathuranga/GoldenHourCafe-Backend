package com.golden_hour_cafe.golden_hour_cafe.repo;

import com.golden_hour_cafe.golden_hour_cafe.entity.Recievation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface RecievationRepo extends JpaRepository<Recievation,Integer> {
}
