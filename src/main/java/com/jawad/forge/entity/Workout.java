package com.jawad.forge.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Table(name = "workout")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDate workoutDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "workout_day_id")
    @JsonBackReference
    private WorkoutDay workoutDay;

    @OneToMany(mappedBy = "workout")
    @JsonManagedReference
    private List<WorkoutExerciseResult> workoutExerciseResults;
}
