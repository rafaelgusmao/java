
public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente g1 = new Gerente();
		g1.setNome("Rafael");
		g1.setCpf("09899900012");
		g1.setSalario(6000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
	
		//g1.setSenha(2222);
		
	//	boolean autenticou = g1.autentica(2222);
	
		
//		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
