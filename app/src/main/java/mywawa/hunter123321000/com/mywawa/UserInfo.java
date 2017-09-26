package mywawa.hunter123321000.com.mywawa;

/**
 * Created by rd on 2017/9/21.
 */

public class UserInfo {
    private String email,password,notificationToken;

    public UserInfo() {
    }

    public UserInfo(String email, String password, String notificationToken) {
        this.email = email;
        this.password = password;
        this.notificationToken = notificationToken;
    }

    public String getnotificationToken() {
        return notificationToken;
    }

    public void setnotificationToken(String notificationToken) {
        this.notificationToken = notificationToken;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {

        return email;
    }

    public String getPassword() {
        return password;
    }
}
