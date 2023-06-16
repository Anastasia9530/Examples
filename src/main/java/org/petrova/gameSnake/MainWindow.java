package org.petrova.gameSnake;

import javax.swing.*;
import java.io.IOException;

public class MainWindow extends JFrame {

    public MainWindow() throws IOException {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        MainWindow mw = new MainWindow();
    }
}
