
public class GeraDigito {
	int total9 = 0;
	int total10 = 0;
	int q1 = 0;
	int q2 = 0;

	
	public void GeraDigito1(String RaizCpf) { // Faz o primeiro bloco de contas para gerar o 1ª digito do  dv e chama o metodo gerador do 2º digito

		String cpf = RaizCpf;
		int mult = 10;

		for (int i = 0; i < 9; i++) {

			int RaizCpf2 = Integer.parseInt(cpf.substring(i, i + 1));
			total9 = RaizCpf2 * (mult - i) + total9;

		}
		ValidaDigito1();
		GeraDigito2(cpf+q1);
		
		//System.out.println();

	}

	public int getQ1() {
		return q1;
	}

	public int getQ2() {
		return q2;
	}

	public void ValidaDigito1() { // faz a validacao do 1º dv

		q1 = total9 % 11;

		if (q1 < 2) {
			q1 = 0;
		} else {
			q1 = 11 - q1;
		}

	}

	public void GeraDigito2(String cpf) { //Executa o bloco que gera o 2º digito do DV 

		String dig2 = cpf;
		int mult = 11;

		for (int i = 0; i < 10; i++) {
			dig2.substring(i, i + 1);
			int RaizCpf2 = Integer.parseInt(cpf.substring(i, i + 1));
			total10 = RaizCpf2 * (mult - i) + total10;

		}
		
		ValidaDigito2();
	}

	public void ValidaDigito2() { // valida o 2º digito do DV

		q2 = total10 % 11;

		if (q2 < 2) {
			q2 = 0;
		} else {
			q2 = 11 - q2;
		}

	}
}
