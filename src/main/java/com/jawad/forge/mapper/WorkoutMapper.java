package com.jawad.forge.mapper;

import com.jawad.forge.dto.WorkoutRequestDTO;
import com.jawad.forge.dto.WorkoutResponseDTO;
import com.jawad.forge.entity.User;
import com.jawad.forge.entity.Workout;
import com.jawad.forge.entity.WorkoutDay;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class WorkoutMapper {
    public Workout toEntity(WorkoutRequestDTO dto, User user, WorkoutDay workoutDay) {
        Workout workout = new Workout();
        workout.setWorkoutDate(LocalDate.now());
        workout.setUser(user);
        workout.setWorkoutDay(workoutDay);
        return workout;
    }

    public WorkoutResponseDTO toResponse(Workout workout) {
        return new WorkoutResponseDTO(
                workout.getId(),
                workout.getWorkoutDate(),
                workout.getUser().getId(),
                workout.getWorkoutDay().getId()
        );
    }
}

