package ru.sonyabeldy.diary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sonyabeldy.diary.models.Task;

import java.util.Date;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DayDTO {
    private Date date;
    private String note;
    private List<TaskDTO> tasks;
}
