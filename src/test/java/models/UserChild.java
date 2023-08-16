package models;

import lombok.NonNull;

public class UserChild extends User{
    public UserChild(int id, @NonNull String username, @NonNull String password, String email, String code) {
        super(id, username, password, email, code);
    }

    public UserChild(@NonNull String username, @NonNull String password) {
        super(username, password);
    }
}
