package ru.sonyabeldy.diary.services;

import org.springframework.stereotype.Service;
import ru.sonyabeldy.diary.repositories.NoteRepository;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }
}
