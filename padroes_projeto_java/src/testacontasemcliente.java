public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaMateus = new Conta();
		System.out.println(contaMateus.saldo);

		contaMateus.titular = new Cliente();
		System.out.println(contaMateus.titular);

		contaMateus.titular.nome = "Mateus";
		System.out.println(contaMateus.titular.nome);

	}
}