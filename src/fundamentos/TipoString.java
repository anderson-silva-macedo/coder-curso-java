package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        
        System.out.println("Anderson".charAt(0));

        // obs. string é um objeto imutavel
        String s = "Boa tarde";

        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        //exemplos
        var nome = "Anderson";
        var sobrenome = "Macedo";
        var idade = 38;
        var salario = 5.5986;
        //abreviacao para concatenação
        //%s para string
        //%d para numero inteiro
        //%f para float
        // .2f para duas casas decimais
        // \n quebra de linha
        
        System.out.printf("Meu nome é %s meu sobrenome é %s, eu tenho %d de idade e meu salario é %.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("\nMeu nome é %s meu sobrenome é %s, eu tenho %d de idade e meu salario é %.2f.", nome, sobrenome, idade, salario);

        System.out.println(frase);
    }
}
