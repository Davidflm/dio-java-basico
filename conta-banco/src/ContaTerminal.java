import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        Double saldo;

        Scanner enter = new Scanner(System.in);
        System.out.println("Digite o número da sua conta: ");
        numero = enter.nextInt();
        System.out.println("Agora informe sua agencia: ");
        agencia = enter.next();
        enter.nextLine();
        System.out.println("Digite seu nome e sobrenome: ");
        nome = enter.nextLine();
        System.out.println("Por favor, informe seu saldo:");
        saldo = enter.nextDouble();
        
        enter.close();
        System.out.printf(
                "Olá, %s, obrigado por criar sua conta em nosso banco, sua Agencia é %s e conta %s  e seu saldo %-10.2f já esta disponivel para saque",
                nome, agencia,numero, saldo);

    }
}
