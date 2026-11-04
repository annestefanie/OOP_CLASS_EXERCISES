import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("===TABUADA===");

        do {
            System.out.print("\nDIGITE UM NÚMERO INTEIRO POSITIVO (OU 0 PARA SAIR): ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("NÚMERO INVÁLIDO. POR FAVOR DIGITE UM NÚMERO POSITIVO.");
            } else if (n > 0) {
                multiplicar(n);
            }
        } while (n != 0);

        System.out.println("\nPROGRAMA FINALIZADO.");
        scanner.close();
    }

    public static void multiplicar(int x) {
        System.out.println("\n===MULTIPLICAÇÃO===");
        for (int i = 1; i <= 10; i++) {
            int res = x * i;
            System.out.printf("%d X %d = %d ", x, i, res);
            parImpar(res);
            System.out.println();
        }
    }

    public static void parImpar(int y) {
        if (y % 2 == 0) {
            System.out.print("[PAR]");
        } else {
            System.out.print("[ÍMPAR]");
        }
    }
}