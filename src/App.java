import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boarWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(boarWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        flappybird FlappyBird = new flappybird();
        frame.add(FlappyBird);
        frame.pack();
        FlappyBird.requestFocus();
        frame.setVisible(true);
    }
}