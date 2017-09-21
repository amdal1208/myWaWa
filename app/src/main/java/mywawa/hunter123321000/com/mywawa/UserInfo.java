package mywawa.hunter123321000.com.mywawa;

/**
 * Created by rd on 2017/9/21.
 */

public class UserInfo {
    private String email,password;

    public UserInfo() {
    }

    public UserInfo(String email, String password) {
        this.email = email;
        this.password = password;
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
