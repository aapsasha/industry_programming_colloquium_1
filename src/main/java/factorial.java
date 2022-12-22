import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scan_console = new Scanner(System.in);
        String input = scan_console.next();
        int factorialNumber;
        try {
            factorialNumber = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }

    }
}