package com.jawad.forge.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "workout_day")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class WorkoutDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "workoutDay")
    @JsonManagedReference
    private List<Workout> workouts;

    @OneToMany(mappedBy = "workoutDay")
    @JsonManagedReference
    private List<WorkoutDayExercise> workoutDayExercises;
}
