package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        
        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replace("X", "Anderson");
        //observacao como foi reatribuido o valor do x agora o 
        //toUpperCase não vai mais funcionar tem que reatribuir o valor
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        //outros casos interessantes
        String x = "Bom dia".toUpperCase();

        System.out.println(x);

        String y = "Y"
            .replace("Y", "Oie Anderson")
            .toUpperCase()
            .concat("!!!");

        System.out.println(y);
    }
}
