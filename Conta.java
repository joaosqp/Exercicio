
public class Conta implements InterfConta{

//toString
   @Override
   public String toString() {
      return "Conta [limiteDisponivel=" + limiteDisponivel + ", nomeBanco=" + nomeBanco + ", saldo=" + saldo + "]";
   }

   private int diaFatura;            // Atributo
   private float limite;             // Atributo
   private float limiteDisponivel;   // Atributo
   private float saldo;              // Atributo
   private String nomeBanco;         // Atributo
   private float taxaMensal;         // Atributo
   
// Construtor
   public Conta(float saldo, String nomeBanco, float limite) {
      this.nomeBanco = nomeBanco;
      this.limite = limite;
      this.saldo = saldo;
      this.limiteDisponivel = limite;
   }

// Metodo debitar saldo de conta
   public void debitar(float valor){
      saldo -= valor;
   }

// Metodo reter limite disponivel em conta
   public void reterLimitDisp(float valor){
      limiteDisponivel -= valor;
   }

//Metodo devolver limite em conta
   @Override
   public void devolverLimiteDispo(float valor) {
      this.limiteDisponivel += valor;
   }

// Metodos getters setters
   public String getNomeBanco() {
      return nomeBanco;
   }

   public void setNomeBanco(String nomeBanco) {
      this.nomeBanco = nomeBanco;
   }

   public float getLimite() {
      return limite;
   }

   public void setLimite(float limite) {
      this.limite = limite;
   }

   public float getLimiteDisponivel() {
      return limiteDisponivel;
   }

   public void setLimiteDisponivel(float limiteDisponivel) {
      this.limiteDisponivel = limiteDisponivel;
   }

   public float getSaldo() {
      return saldo;
   }

   public void setSaldo(float saldo) {
      this.saldo = saldo;
   }

   public int getDiaFatura() {
      return diaFatura;
   }

   public void setDiaFatura(int diaFatura) {
      this.diaFatura = diaFatura;
   }

   public float getTaxaMensal() {
      return taxaMensal;
   }

   public void setTaxaMensal(float taxaMensal) {
      this.taxaMensal = taxaMensal;
   }  
  
}


   
