package ifi.reseau.project.GameSquare;

public class GameStartResponse {
    private String activePlayer;
    private boolean started;

    public GameStartResponse(String activePlayer, boolean started) {
        this.activePlayer = activePlayer;
        this.started = started;
    }

    public GameStartResponse() {
    }

    public String getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(String activePlayer) {
        this.activePlayer = activePlayer;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}
