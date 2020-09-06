package teste;

import java.math.BigDecimal;

public class TesteTributaveis {

    public static void main(String[] args) {
        modelo.ContaCorrente cc = new modelo.ContaCorrente(123, 222);
        cc.deposita(new BigDecimal(100));
        System.out.println(cc.getSaldo());

        modelo.SeguroDeVida se = new modelo.SeguroDeVida();

        modelo.CalculadorDeImposto calc = new modelo.CalculadorDeImposto();
        calc.registrar(cc);
        calc.registrar(se);

        System.out.println(calc.getTotalImposto());
    }
}
