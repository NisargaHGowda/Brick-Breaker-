package PingPong;

import javax.swing.JFrame;


public class BrickBreaker {

    
    public static void main(String[] args) {
       JFrame fr=new JFrame();
       Play play=new Play();
       fr.setBounds(2, 2, 500, 500);
       fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       fr.setUndecorated(true);
       fr.setTitle("Brick Breaker");
       fr.add(play);
       fr.setVisible(true);
    }
    
}
