package HomeWork2;
import java.util.Scanner;

public class Task4 {
    
 public static void main(String[] args) throws Exception {

        userInput();
    }

    public static void userInput() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }

}