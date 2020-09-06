package modelo;
import java.math.BigDecimal;

public abstract class Conta {

    protected BigDecimal saldo;
    private int agencia, numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = BigDecimal.ZERO;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(BigDecimal valor);

    public boolean saca(BigDecimal valor) {
        if(this.saldo.compareTo(valor) >= 0) {
            this.saldo = saldo.subtract(valor);
            return true;
        }
        return false;
    }

    public boolean transfere(BigDecimal valor, Conta destino) {
        if(this.saca(valor)) {
        		destino.deposita(valor);
        		return true;
        }
        return false;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
