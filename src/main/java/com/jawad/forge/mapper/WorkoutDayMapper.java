package com.jawad.forge.mapper;

import com.jawad.forge.dto.WorkoutDayRequestDTO;
import com.jawad.forge.dto.WorkoutDayResponseDTO;
import com.jawad.forge.entity.WorkoutDay;
import org.springframework.stereotype.Component;

@Component
public class WorkoutDayMapper {
    public WorkoutDay toEntity(WorkoutDayRequestDTO dto) {
        WorkoutDay workoutDay = new WorkoutDay();
        workoutDay.setName(dto.name());
        return workoutDay;
    }

    public WorkoutDayResponseDTO toResponse(WorkoutDay workoutDay) {
        return new WorkoutDayResponseDTO(
                workoutDay.getId(),
                workoutDay.getName()
        );
    }
}
