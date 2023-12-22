package ru.sonyabeldy.diary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sonyabeldy.diary.models.Task;

import java.util.Date;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findAllByDate(Date date);
}
