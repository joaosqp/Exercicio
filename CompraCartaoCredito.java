public class CompraCartaoCredito extends CompraCartao {

//toString
    @Override
    public String toString() {
        return super.toString() + "(Credito)";
    }  

    protected int diaFatura;    //Atributo

//Construtor
    public CompraCartaoCredito(int data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
        conta.reterLimitDisp(valor);
    }
        
}

 

