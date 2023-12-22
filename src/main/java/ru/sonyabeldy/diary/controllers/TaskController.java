package ru.sonyabeldy.diary.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sonyabeldy.diary.dto.TaskDTO;
import ru.sonyabeldy.diary.models.Task;
import ru.sonyabeldy.diary.services.TaskService;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    private final ModelMapper modelMapper;

    public TaskController(TaskService taskService, ModelMapper modelMapper) {
        this.taskService = taskService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    private List<TaskDTO> findAll() {
        return taskService.findAll().stream().map(this::convertToTaskDTO).collect(Collectors.toList());
    }

    @GetMapping("/{date}")
    private List<TaskDTO> findByDay(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return taskService.findAllByDate(date).stream().map(this::convertToTaskDTO).collect(Collectors.toList());
    }

    private Task convertToTask(TaskDTO taskDTO) {
        return modelMapper.map(taskDTO, Task.class);
    }

    private TaskDTO convertToTaskDTO(Task task) {
        return modelMapper.map(task, TaskDTO.class);
    }

}
