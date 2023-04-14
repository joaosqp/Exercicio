public class CompraCartaoCreditoParcelada extends CompraCartaoCredito{

//toString
    @Override
    public String toString() {
        return super.toString() + " [" + nParcelas + "x]";
    }

    protected int nParcelas;            // Atributo
    protected float valorParcela;       // Atributo

//Construtor
    public CompraCartaoCreditoParcelada(int data, String idCompra, float valor, Conta conta, int nParcelas) {
        super(data, idCompra, valor, conta);
        this.nParcelas = nParcelas;
        calcValorParcela();
    }

//Metodo
    private void calcValorParcela(){
       this.valorParcela = this.valor / this.nParcelas;
    }
    
    
}

   

    

    

