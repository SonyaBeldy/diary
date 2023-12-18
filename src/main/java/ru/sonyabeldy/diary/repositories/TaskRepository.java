package ru.sonyabeldy.diary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sonyabeldy.diary.models.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
