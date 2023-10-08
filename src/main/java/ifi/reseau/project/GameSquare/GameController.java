package ifi.reseau.project.GameSquare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GameController {
    @Autowired
    private List<Player> connectedPlayers = new ArrayList<>();
    @Autowired
    private List<GameRoom> activeGameRooms = new ArrayList<>();
    private String activePlayer;
    private boolean started;
    private String recentPlayer;
    private int lastPos;
    private String next;

    @GetMapping("/")
    /*public ModelAndView index() {
        return new ModelAndView("index");
    }*/
    public String index(Model model) {
        model.addAttribute("connectedPlayers", connectedPlayers);
        return "index";
    }

    @MessageMapping("/connect")
    @SendTo("/topic/connection-established")
    public String connect() throws Exception {
        Thread.sleep(1000);
        Player player = new Player();
        connectedPlayers.add(player);
        return "go";
    }

    @MessageMapping("/check-game-room")
    public void checkGameRoom(@Payload UserData userData) {
        // Handle checking game room and room creation here
        // ...
    }

    @MessageMapping("/startGame")
    @SendTo("/topic/start")
    public GameStartResponse startGame() {
        // Handle starting the game and return game start response
        // ...
        // Assign values to activePlayer and started
        activePlayer = String.valueOf(true); // or false
        started = true; // or false

        return new GameStartResponse(activePlayer, started);
    }

    @MessageMapping("/turn")
    @SendTo("/topic/turn")
    public TurnResponse turn(TurnData turnData) {
        // Handle a player's turn and return turn response
        // ...
        return new TurnResponse(recentPlayer, lastPos, next);
    }

    // Handle other WebSocket messages and events here
    // ...

    @GetMapping("/disconnect")
    public void disconnect() {
        // Handle player disconnection and room cleanup here
        // ...
    }
}
