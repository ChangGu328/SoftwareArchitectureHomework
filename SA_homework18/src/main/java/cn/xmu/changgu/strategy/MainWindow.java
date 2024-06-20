package cn.xmu.changgu.strategy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private final JComboBox<String> strategyPlayer1;
    private final JComboBox<String> strategyPlayer2;
    private final JTextArea resultArea;

    public MainWindow() {
        setTitle("Strategy Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Player 1 Strategy:"));
        strategyPlayer1 = new JComboBox<>(new String[]{"WinningStrategy", "ProbStrategy"});
        panel.add(strategyPlayer1);

        panel.add(new JLabel("Player 2 Strategy:"));
        strategyPlayer2 = new JComboBox<>(new String[]{"WinningStrategy", "ProbStrategy"});
        panel.add(strategyPlayer2);

        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
        panel.add(startButton);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        panel.add(scrollPane);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    private void startGame() {
        String strategy1 = (String) strategyPlayer1.getSelectedItem();
        String strategy2 = (String) strategyPlayer2.getSelectedItem();

        Player player1 = new Player("Player 1", getStrategyInstance(strategy1));
        Player player2 = new Player("Player 2", getStrategyInstance(strategy2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                player1.lose();
                player2.win();
            } else {
                player1.even();
                player2.even();
            }
        }

        resultArea.setText("Results after 10000 rounds:\n");
        resultArea.append(player1 + "\n");
        resultArea.append(player2 + "\n");
    }

    private Strategy getStrategyInstance(String strategyName) {
        switch (strategyName) {
            case "WinningStrategy":
                return new WinningStrategy();
            case "ProbStrategy":
                return new ProbStrategy();
            default:
                throw new IllegalArgumentException("Unknown strategy: " + strategyName);
        }
    }
}

