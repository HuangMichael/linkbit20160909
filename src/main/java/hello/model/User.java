package hello.model;

import lombok.*;

import java.util.Date;


/**
 * Created by huangbin on 2016/9/6.
 * 用户信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private Long id;
    private String userName;
    private String password;
    private Date birthDate;
    private boolean status;
}
