package wildbeards.com.bluechat.infrastructure;

public class UserDTO {
    private String idUser;
    private String nick;

    public UserDTO() {
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
