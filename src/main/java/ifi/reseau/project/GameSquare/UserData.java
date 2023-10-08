package ifi.reseau.project.GameSquare;

public class UserData {
    private String username;
    private String room;

    public UserData(String username, String room) {
        this.username = username;
        this.room = room;
    }

    public UserData() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
