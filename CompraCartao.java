public class CompraCartao extends Compras{

//toString
    @Override
    public String toString() {
        return super.toString() + nomeBanco + "; ";
    }

    private String nomeBanco;       //Atributo
    private Conta conta;            //Atributo

//Construtor
    public CompraCartao(int data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor);
        this.nomeBanco = conta.getNomeBanco();
        this.conta = conta;
    }
    
}
