package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormularSwing extends JFrame {
    private JTextField textField;
    private JCheckBox checkBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private ButtonGroup radioGroup;
    private JComboBox<String> comboBox;

    public FormularSwing() {
        setTitle("Formular Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Adaugare elemente UI
        add(new JLabel("Text:"));
        textField = new JTextField();
        add(textField);

        add(new JLabel("CheckBox:"));
        checkBox = new JCheckBox("Selecteaza");
        add(checkBox);

        add(new JLabel("RadioButtons:"));
        radioGroup = new ButtonGroup();
        radioButton1 = new JRadioButton("Optiune 1");
        radioButton2 = new JRadioButton("Optiune 2");
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        add(radioButton1);
        add(radioButton2);

        add(new JLabel("ComboBox:"));
        String[] options = {"Optiune 1", "Optiune 2", "Optiune 3"};
        comboBox = new JComboBox<>(options);
        add(comboBox);

        JButton saveButton = new JButton("Salvare");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvareDateJSON();
            }
        });
        add(saveButton);

        JButton cancelButton = new JButton("Anulare");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(cancelButton);

    }

    private void salvareDateJSON() {
        // Creare obiect JSON
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Text", textField.getText());
        jsonObject.put("CheckBox", checkBox.isSelected());
        jsonObject.put("RadioButton", radioButton1.isSelected() ? "Optiune 1" : "Optiune 2");
        jsonObject.put("ComboBox", comboBox.getSelectedItem());

        // Salvare JSON in fisier
        try (FileWriter file = new FileWriter("date.json", true)) {
            file.write(jsonObject.toJSONString() + "\n");
            file.flush();
            JOptionPane.showMessageDialog(this, "Datele au fost salvate cu succes!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Eroare la salvarea datelor!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularSwing().setVisible(true);
            }
        });
    }
}
