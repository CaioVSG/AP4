public class Main {
    public static void main(String[] args){
        NumeroComplexo PrimeiroNumero = new NumeroComplexo(1,2);
        NumeroComplexo SegundoNumero = new NumeroComplexo(3,4);
        NumeroComplexo Resultado = new NumeroComplexo();
        Resultado.Multiplicao(PrimeiroNumero,SegundoNumero);
        Resultado.Impressão();
    }
}
