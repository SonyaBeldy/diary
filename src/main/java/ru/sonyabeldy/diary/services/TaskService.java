package ru.sonyabeldy.diary.services;

import org.springframework.stereotype.Service;
import ru.sonyabeldy.diary.models.Task;
import ru.sonyabeldy.diary.repositories.TaskRepository;

import java.util.Date;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public List<Task> findAllByDate(Date date) {
        return taskRepository.findAllByDate(date);
    }
}
