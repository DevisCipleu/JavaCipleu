package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField {
    public static void main(String[] args) {
        //createAndShowGUI();
        //createAndShowGUI2();
        //createAndShowGUI3();
        //createAndShowGUI4();
        //createAndShowGUI5();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Nume:");
        JTextField nameTextField = new JTextField(20); // Set the desired width of the text field

        panel.add(nameLabel);
        panel.add(nameTextField);


        panel.add(nameLabel);
        panel.add(nameTextField);


        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400, 400); // Set the preferred size of the frame
        frame.setVisible(true);
    }

    private static void createAndShowGUI2() {
        JFrame frame = new JFrame("CheckBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel maritalStatusLabel = new JLabel("Casatorit:");
        JCheckBox maritalStatusCheckBox = new JCheckBox();

        panel.add(maritalStatusLabel);
        panel.add(maritalStatusCheckBox);

        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private static void createAndShowGUI3() {
        JFrame frame = new JFrame("RadioButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel genderLabel = new JLabel("Sex:");
        JRadioButton maleRadioButton = new JRadioButton("Msculin");
        JRadioButton femaleRadioButton = new JRadioButton("Feminin");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        panel.add(genderLabel);
        panel.add(maleRadioButton);
        panel.add(femaleRadioButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private static void createAndShowGUI4() {
        JFrame frame = new JFrame("TextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel commentsLabel = new JLabel("Comments:");
        JTextArea commentsTextArea = new JTextArea(5, 20); // 3 rows, 10 columns

        JScrollPane scrollPane = new JScrollPane(commentsTextArea);
        panel.add(commentsLabel);
        panel.add(scrollPane);

        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private static void createAndShowGUI5() {
        JFrame frame = new JFrame("TextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel commentsLabel = new JLabel("Comments:");
        JTextArea commentsTextArea = new JTextArea(3, 10); // 3 rows, 10 columns

        JScrollPane scrollPane = new JScrollPane(commentsTextArea);
        panel.add(commentsLabel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add action to be performed when the button is clicked
                String comments = commentsTextArea.getText();
                JOptionPane.showMessageDialog(frame, "Comments submitted:\n" + comments);
            }
        });
        panel.add(submitButton, BorderLayout.SOUTH);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

}
