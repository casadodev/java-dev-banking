package modelo;
import java.math.BigDecimal;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    // Anotação, para sobrescrever o metodo na mãe.
    // Força o compilador a saber que está usando um
    // método já existente na classe mãe
    @Override
    public boolean saca(BigDecimal valor) {
        BigDecimal valorASacar = valor.add(BigDecimal.valueOf(0.2));
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(BigDecimal valor) {
        super.saldo = saldo.add(valor);
    }

    @Override
    public BigDecimal getValorImposto() {
        return super.saldo.multiply(BigDecimal.valueOf(0.01));
    }
}
