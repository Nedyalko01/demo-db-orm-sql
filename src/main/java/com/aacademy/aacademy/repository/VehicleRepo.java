package com.aacademy.aacademy.repository;

import com.aacademy.aacademy.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Cars, Long> {
}
