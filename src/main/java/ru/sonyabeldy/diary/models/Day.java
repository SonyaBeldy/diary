package ru.sonyabeldy.diary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "day")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Day {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "note")
    private String note;

    @OneToMany(mappedBy = "day")
    private List<Task> tasks;
}
