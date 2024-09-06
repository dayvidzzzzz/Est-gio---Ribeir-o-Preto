import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " nao pertence à sequência de Fibonacci.");
        };
    }

    public static boolean isFibonacci(int num){
        if (num < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return a == num;
    }

}
