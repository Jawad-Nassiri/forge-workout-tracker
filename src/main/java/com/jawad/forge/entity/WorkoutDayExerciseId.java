package com.jawad.forge.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@EqualsAndHashCode
public class WorkoutDayExerciseId implements Serializable {

    private Integer workoutDay;
    private Integer exercise;
}
