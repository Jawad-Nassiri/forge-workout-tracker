package com.jawad.forge.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "workout_muscle_group")
@Getter
@Setter
@IdClass(WorkoutMuscleGroupId.class)
public class WorkoutMuscleGroup {

    @Id
    @ManyToOne
    @JsonBackReference
    private Workout workout;

    @Id
    @ManyToOne
    @JsonBackReference
    private MuscleGroup muscleGroup;
}