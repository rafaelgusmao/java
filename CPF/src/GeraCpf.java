import java.util.Random;

public class GeraCpf {

	String cpf = "";
	
	public void GeradorRaiz(int qt) { // Gera os 9 primeiros algarismos aleatorios. Chama o gerador de digito e ao final exibe o CPF completo


		Random numero = new Random();
		int nxint = 0;

		for (int n = 0; n < qt; n++) {

			for (int i = 0; i < 9; i++) {
				nxint = numero.nextInt(9);
				cpf = cpf + nxint;
			}

			GeraDigito digito = new GeraDigito();

			digito.GeraDigito1(cpf);
		

			//System.out.println(cpf + "" + digito.getQ1() + "" + digito.getQ2());
			
			cpf = cpf + "" + digito.getQ1() + "" + digito.getQ2();

		}
	}

	public String getCpf() {
		GeradorRaiz(1);
		return cpf;
	}
}
