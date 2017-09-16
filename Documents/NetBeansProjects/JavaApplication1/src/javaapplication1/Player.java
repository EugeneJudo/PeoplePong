package javaapplication1;

class Player {
    
    final String name;
    private int score;
    private Paddle pad;
    
    public Player(String n, Paddle p){
        name = n;
        score = 0;
        pad = p;
    }
    
    void scoredPoint(){
        score++;
    }
    
    boolean didWin(int WinningScore){
        return WinningScore == score;
    }
}
