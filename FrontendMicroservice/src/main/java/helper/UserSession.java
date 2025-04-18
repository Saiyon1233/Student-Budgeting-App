package helper;

public class UserSession {
    private String email;
    private boolean loggedIn;

    public UserSession(String email, boolean loggedIn) {
        this.email = email;
        this.loggedIn = loggedIn;
    }

    public String getEmail() { return email; }
    public boolean isLoggedIn() { return loggedIn; }
}
