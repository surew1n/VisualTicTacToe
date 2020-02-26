import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame("Tic Tac Toe");
        JPanel mainPanel = new JPanel();
        JTextField textField = new JTextField("Welcome to Tic Tac Toe");
        ImageIcon image = new ImageIcon("src/board.png");
        JLabel imageLabel = new JLabel(image);

        JButton b1 = new JButton("");
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b1.setBackground(Color.GREEN);
                b1.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b1.setBackground(UIManager.getColor("control"));
                b1.setOpaque(false);
            }
        });
        JButton b2 = new JButton("");
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b2.setBackground(Color.GREEN);
                b2.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b2.setBackground(UIManager.getColor("control"));
                b2.setOpaque(false);
            }
        });
        JButton b3 = new JButton("");
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b3.setBackground(Color.GREEN);
                b3.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b3.setBackground(UIManager.getColor("control"));
                b3.setOpaque(false);
            }
        });
        JButton b4 = new JButton("");
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b4.setBackground(Color.GREEN);
                b4.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b4.setBackground(UIManager.getColor("control"));
                b4.setOpaque(false);
            }
        });
        JButton b5 = new JButton("");
        b5.setOpaque(false);
        b5.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b5.setBackground(Color.GREEN);
                b5.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b5.setBackground(UIManager.getColor("control"));
                b5.setOpaque(false);
            }
        });
        JButton b6 = new JButton("");
        b6.setOpaque(false);
        b6.setContentAreaFilled(false);
        b6.setBorderPainted(false);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b6.setBackground(Color.GREEN);
                b6.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b6.setBackground(UIManager.getColor("control"));
                b6.setOpaque(false);
            }
        });
        JButton b7 = new JButton("");
        b7.setOpaque(false);
        b7.setContentAreaFilled(false);
        b7.setBorderPainted(false);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b7.setBackground(Color.GREEN);
                b7.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b7.setBackground(UIManager.getColor("control"));
                b7.setOpaque(false);
            }
        });
        JButton b8 = new JButton("");
        b8.setOpaque(false);
        b8.setContentAreaFilled(false);
        b8.setBorderPainted(false);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b8.setBackground(Color.GREEN);
                b8.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b8.setBackground(UIManager.getColor("control"));
                b8.setOpaque(false);
            }
        });
        JButton b9 = new JButton("");
        b9.setOpaque(false);
        b9.setContentAreaFilled(false);
        b9.setBorderPainted(false);
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        b9.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b9.setBackground(Color.GREEN);
                b9.setOpaque(true);
            }
            public void mouseExited(MouseEvent e) {
                b9.setBackground(UIManager.getColor("control"));
                b9.setOpaque(false);
            }
        });
        imageLabel.add(b1);
        imageLabel.add(b2);
        imageLabel.add(b3);
        imageLabel.add(b4);
        imageLabel.add(b5);
        imageLabel.add(b6);
        imageLabel.add(b7);
        imageLabel.add(b8);
        imageLabel.add(b9);
        mainPanel.add(imageLabel, BorderLayout.PAGE_START);
        mainPanel.add(textField, BorderLayout.PAGE_END);
        frame.add(mainPanel);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        imageLabel.setLayout(new GridLayout(3, 3, 30, 30));

        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);

        frame.setSize(510, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI main = new GUI();
    }
}
