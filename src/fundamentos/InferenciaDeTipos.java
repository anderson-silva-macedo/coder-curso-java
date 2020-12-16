package fundamentos;

public class InferenciaDeTipos {
    public static void main(String[] args) {
        
        double a = 4.5;

        System.out.println(a);

        // o java infere o tipo da variavel conforme seu valor atribuido
        // no java não é possivel reatribuir uma variavel com outro tipo de dado.
        var b = 4.9;
        //não é possivel criar uma variavel sem que seja atribuida o valor
        // var e;
        // como uma variavel normal exemplo.
        //double i;
        //i = 2.6;
        System.out.println(b);
    }
}
