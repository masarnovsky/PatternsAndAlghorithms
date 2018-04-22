package patterns.behavioral.cor;

public class User {
    private String username;
    private String password;
    private Role role;

    enum Role {
        ADMIN, USER, ANON
    }

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
