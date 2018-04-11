package CurveFever;

import javafx.scene.paint.Color;
import javafx.geometry.Point2D;
import javafx.scene.input.KeyCode;
import java.lang.Math;

public class Player implements IDrawable{
    private static int maxId = 0;
    private int playerID;
    private Color color;
    private static int sizedefault = 5;
    private static int speeddefault = 1;
    private int size = 5;
    private int speed = 1;
    private boolean isDead;
    private KeyCode leftKey;
    private KeyCode rightKey;
    private double angle = 0;
    private double rotateStep = 1;
    private Point2D position;
    private double x;
    private double y;

    public Player(Color color, KeyCode leftKey, KeyCode rightKey) {
        this.playerID = maxId;
        maxId++;
        this.color = color;
        //this.leftKey = leftKey;
        //this.rightKey = rightKey;
        this.leftKey = KeyCode.LEFT;
        this.rightKey = KeyCode.RIGHT;
    }

    private void rotate(double angle){
        this.angle += angle;
        if(this.angle > 360.0) this.angle -= 360.0;
        if(this.angle < 0.0) this.angle += 360;
    }

    public int getSize(){
        return this.size;
    }

    public void handleKey(KeyCode key){
        {
            if (key == leftKey) rotate(rotateStep);
            else if (key == rightKey) rotate(-rotateStep);
        }
    }

    public Color getColor(){
        return this.color;
    }

    public int getId(){
        return this.playerID;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean getIsDead(){
        return this.isDead;
    }

    public void setIsDead(boolean isDead){
        this.isDead = isDead;
    }

    public double getAngle() {
        return angle;
    }

    public void makeStep()
    {
        x += speed * Math.sin(Math.toRadians(angle));
        y += speed * Math.cos(Math.toRadians(angle));


        //???? xD hehehehehheheheh smiesznie curde
    }
    public void draw(){
        System.out.println("ja sie rysuje");
    }
}
