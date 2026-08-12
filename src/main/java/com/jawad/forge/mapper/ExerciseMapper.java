package com.jawad.forge.mapper;

import com.jawad.forge.dto.ExerciseRequestDTO;
import com.jawad.forge.dto.ExerciseResponseDTO;
import com.jawad.forge.entity.Exercise;
import com.jawad.forge.entity.MuscleGroup;
import org.springframework.stereotype.Component;

@Component
public class ExerciseMapper {
    public Exercise toEntity(ExerciseRequestDTO dto, MuscleGroup muscleGroup) {
        Exercise exercise = new Exercise();

        exercise.setName(dto.name());
        exercise.setMuscleGroup(muscleGroup);

        return exercise;
    }

    public ExerciseResponseDTO toResponse(Exercise exercise) {
        return new ExerciseResponseDTO(
                exercise.getId(),
                exercise.getName(),
                exercise.getMuscleGroup().getId()
        );
    }

    public void updateEntity(Exercise exercise, ExerciseRequestDTO dto) {
        exercise.setName(dto.name());
    }
}
