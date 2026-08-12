package com.jawad.forge.repository;

import com.jawad.forge.entity.WorkoutMuscleGroup;
import com.jawad.forge.entity.WorkoutMuscleGroupId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutMuscleGroupRepository extends JpaRepository<WorkoutMuscleGroup, WorkoutMuscleGroupId> {
}
