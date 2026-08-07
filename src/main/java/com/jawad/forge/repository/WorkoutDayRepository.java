package com.jawad.forge.repository;

import com.jawad.forge.entity.WorkoutDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutDayRepository extends JpaRepository<WorkoutDay, Integer> {
}
