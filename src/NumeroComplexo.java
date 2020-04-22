public class NumeroComplexo {
    private int ParteReal;
    private int ParteImaginaria;
    NumeroComplexo(){

    }
    NumeroComplexo(int ParteReal, int ParteImaginaria){
        this.ParteReal = ParteReal;
        this.ParteImaginaria = ParteImaginaria;
    }
    void Multiplicao(NumeroComplexo Primeiro, NumeroComplexo Segundo){
          this.ParteReal = (Primeiro.ParteReal * Segundo.ParteReal) - (Primeiro.ParteImaginaria * Segundo.ParteImaginaria);
          this.ParteImaginaria = (Primeiro.ParteReal * Segundo.ParteImaginaria) + (Primeiro.ParteImaginaria * Segundo.ParteReal);
    }
    void Impressão(){
        if(ParteImaginaria >= 0) {
            System.out.println(ParteReal+" + "+ParteImaginaria+"i");
        }else{
            System.out.println(ParteReal+" "+ParteImaginaria+"i");
        }
    }
}
