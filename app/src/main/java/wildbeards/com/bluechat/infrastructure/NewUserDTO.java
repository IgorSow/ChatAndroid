package wildbeards.com.bluechat.infrastructure;

public class NewUserDTO {
    private String nick;
    private String password;

    public NewUserDTO() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
