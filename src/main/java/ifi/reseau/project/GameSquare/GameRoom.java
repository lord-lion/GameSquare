package ifi.reseau.project.GameSquare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameRoom {
    private String name;
    private List<Player> onlineClients;
    private Boolean gameRound;
    private int activePlayer;

    public GameRoom(String roomName) {
        this.name = roomName;
        this.onlineClients = new ArrayList<>();
        this.gameRound = null;
        this.activePlayer = 0;
    }

    public GameRoom() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getOnlineClients() {
        return onlineClients;
    }

    public void setOnlineClients(List<Player> onlineClients) {
        this.onlineClients = onlineClients;
    }

    public Boolean getGameRound() {
        return gameRound;
    }

    public void setGameRound(Boolean gameRound) {
        this.gameRound = gameRound;
    }

    public int getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(int activePlayer) {
        this.activePlayer = activePlayer;
    }

    public void addPlayer(Player objPlayer) {
        onlineClients.add(objPlayer);
    }

    public int getPlayersCount() {
        return onlineClients.size();
    }

    public void checkPlayersGameStart() {
        for (Player player : onlineClients) {
            if (!player.isGameStartIntention()) {
                gameRound = false;
                return;
            }
            gameRound = true;
        }
    }

    public int getRandActivePlayer() {
        activePlayer = new Random().nextInt(2);
        return activePlayer;
    }

    public int getSwapPlayer() {
        activePlayer = activePlayer == 0 ? 1 : 0;
        return activePlayer;
    }

    public Boolean getReadyForGame() {
        checkPlayersGameStart();
        return gameRound;
    }

    public boolean isRoomAvailable() {
        return onlineClients.size() < 2;
    }

    public int getPlayerIndex(String sid) {
        for (int idx = 0; idx < onlineClients.size(); idx++) {
            if (onlineClients.get(idx).getId().equals(sid)) {
                return idx;
            }
        }
        return -1;
    }

    public List<String> getClientsInRoom(String requestType) {
        List<String> connectedPlayers = new ArrayList<>();

        for (Player player : onlineClients) {
            if ("byId".equals(requestType)) {
                connectedPlayers.add(player.getId());
            } else if ("byName".equals(requestType)) {
                connectedPlayers.add(player.getName());
            }
        }
        return connectedPlayers;
    }

    public void startRound() {
        for (Player player : onlineClients) {
            player.setGameStartIntention(false);
        }
    }
}
