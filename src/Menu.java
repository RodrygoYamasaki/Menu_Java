import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoconta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;


        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoconta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n**************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir Saldo
                3 - Receber Saldo
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O Saldo atualizado é "+ saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não hâ saldo para realizar transfêrencia");
                } else {
                    saldo -= valor;
                    System.out.println("Novo Saldo" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida! ");
            }
        }
    }
}
