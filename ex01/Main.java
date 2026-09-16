import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        int n;

        System.out.println("===TABUADA===");

        do {
            System.out.printf("\nDIGITE UM NÚMERO INTEIRO POSTIVO: ");
            n = scanner.nextInt();
    
            if(n < 0) {
                System.out.println("NÚMERO INVÁLIDO. POR FAVOR DIGITE UM NÚMERO POSITIVO.");
                n = 0;
            } 
            if(n > 0){
                multiplicar(n);
            }
            System.out.printf("\nDIGITE 0 PARA FINALIZAR\n");
        }
        while (n != 0);

        scanner.close();
    }
    
    public static void multiplicar(int x) {
        System.out.printf("\n===MULTIPLICAÇÃO===\n");
        for(int i = 0; i < 10; i++) {
            int mult = i + 1;
            int res = x * mult;
            System.out.printf("\n%d X %d = %d ", x, mult, res);
            parImpar(res);

        }
    }

    public static void parImpar(int y){
        if (y % 2 == 0) {
            System.out.printf("PAR");
        } 
        else {
            System.out.printf("ÍMPAR");
        }
    }
}