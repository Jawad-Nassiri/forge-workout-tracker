package com.jawad.forge.mapper;

import com.jawad.forge.dto.WorkoutExerciseResultRequestDTO;
import com.jawad.forge.dto.WorkoutExerciseResultResponseDTO;
import com.jawad.forge.entity.Exercise;
import com.jawad.forge.entity.Workout;
import com.jawad.forge.entity.WorkoutExerciseResult;
import org.springframework.stereotype.Component;

@Component
public class WorkoutExerciseResultMapper {
    public WorkoutExerciseResult toEntity(WorkoutExerciseResultRequestDTO dto, Workout workout, Exercise exercise) {
        WorkoutExerciseResult workoutExerciseResult = new WorkoutExerciseResult();

        workoutExerciseResult.setSets(dto.sets());
        workoutExerciseResult.setReps(dto.reps());
        workoutExerciseResult.setWeight(dto.weight());
        workoutExerciseResult.setWorkout(workout);
        workoutExerciseResult.setExercise(exercise);

        return workoutExerciseResult;
    }

    public WorkoutExerciseResultResponseDTO toResponse(WorkoutExerciseResult workoutExerciseResult) {
        return new WorkoutExerciseResultResponseDTO(
                workoutExerciseResult.getId(),
                workoutExerciseResult.getSets(),
                workoutExerciseResult.getReps(),
                workoutExerciseResult.getWeight(),
                workoutExerciseResult.getWorkout().getId(),
                workoutExerciseResult.getExercise().getId()
        );
    }

    public void updateEntity(WorkoutExerciseResult workoutExerciseResult, WorkoutExerciseResultRequestDTO dto) {
        workoutExerciseResult.setSets(dto.sets());
        workoutExerciseResult.setReps(dto.reps());
        workoutExerciseResult.setWeight(dto.weight());
    }

}
