package models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private int id;
    private String username;
    private String password;
    //@ToString.Exclude
    private String email;

    //@ToString.Exclude
    private String code;


}
