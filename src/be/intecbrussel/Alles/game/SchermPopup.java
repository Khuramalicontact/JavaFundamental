package be.intecbrussel.Alles.game;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class SchermPopup {
    public SchermPopup(){

        //Hiermee creeër je een schermpje
        JFrame frame = new JFrame();
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400, 400);
         frame.setFocusable(true);

         //
         JPanel panel = new JPanel();
         JLabel up = new JLabel();
         JLabel down = new JLabel();
         JLabel left = new JLabel();
         JLabel right = new JLabel();

         panel.add(up);
         panel.add(down);
         panel.add(right);
         panel.add(left);

         up.setText("Up: 0");
         down.setText("down: 0");
         left.setText("left: 0");
         right.setText("right: 0");


         frame.addKeyListener(new KeyListener() {

             int upCount = 0;
             int downCount = 0;
             int rightCount = 0;
             int leftCount = 0;

             @Override
             public void keyTyped(KeyEvent keyEvent) {

             }

             @Override
             public void keyPressed(KeyEvent keyEvent) {
                 int keycode = keyEvent.getKeyCode();
                 switch (keycode){
                     case KeyEvent.VK_UP:
                         up.setText("up:" + Integer.toString(upCount++));
                         break;
                     case KeyEvent.VK_DOWN:
                         down.setText("down:" + Integer.toString(downCount++));
                         break;
                     case KeyEvent.VK_RIGHT:
                         right.setText("right:" + Integer.toString(rightCount++));
                         break;
                     case KeyEvent.VK_LEFT:
                         left.setText("left:" + Integer.toString(leftCount++));
                         break;


                 }

             }

             @Override
             public void keyReleased(KeyEvent keyEvent) {

             }
         });
         frame.add(panel);

    }

    public static void main(String[] args) {
        new SchermPopup();






    }
}
