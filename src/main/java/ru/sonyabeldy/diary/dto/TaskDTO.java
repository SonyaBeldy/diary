package ru.sonyabeldy.diary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskDTO {
    private String text;
    private DayDTO day;
    private boolean isCompleted;
}
