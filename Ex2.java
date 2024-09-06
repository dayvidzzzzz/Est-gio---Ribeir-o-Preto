import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String str = scanner.nextLine();

        int count = countLetterA(str);
        System.out.println("A letra aparece: " + count );
    }

    public static int countLetterA(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

}
