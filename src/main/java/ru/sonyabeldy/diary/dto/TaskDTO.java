package ru.sonyabeldy.diary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskDTO {
    private String text;
    private Date date;
    private boolean isCompleted;
}
