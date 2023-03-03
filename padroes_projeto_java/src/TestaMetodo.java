public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoAnderson = new Conta();
		contaDoAnderson.saldo = 100;
		contaDoAnderson.deposita(50);
		System.out.println(contaDoAnderson.saldo);

		boolean conseguiuRetirar = contaDoAnderson.saca(20);
		System.out.println(contaDoAnderson.saldo);
		System.out.println(conseguiuRetirar);

		Conta ContaJosefina = new Conta();
		ContaJosefina.deposita(1000);

		boolean sucessoTransferencia = ContaJosefina.transfere(300, contaDoAnderson);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(ContaJosefina.saldo);
		System.out.println(contaDoAnderson.saldo);
	}

}