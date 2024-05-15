package cn.xmu.changgu.gumballstate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GumballMachineGUI {
    private JFrame frame;
    private final GumballMachine gumballMachine;
    private JLabel statusLabel;
    private JLabel countLabel;
    private JTextArea consoleOutput;
    private JButton insertQuarterButton;
    private JButton ejectQuarterButton;
    private JButton turnCrankButton;
    private JButton refillButton;

    public GumballMachineGUI(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        createAndShowGUI();
    }

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5) {
            @Override
            public void releaseBall() {
                super.releaseBall();
                System.out.println("A gumball comes rolling out the slot...");
            }
        };

        new GumballMachineGUI(gumballMachine);
    }

    private void createAndShowGUI() {
        frame = new JFrame("Gumball Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3, 1));

        statusLabel = new JLabel("State: " + gumballMachine.getState().getClass().getSimpleName(), SwingConstants.CENTER);
        countLabel = new JLabel("Gumballs: " + gumballMachine.getCount(), SwingConstants.CENTER);
        topPanel.add(statusLabel);
        topPanel.add(countLabel);

        consoleOutput = new JTextArea(10, 40);
        consoleOutput.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(consoleOutput);
        topPanel.add(scrollPane);

        panel.add(topPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1));

        insertQuarterButton = new JButton("Insert Quarter");
        insertQuarterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gumballMachine.insertQuarter();
                updateStatus();
            }
        });
        buttonPanel.add(insertQuarterButton);

        ejectQuarterButton = new JButton("Eject Quarter");
        ejectQuarterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gumballMachine.ejectQuarter();
                updateStatus();
            }
        });
        buttonPanel.add(ejectQuarterButton);

        turnCrankButton = new JButton("Turn Crank");
        turnCrankButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gumballMachine.turnCrank();
                updateStatus();
            }
        });
        buttonPanel.add(turnCrankButton);

        refillButton = new JButton("Refill Gumballs");
        refillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String countStr = JOptionPane.showInputDialog(frame, "Enter the number of gumballs:");
                if (countStr != null && !countStr.isEmpty()) {
                    int count = Integer.parseInt(countStr);
                    gumballMachine.refill(count);
                    updateStatus();
                }
            }
        });
        buttonPanel.add(refillButton);

        panel.add(buttonPanel, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private void updateStatus() {
        statusLabel.setText("State: " + gumballMachine.getState().getClass().getSimpleName());
        countLabel.setText("Gumballs: " + gumballMachine.getCount());
        consoleOutput.append(gumballMachine.toString() + "\n");
        consoleOutput.setCaretPosition(consoleOutput.getDocument().getLength());
    }
}

