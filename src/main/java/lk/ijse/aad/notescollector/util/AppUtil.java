/*
 * Author  : Mr.electrix
 * Project : NotesCollector
 * Date    : 9/7/24

 */

package lk.ijse.aad.notescollector.util;

import java.util.UUID;

public class AppUtil {
    public static String generateNoteId(){
        return "NOTE-"+ UUID.randomUUID();
    }
    public static String generateUserId(){
        return "USER-"+ UUID.randomUUID();
    }
}
