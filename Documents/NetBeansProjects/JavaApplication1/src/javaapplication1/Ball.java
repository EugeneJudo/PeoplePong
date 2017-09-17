package javaapplication1;

import java.util.Random;

class Ball {
    private double xPosition;
    private double yPosition;
    private double initialXPosition;
    private double initialYPosition;
    private double speed;
    private double dx;
    private double dy;
    private final double radius;
    
    
    public Ball(double x, double y, double r){
        xPosition = x;
        yPosition = y;
        initialXPosition = x;
        initialYPosition = y;
        setDirection();
        radius = r;
    }
    
    void setDirection(){
        //randomly assign the direction 
    }
    
    void checkCollision(double height, double width, double bPX, double bPY, double tPX, double tPY, double paddleW, double paddleH){
       /*if(xPosition - radius <= 0)
           //hit left side
       else if(xPosition + radius >= width)
           //hit right side
       else if(yPosition - radius <= 0)
           //Bottom Player gains point
       else if(yPosition + radius >= height)
           //Top Player gains point
       //define the remaining cases for when the ball hits the paddle*/
    }
    
    void updateOnCollision(double changeX, double changeY, double newSpeed){
        dx = changeX;
        dy = changeY;
        speed = newSpeed;
    }
    
    void updateBallPosition(){
        xPosition += dx;
        yPosition += dy;
    }
    
    public double getX(){
        return xPosition;
    }
    
    public double getY(){
        return yPosition;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void reset(){
        xPosition = initialXPosition;
        yPosition = initialYPosition;
        setDirection();
    }
}
