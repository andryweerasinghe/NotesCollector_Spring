/*
 * Author  : Mr.electrix
 * Project : NotesCollector
 * Date    : 9/7/24

 */

package lk.ijse.aad.notescollector.dto.impl;

import lk.ijse.aad.notescollector.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO implements SuperDTO {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profilePicture;
    private List<NoteDTO> notes;
}
