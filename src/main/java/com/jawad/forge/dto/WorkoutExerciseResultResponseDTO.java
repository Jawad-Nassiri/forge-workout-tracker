package com.jawad.forge.dto;

import java.math.BigDecimal;

public record WorkoutExerciseResultResponseDTO(
        Integer id,
        Integer sets,
        Integer reps,
        BigDecimal weight,
        Integer workoutId,
        Integer exerciseId
) {
}
