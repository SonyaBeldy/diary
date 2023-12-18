package ru.sonyabeldy.diary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sonyabeldy.diary.models.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
