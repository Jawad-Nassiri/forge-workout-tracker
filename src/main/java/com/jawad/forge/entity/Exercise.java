package com.jawad.forge.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "exercise")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "exercise")
    @JsonManagedReference
    private List<WorkoutExerciseResult> workoutExerciseResults;

    @OneToMany(mappedBy = "exercise")
    @JsonManagedReference
    private List<WorkoutDayExercise> workoutDayExercises;

    @ManyToOne
    @JoinColumn(name = "muscle_group_id")
    @JsonBackReference
    private MuscleGroup muscleGroup;
}
