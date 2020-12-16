package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        
        // 8 tipos primitivos em java 
        
        //sendo 4 numeros inteiros e 2 com ponto flutuante

        // tipo primitivo com numero inteiro, capacidade de armazenamento
        // byte 1
        byte anosDeEmpresa = 23; 
        // short 2
        short numeroDeVoos = 542;
        //int 4 
        int idFuncionarioEmpresa = 5965423;
        //long 8
        long pontosAcumulados = 5_636_666_255_25L;

        System.out.println(anosDeEmpresa);
        System.out.println(numeroDeVoos);
        System.out.println(idFuncionarioEmpresa);
        System.out.println(pontosAcumulados);
       
        // tipos primitivo com ponto flutuante, capacidade de armazenamento
       
        //float 4
        float valeRefeicao = 14.56F;
        //double 8
        double salario = 1500.00;
        //char representa uma letra
        char tipoSexo = 'M';
        //boolean verdadeiro ou falso
        boolean estaDeFerias = false;

        System.out.println(valeRefeicao);
        System.out.println(salario);
        System.out.println(tipoSexo);
        System.out.println(estaDeFerias);
    }
}
