package com.jawad.forge.repository;

import com.jawad.forge.entity.WorkoutDayExercise;
import com.jawad.forge.entity.WorkoutDayExerciseId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutDayExerciseRepository extends JpaRepository<WorkoutDayExercise, WorkoutDayExerciseId> {
}
