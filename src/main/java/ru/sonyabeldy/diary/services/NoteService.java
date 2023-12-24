package ru.sonyabeldy.diary.services;

import org.springframework.stereotype.Service;
import ru.sonyabeldy.diary.models.Note;
import ru.sonyabeldy.diary.repositories.NoteRepository;

import java.util.Date;
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

    public List<Note> findAllByDate(Date date) {
        return noteRepository.findAllByDate(date);
    }

    public void update(Note note) {
        noteRepository.save(note);
    }

    public void save(Note note) {
        noteRepository.save(note);
    }

    public void delete(Note note) {
        noteRepository.delete(note);
    }
}
