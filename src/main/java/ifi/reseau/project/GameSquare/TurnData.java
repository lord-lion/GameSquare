package ifi.reseau.project.GameSquare;

public class TurnData {
    private String player;
    private int pos;

    public TurnData(String player, int pos) {
        this.player = player;
        this.pos = pos;
    }

    public TurnData() {
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
