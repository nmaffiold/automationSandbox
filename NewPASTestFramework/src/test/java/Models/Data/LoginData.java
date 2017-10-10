package Models.Data;

public class LoginData {
    public String login;
    public String password;

    public LoginData() {

    }

    public LoginData withLogin(String login) {
        this.setLogin(login);
        return this;
    }

    public LoginData withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
