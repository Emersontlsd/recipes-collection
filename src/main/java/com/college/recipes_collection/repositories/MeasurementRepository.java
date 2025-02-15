package com.college.recipes_collection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.recipes_collection.models.Measurement;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer>{
    
}
