public class Q_Interfaces {
    public static void main(String args[]){
        Queen cookie=new Queen();
        cookie.moves();

    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 directions)");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal-(by 1 step)");
    }
}