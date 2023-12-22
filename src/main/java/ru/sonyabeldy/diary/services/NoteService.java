package ru.sonyabeldy.diary.services;

import org.springframework.stereotype.Service;
import ru.sonyabeldy.diary.models.Note;
import ru.sonyabeldy.diary.repositories.NoteRepository;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> findAll() {
        return noteRepository.findAll();
    }
}
