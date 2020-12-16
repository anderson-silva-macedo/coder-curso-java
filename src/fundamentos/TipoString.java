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


    }
}
