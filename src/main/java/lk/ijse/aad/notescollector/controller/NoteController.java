/*
 * Author  : Mr.electrix
 * Project : NotesCollector
 * Date    : 9/7/24

 */

package lk.ijse.aad.notescollector.controller;

import lk.ijse.aad.notescollector.dto.impl.NoteDTO;
import lk.ijse.aad.notescollector.util.AppUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO saveNote(@RequestBody NoteDTO noteDTO) {       //@RequestBody is used if the request is made through a body
        noteDTO.setNoteId(AppUtil.generateNoteId());
        return noteDTO;
    }
    public NoteDTO getSelectedNote(){
        return null;
    }
    public List<NoteDTO> getAllNotes() {
        return null;
    }
    public void deleteNote(String noteId) {

    }
    public void updateNote(String noteId, NoteDTO noteDTO) {

    }
}
