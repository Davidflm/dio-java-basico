import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        Double saldo;

        Scanner enter = new Scanner(System.in);
        System.out.println("Digite o n�mero da sua conta: ");
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
                "Ol�, %s, obrigado por criar sua conta em nosso banco, sua Agencia � %s e conta %s  e seu saldo %-10.2f j� esta disponivel para saque",
                nome, agencia,numero, saldo);

    }
}
