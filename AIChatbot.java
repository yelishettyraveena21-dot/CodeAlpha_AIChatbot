import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI Chatbot ===");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String message = sc.nextLine().toLowerCase();

            if (message.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            }
            else if (message.contains("hello") || message.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (message.contains("how are you")) {
                System.out.println("Bot: I am doing well. Thank you for asking!");
            }
            else if (message.contains("your name")) {
                System.out.println("Bot: I am an AI Chatbot created in Java.");
            }
            else if (message.contains("java")) {
                System.out.println("Bot: Java is a popular object-oriented programming language.");
            }
            else if (message.contains("internship")) {
                System.out.println("Bot: Internships help you gain practical experience.");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }

        sc.close();
    }
}