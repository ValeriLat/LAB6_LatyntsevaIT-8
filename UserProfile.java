//Для 3
@ToString
public class UserProfile {
    private String username = "JohnDoe";

    @ToString(show = ToString.ShowField.NO)
    private String password = "secret123";

    private int loginCount = 5;

    @ToString(show = ToString.ShowField.NO)
    private String sessionId = "SESS_12345";

    public UserProfile() {}

    public UserProfile(String username, String password, int loginCount, String sessionId) {
        this.username = username;
        this.password = password;
        this.loginCount = loginCount;
        this.sessionId = sessionId;
    }
}