package javaapplication1;

class Paddle {
    double xPosition;
    double yPosition;
    double width;
    double height;
    
    public Paddle(double x, double y, double w, double h){
        xPosition = x;
        yPosition = y;
        width = w;
        height = h;
    }
    
    private void shiftToRight(double delta){
        xPosition += delta;
    }
    
    public double getX(){
        return xPosition;
    }
    
    public double getY(){
        return yPosition;
    }
}
