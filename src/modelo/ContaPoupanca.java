package modelo;
import java.math.BigDecimal;

// modelo.ContaPupanca - FQN
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(BigDecimal valor) {
        BigDecimal valorASacar = valor.add(BigDecimal.valueOf(0.2));
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(BigDecimal valor) {
        super.saldo = saldo.add(valor);
    }

}
