package ifi.reseau.project.GameSquare;

public class TurnResponse {
    private String recentPlayer;
    private int lastPos;
    private String next;

    public TurnResponse(String recentPlayer, int lastPos, String next) {
        this.recentPlayer = recentPlayer;
        this.lastPos = lastPos;
        this.next = next;
    }

    public TurnResponse() {
    }

    public String getRecentPlayer() {
        return recentPlayer;
    }

    public void setRecentPlayer(String recentPlayer) {
        this.recentPlayer = recentPlayer;
    }

    public int getLastPos() {
        return lastPos;
    }

    public void setLastPos(int lastPos) {
        this.lastPos = lastPos;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
