import java.util.Scanner;

public class atm
{
    public static void main(String[] args)
    {
        int balance = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("Caixa Eletrônico");
            System.out.println("Escolha 1 para sacar");
            System.out.println("Escolha 2 para depositar");
            System.out.println("Escolha 3 para extrato");
            System.out.println("Escolha 4 para Sair");
            System.out.println("Escolha sua opção:");

            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Insira o valor para sacar:");

                    withdraw = sc.nextInt();

                    if (balance>= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Por favor, retire seu dinheiro!");
                    } else {
                        System.out.println("Você não tem saldo o suficiente!");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Insira o valor para depositar");

                    deposit = sc.nextInt();

                    balance = balance + deposit;

                    System.out.println("Seu dinheiro foi depositado com sucesso!");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance:" + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}