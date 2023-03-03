public class TestaBanco {
	public static void main(String[] args) {
		Cliente anderson = new Cliente();
		anderson.nome = "Anderson Cruz";
		anderson.cpf = "123.456.789-10";
		anderson.profissao = "programador";

		Conta ContaDoAnderson = new Conta();
		ContaDoAnderson.deposita(100);

		ContaDoAnderson.titular = anderson;
		System.out.println(ContaDoAnderson.titular.nome);
		System.out.println(ContaDoAnderson.titular);
		System.out.println(anderson);

	}
}
