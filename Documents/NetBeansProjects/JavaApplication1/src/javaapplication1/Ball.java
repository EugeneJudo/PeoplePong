package javaapplication1;

class Ball {
    private double xPosition;
    private double yPosition;
    private double speed;
    private double dx;
    private double dy;
    private final double radius;
    
    
    public Ball(double x, double y, double s, double r){
        xPosition = x;
        yPosition = y;
        speed  = s;
        radius = r;
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
}
