package CurveFever;
import javafx.geometry.Point2D;
import javafx.scene.input.KeyCode;

import java.util.List;

public class Handling {

   public void handleKeys( List<KeyCode> pressedKeys, List<Player> players) {
      for(Player player: players){
         for(KeyCode key: pressedKeys)
         {
            player.handleKey(key);
         }
         player.draw();
      }
   }
    
   public Handling(Board board) {
       
   }
}
