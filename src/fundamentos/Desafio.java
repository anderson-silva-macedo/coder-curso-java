package fundamentos;

public class Desafio {
    public static void main(String[] args) {
        //constante
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("O resultado é " + celsius);

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        
        System.out.println("O resultado é " + celsius);

    }
}
