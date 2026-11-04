import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("-- SIMULADOR DE CAIXA ELETRÔNICO --\n\n");
        
        double saldo = 500.0;
        double deposito = 0.0;
        double saque = 0.0;
        String n = "";

        while (!n.equals("4")){
            System.out.println(" ");
            System.out.println("1 - CONSULTAR SALDO");
            System.out.println("2 - REALIZAR DEPÓSITO");
            System.out.println("3 - REALIZAR SAQUE");
            System.out.println("4 - SAIR");

            System.out.printf("\n\nESCOLHA UMA OPÇÃO: ");
            n = scanner.nextLine();

            switch (n) {
                case "1":
                    consultarSaldo(saldo);
                    break;

                case "2":
                    System.out.printf("\n\nDIGITE O VALOR QUE DESEJA DEPOSITAR: ");
                    deposito = scanner.nextDouble(); scanner.nextLine();
                    saldo = realizarDeposito(deposito, saldo);
                    break;

                case "3":
                    System.out.printf("\n\nDIGITE O VALOR QUE DESEJA SACAR: ");
                    saque = scanner.nextDouble(); scanner.nextLine();
                    saldo = realizarSaque(saque, saldo);
                    break;

                case "4":
                    System.out.println("FIM DO PROGRAMA.");
                    break;

                default:
                    System.out.printf("\n\nDIGITE UMA OPÇÃO VÁLIDA!");
                    break;
            }
        }

        scanner.close();
    }

    public static double consultarSaldo(double saldo){
        System.out.printf("\nSALDO: %.2f\n", saldo);
        return saldo;
    }
    
    public static double realizarDeposito(double deposito, double saldo){
        if(deposito > 0.0) {
            saldo += deposito;
            System.out.printf("\nVALOR DEPOSITADO COM SUCESSO!\n");
            System.out.println("DEPÓSITO: " + deposito);
            System.out.println("NOVO SALDO: " + saldo);
        } 
        else {
            System.out.printf("\nDEPÓSITO INVÁLIDO! TENTE NOVAMENTE\n");
        }
        
        return saldo;
    }
    
    public static double realizarSaque(double saque, double saldo){
        if(saldo <= 0.0 || saldo < saque){
            System.out.printf("\nSALDO INSUFICIENTE!\n");
        }
        else if(saque > 0.0) {
            saldo -= saque;
            System.out.printf("\nVALOR RETIRADO COM SUCESSO!\n");
            System.out.println("SAQUE: " + saque);
            System.out.println("NOVO SALDO: " + saldo);
        } 
        else {
            System.out.printf("\nSAQUE INVÁLIDO! TENTE NOVAMENTE\n");
        }

        return saldo;
    }
}
