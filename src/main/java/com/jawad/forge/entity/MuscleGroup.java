package com.jawad.forge.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "muscle_group")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class MuscleGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "muscleGroup")
    @JsonManagedReference
    private List<Exercise> exercises;

    @OneToMany(mappedBy = "muscleGroup")
    @JsonManagedReference
    private List<WorkoutMuscleGroup> workoutMuscleGroups;
}
