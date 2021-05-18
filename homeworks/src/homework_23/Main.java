package homework_23;

import javax.swing.*;
import java.awt.*;

public class Main extends Canvas{
    int width;
    int height;
    public Main(){
        this.width = 960;
        this.height = 720;
    }
    public void section(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(0, height / 2, width, height / 2);
        g.drawLine(width / 2, height, width / 2, 0);
    }

    public void graphic(Graphics g, int degree, Color clr) {
        g.setColor(clr);
        System.out.println("New Graphic\n" + "=".repeat(30) + "\n");
        for (double x=-100;x<=100;x = x+0.1){
            double y = Math.pow(x, degree);
            int X = (int)Math.round((double)width / 2 + x*20);
            int Y = (int)Math.round((double)height / 2 - y*20);
            System.out.printf("X = %s, Y = %s\n", X, Y);
            g.fillOval(X,Y,4,4);
        }
    }

    public void paint (Graphics g){
        graphic(g, 2, Color.BLUE);
        graphic(g, 3, Color.RED);
        section(g);
    }
    public static void main(String[] args) {
        Main canvas = new Main();
        JFrame frame = new JFrame();
        frame.setSize(canvas.width, canvas.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
