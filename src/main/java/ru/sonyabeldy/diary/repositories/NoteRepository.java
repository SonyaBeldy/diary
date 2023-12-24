package ru.sonyabeldy.diary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sonyabeldy.diary.models.Note;

import java.util.Date;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {
    List<Note> findAllByDate(Date date);
}
