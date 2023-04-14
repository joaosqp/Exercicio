public class CompraCartaoDebito extends CompraCartao{

//toString
    @Override
    public String toString() {
        return super.toString() + "(Debito)";
    }

//Construtor
    public CompraCartaoDebito(int data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
        conta.debitar(valor);
    }
      
}
    

