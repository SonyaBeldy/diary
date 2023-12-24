package ru.sonyabeldy.diary.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;
import ru.sonyabeldy.diary.dto.NoteDTO;
import ru.sonyabeldy.diary.models.Note;
import ru.sonyabeldy.diary.services.NoteService;

import java.net.http.HttpResponse;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;
    private final ModelMapper modelMapper;

    public NoteController(NoteService noteService, ModelMapper modelMapper) {
        this.noteService = noteService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    private List<Note> findAll() {
        return noteService.findAll();
    }

    @GetMapping("/{date}")
    private List<NoteDTO> findAllByDate(@PathVariable @DateTimeFormat Date date) {
        return noteService.findAllByDate(date).stream().map(this::convertToNote).collect(Collectors.toList());
    }

    @PostMapping("/new")
    private ResponseEntity<HttpStatus> create(@RequestBody NoteDTO noteDTO) {
        noteService.save(convertToNote(noteDTO));
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
    @PostMapping("/update")
    private ResponseEntity<HttpStatus> update(@RequestBody NoteDTO noteDTO) {
        noteService.update(convertToNote(noteDTO));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<HttpStatus> delete(@RequestBody NoteDTO noteDTO) {
        noteService.delete(convertToNote(noteDTO));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    private NoteDTO convertToNote(Note note) {
        return modelMapper.map(note, NoteDTO.class);
    }

    private Note convertToNote(NoteDTO noteDTO) {
        return modelMapper.map(noteDTO, Note.class);
    }
}
