import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner entradaDados= new Scanner(System.in);
        System.out.println("-------------Terminal Bancario--------------");

        System.out.println("Digite o nome do Cliente:");
        String nomeCliente= entradaDados.nextLine();

        System.out.println("Digite o numero da Agencia:");
        String agencia= entradaDados.nextLine();

        System.out.println("Digite o numero:");
        int numero = entradaDados.nextInt();

        System.out.println("Digite o saldo");
        double saldo = entradaDados.nextDouble();

        entradaDados.close();

        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");


    }
}
