package ifi.reseau.project.GameSquare;

public class Player {
    private String id;
    private String name;
    private String requestedGameRoom;
    private String gameMark;
    private boolean gameStartIntention;

    public Player(String id) {
        this.id = id;
        this.name = "";
        this.requestedGameRoom = "";
        this.gameMark = "";
        this.gameStartIntention = false;
    }
    public Player() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequestedGameRoom() {
        return requestedGameRoom;
    }

    public void setRequestedGameRoom(String requestedGameRoom) {
        this.requestedGameRoom = requestedGameRoom;
    }

    public String getGameMark() {
        return gameMark;
    }

    public void setGameMark(String gameMark) {
        this.gameMark = gameMark;
    }

    public boolean isGameStartIntention() {
        return gameStartIntention;
    }

    public void setGameStartIntention(boolean gameStart) {
        this.gameStartIntention = gameStart;
    }
}
