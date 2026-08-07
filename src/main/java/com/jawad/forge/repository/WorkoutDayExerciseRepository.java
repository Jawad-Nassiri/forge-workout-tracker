package com.jawad.forge.repository;

import com.jawad.forge.entity.WorkoutDayExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutDayExerciseRepository extends JpaRepository<WorkoutDayExercise, Integer> {
}
