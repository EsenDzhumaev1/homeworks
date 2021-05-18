package homework_23;

import javax.swing.*;
import java.awt.*;

public class Main extends Canvas{
    public Main(){

    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLACK);

    }
    public static void main(String[] args) {
        Main canvas = new Main();
        JFrame frame = new JFrame();
        frame.setSize(960, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
