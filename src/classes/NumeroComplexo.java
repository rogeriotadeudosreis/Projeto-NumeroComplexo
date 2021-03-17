package classes;

public class NumeroComplexo {

    private int parteReal = 0;
    private int parteImaginaria = 0;

    // Método construtor sem parâmetro, construtor vazio
    public NumeroComplexo() {
        parteReal = 0;
        parteImaginaria = 0;
    }

    //Método set recebendo dois parâmetros (parte real e parte imaginária)
    public void set(int parteReal, int parteImaginaria)  {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
       
    }

    // Método construtor com dois parâmetros
    public NumeroComplexo(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
        // throw new Exception("Entrada inválida");
    }

    // Metodo construtor com objeto como parâmetro
    public NumeroComplexo(NumeroComplexo objeto) {
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;
        // throw new Exception("Objeto inválido");
    }

    //Método set com um objeto como parâmetro
    public void set(NumeroComplexo objeto) {
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;
        // throw new Exception("Objeto inválido");
    }

    //Método get que retorna uma String com a expressão de um número complexo
    public String get() {
        return (parteReal + "+" + parteImaginaria + "i");
    }

    //Método adiciona recebendo um objeto do tipo NumeroComplexo para 
    //adicionar com outro objeto do mesmo tipo.
    //Detalhe: dentro deste método, outro método construtor numerocomplexo    
    public NumeroComplexo adiciona(NumeroComplexo objeto) {
        //Aqui criamos de forma didática duas variáveis recebendo a soma dos 
        //valores da parte real e parte imaginária
        int real = this.parteReal + objeto.parteReal;
        int imaginaria = this.parteImaginaria + objeto.parteImaginaria;
        NumeroComplexo auxSoma = new NumeroComplexo(real, imaginaria);
        return auxSoma;

    }

    //Método subtração recebendo também um objeto do tipo complexo para
    //subtrair outro objeto do mesmo tipo
    //Detalhe: dentro deste método outro método construtor numerocomplexo
    public NumeroComplexo subtrai(NumeroComplexo objeto) {
        int real = this.parteReal - objeto.parteReal;
        int imaginaria = this.parteImaginaria - objeto.parteImaginaria;
        NumeroComplexo auxSubtracao = new NumeroComplexo(real, imaginaria);

        return auxSubtracao;
    }

    public NumeroComplexo multiplica(NumeroComplexo objeto) {

        int real = (this.parteReal * objeto.parteReal) - (this.parteImaginaria * objeto.parteImaginaria);
        int imaginaria = (this.parteReal * objeto.parteImaginaria) + (this.parteImaginaria * objeto.parteReal);

        NumeroComplexo auxMultiplicar = new NumeroComplexo(real, imaginaria);
        return auxMultiplicar;
    }

   public NumeroComplexo dividir(NumeroComplexo objeto) {

        int real = (((this.parteReal * objeto.parteReal) + (this.parteImaginaria * objeto.parteImaginaria))
                / ((objeto.parteReal * objeto.parteReal) + (objeto.parteImaginaria * objeto.parteImaginaria)));
        
        int imaginaria = (((this.parteImaginaria * objeto.parteReal) - (this.parteReal * objeto.parteImaginaria))
                / ((objeto.parteReal * objeto.parteReal) + (objeto.parteImaginaria * objeto.parteImaginaria)));

        NumeroComplexo resultado = new NumeroComplexo(real, imaginaria);
        return resultado;
    }

    public boolean eIgual(NumeroComplexo objeto) {

        return (this.parteReal == objeto.parteReal) && (this.parteImaginaria == objeto.parteImaginaria);
    }

}
