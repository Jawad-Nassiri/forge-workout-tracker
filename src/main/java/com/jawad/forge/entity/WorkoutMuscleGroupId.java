package com.jawad.forge.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@EqualsAndHashCode
public class WorkoutMuscleGroupId implements Serializable {
    private Integer workout;
    private Integer muscleGroup;
}
