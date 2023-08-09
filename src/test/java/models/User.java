package models;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @EqualsAndHashCode.Exclude
    private int id;

    @NonNull
    private String username;
    @NonNull
    private String password;
    //@ToString.Exclude
    private String email;

    //@ToString.Exclude
    private String code;


    public User() {

    }
}
