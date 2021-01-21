package banco_superior.exercicio;

import banco_superior.persistencia.IPersistenciaCliente;
import banco_superior.persistencia.PersistenciaEmArquivoCliente;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IConta conta3 = new ContaCorrente("Carol", "222", "AA", "CC", "24-12-2020");

		IConta conta4 = new ContaPoupanca("Alicia", "012", "AA", "CP", "24-12-2020");


		ClientePessoaFisica cliente3 = new ClientePessoaFisica("Gustavo", "999", "130", "21-01-2001");

		ClientePessoaJuridica cliente4 = new ClientePessoaJuridica("Padaria", "48-00", "14-10-1998", "ME",
				"p@gmail.com");

		
		cliente3.adicionarcontaCliente(conta3);
		
		cliente4.adicionarcontaCliente(conta4);
		
		

		cliente3.adicionarTelefone("11-991713050");
		cliente4.adicionarTelefone("99-991787077");


		IPersistenciaCliente pac = new PersistenciaEmArquivoCliente();

		pac.cadastrarCliente(cliente3);
		pac.cadastrarCliente(cliente4);
		
		
		ICliente obj = pac.localizarClientePorCPF("122");
		ICliente obj1 = pac.localizarClientePorCNPJ("458-00");
		ICliente obj2 = pac.localizarClientePorCPF("999");
		ICliente obj3 = pac.localizarClientePorCNPJ("48-00");

		System.out.println(obj);

		System.out.println(obj1);
		
		System.out.println(obj2);

		System.out.println(obj3);
		
		//quando retornar só o objeto com apenas o cpf, signifca que o objeto não foi encontrado
		
		//resolvido =) ++

	}

}
