package ru.sonyabeldy.diary.controllers;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sonyabeldy.diary.models.Note;
import ru.sonyabeldy.diary.services.NoteService;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    private List<Note> findAll() {
        return noteService.findAll();
    }
}
