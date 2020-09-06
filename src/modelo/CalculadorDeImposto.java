package modelo;
import java.math.BigDecimal;

public class CalculadorDeImposto {

    private BigDecimal impostoTotal = BigDecimal.ZERO;

    public void registrar(Tributavel t) {
        BigDecimal valor = t.getValorImposto();
        this.impostoTotal = impostoTotal.add(valor);
    }

    public BigDecimal getTotalImposto(){
        return this.impostoTotal;
    }
}
