package com.jawad.forge.dto;

import java.time.LocalDate;

public record WorkoutResponseDTO(
        Integer id,
        LocalDate workoutDate,
        Integer  userId,
        Integer  workoutDayId
) {
}
