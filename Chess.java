import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.lang.Math;
import java.applet.Applet;
import java.awt.GridLayout;


public class Chess extends JFrame{

  public void movePiece(Piece p , String cpos, String dpos){




  }

  JFrame frame = new Jframe("Chess");
  Piece[][] board  = new Piece[8][8];
  frame.setSize(500,500);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setLayout()
  frame.setVisible(true);


}

class Piece {
    String T;
    Color C;

    Piece(String type, Color c){
      T = type;
      C = c;
    }


}

class Pawn extends Piece {



}
class Knight extends Piece{

}

class Rook extends Piece{


}
class Bishop extends Piece {


}
class King extends Piece {


}

class Queen extends Piece {

}



class Game {
    Chess board;
    int p1points;
    int p2points;





}
