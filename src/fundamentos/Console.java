package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        
        System.out.println("Olá qual é seu nome?");

        Scanner entrada = new Scanner(System.in);
        
        String nome = entrada.nextLine();
        
        System.out.println("O seu nome é  "+ nome);
        
        System.out.println("Qual sua idade?");

        int idade = entrada.nextInt();
        
        System.out.printf("Meu nome é %s e minha idade é %d", nome, idade);

        entrada.close();

    }
}
