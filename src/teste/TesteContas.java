package teste;

import java.math.BigDecimal;

public class TesteContas {
	public static void main(String[] args) {
		modelo.ContaPoupanca cp = new modelo.ContaPoupanca(123, 456);
		cp.deposita(new BigDecimal(1000));
		System.out.println("cp " + cp.getSaldo());

		modelo.ContaCorrente cc = new modelo.ContaCorrente(321, 654);
		cc.deposita(new BigDecimal(200));
		System.out.println("cc " + cc.getSaldo());

		cp.transfere(new BigDecimal(150), cc);

		System.out.println("========");
		cc.saca(new BigDecimal(100));
		cp.saca(new BigDecimal(100));

		System.out.println("novo cp " + cp.getSaldo());
		System.out.println("novo cc " + cc.getSaldo());
	}
}
