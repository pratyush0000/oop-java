import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame {
    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    private double firstOperand;
    private String operation;

    public calc() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setPreferredSize(new Dimension(600, 70));
        add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        clearButton = createOperatorButton("C");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
        clearButton.setBackground(new Color(0x555555));
        clearButton.setForeground(Color.WHITE);

        buttonPanel.add(clearButton);

        numberButtons = new JButton[10];

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(Integer.toString(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            numberButtons[i].setBackground(new Color(0x6D6E92));
            numberButtons[i].addActionListener(new NumberButtonListener());
            numberButtons[i].setForeground(Color.WHITE);
            buttonPanel.add(numberButtons[i]);
        }

        addButton = createOperatorButton("+");
        addButton.setFont(new Font("Arial", Font.PLAIN, 20));
        addButton.setBackground(new Color(0x92916D));
        addButton.setForeground(Color.WHITE);
        subtractButton = createOperatorButton("-");
        subtractButton.setFont(new Font("Arial", Font.PLAIN, 20));
        subtractButton.setBackground(new Color(0x92916D));
        subtractButton.setForeground(Color.WHITE);
        multiplyButton = createOperatorButton("*");
        multiplyButton.setFont(new Font("Arial", Font.PLAIN, 20));
        multiplyButton.setBackground(new Color(0x92916D));
        multiplyButton.setForeground(Color.WHITE);
        divideButton = createOperatorButton("/");
        divideButton.setFont(new Font("Arial", Font.PLAIN, 20));
        divideButton.setBackground(new Color(0x92916D));
        divideButton.setForeground(Color.WHITE);
        equalsButton = createOperatorButton("=");
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        equalsButton.setBackground(new Color(0x92916D));
        equalsButton.setForeground(Color.WHITE);

        buttonPanel.add(equalsButton);
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        add(buttonPanel, BorderLayout.CENTER);

        operation = "";
    }

    private JButton createOperatorButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(new OperatorButtonListener());
        return button;
    }

    private class NumberButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            inputField.setText(inputField.getText() + buttonText);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();

            if (!inputField.getText().isEmpty()) {
                if (buttonText.equals("C")) {
                    inputField.setText("");
                    firstOperand = 0;
                    operation = "";
                } else if (buttonText.equals("=")) {
                    double secondOperand = Double.parseDouble(inputField.getText());
                    double result = 0;

                    switch (operation) {
                        case "+":
                            result = firstOperand + secondOperand;
                            break;
                        case "-":
                            result = firstOperand - secondOperand;
                            break;
                        case "*":
                            result = firstOperand * secondOperand;
                            break;
                        case "/":
                            if (secondOperand != 0) {
                                result = firstOperand / secondOperand;
                            } else {
                                inputField.setText("Error");
                                return;
                            }
                            break;
                    }

                    inputField.setText(Double.toString(result));
                    operation = "";
                } else {
                    firstOperand = Double.parseDouble(inputField.getText());
                    operation = buttonText;
                    inputField.setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            calc calculator = new calc();
            calculator.setVisible(true);
        });
    }
}
