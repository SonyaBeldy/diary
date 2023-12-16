package ru.sonyabeldy.diary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "task")
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "day_id", referencedColumnName = "id")
    private Day day;

}
