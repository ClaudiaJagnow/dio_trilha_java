import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário]
        //Obter pela scanner os valores digitados no terminal
        //Exibir a msn conta criada
        
        //String nome;
        //tring agencia;
        //double saldo ;

       Scanner scanner = new Scanner(System.in);
       System.out.print("Por favor, digite o número da agencia:");
       String agencia = scanner.next();
       System.out.println("Você digitou: " + agencia);

       System.out.print("Agora insira o numero da sua conta:");
        int numero = scanner.nextInt();
       System.out.println("Você digitou: " + numero);

       System.out.print("Caro cliente insira o seu nome");
        String nome = scanner.next();
       System.out.println("Você digitou: " + nome);

       System.out.print("Qual valor você deseja sacar?");
        double saldo = scanner.nextDouble();
       System.out.println("Seu saldo é : " + saldo );

      System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );

    }
}
