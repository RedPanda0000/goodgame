package fourjo.idle.goodgame.gg.web.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    private int userIndex;
    private String userId;
    private String userPw;
    private String userNick;
    private String userGender;
    private LocalDateTime userRegDate;
    private String userEmail;
    private int roleId;
}
