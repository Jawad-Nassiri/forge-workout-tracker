package com.jawad.forge.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "workout_day_exercise")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class WorkoutDayExercise {
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    @JsonBackReference
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name = "workout_day_id")
    @JsonBackReference
    private WorkoutDay workoutDay;
}
