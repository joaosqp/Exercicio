import java.util.ArrayList;

public class Compras {

//toString
    @Override
    public String toString() {
        return "Compra: " + data + "; "+ idCompra + "; " + valor+ "; ";
    }

    protected int data;             // Atributo
    protected String idCompra;      // Atributo
    protected float valor;          // Atributo
    
//Lista de todas as compras
    public static ArrayList<Compras> listaCompra = new ArrayList<>();

//Construtor
    public Compras(int data, String idCompra, float valor) {
        this.idCompra = idCompra;
        this.valor = valor;
        this.data = data;
        
    }

//Metodos
    public Compras(int data, String idCompra, float valor, Conta conta) {
        listaCompra.add(new CompraCartaoDebito(data,idCompra,valor,conta));
        
    }
    public Compras(int data, String idCompra, float valor, Conta conta, int nParcelas) {
        if (nParcelas == 1){
            listaCompra.add(new CompraCartaoCreditoAVista(data,idCompra,valor,conta));

        }else if(nParcelas > 1){
            listaCompra.add(new CompraCartaoCreditoParcelada(data,idCompra,valor,conta,nParcelas));
        }
        
    }
    
 

    
}
    