import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Soma:" + soma(num1,num2));
        System.out.println("Subtracao:" + sub(num1,num2));
        System.out.println("Multiplicao:" + mult(num1,num2));
        System.out.println("Divisao:" + div(num1,num2));

    }

    public static int soma (int num1, int num2){
        return num1 + num2;

    }

    public static int sub (int num1,int num2) {
        return num1 - num2;

    }
    public static int mult (int num1, int num2){
        return num1 * num2;

    }
    public static float div (int num1, int num2){
        return (float) num1 / num2;

    }
}
