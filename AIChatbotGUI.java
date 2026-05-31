import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AIChatbotGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("AI Chatbot");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(chatArea);

        JTextField inputField = new JTextField();

        JButton sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String message = inputField.getText().toLowerCase().trim();

                chatArea.append("You: " + message + "\n");

                String response;

                if (message.equals("hello") || message.equals("hi")) {
                    response = "Hello! How can I help you?";
                }
                else if (message.contains("how are you")) {
                    response = "I am doing well. Thank you for asking!";
                }
                else if (message.contains("your name")) {
                    response = "I am an AI Chatbot created in Java.";
                }
                else if (message.contains("java")) {
                    response = "Java is a popular programming language.";
                }
                else if (message.contains("internship")) {
                    response = "Internships help you gain practical experience.";
                }
                else if (message.contains("ai")) {
                    response = "AI stands for Artificial Intelligence.";
                }
                else if (message.contains("python")) {
                    response = "Python is a popular programming language.";
                }
                else if (message.contains("thank")) {
                    response = "You're welcome!";
                }
                else {
                    response = "Sorry, I don't understand that question.";
                }

                chatArea.append("Bot: " + response + "\n\n");

                inputField.setText("");
            }
        });

        frame.setVisible(true);
    }
}