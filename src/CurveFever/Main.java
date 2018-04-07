package CurveFever;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import java.util.*;

public class Main extends Application {

    private static List<KeyCode> pressedKeys = new ArrayList<KeyCode>();
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("MainActivity.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root, 300, 275);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event){
                if(!pressedKeys.contains(event.getCode())){
                    pressedKeys.add(event.getCode());
                }
                testKeyboardWork();
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event){
                if(pressedKeys.contains(event.getCode())){
                    pressedKeys.remove(event.getCode());
                }
                testKeyboardWork();
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static void testKeyboardWork(){
        for(int i=0;i<pressedKeys.size();i++){
            System.out.print(pressedKeys.get(i));
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}
