
public class GeradorXmlSicli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "";
		String cpf = "";
		String documento = "";

		GeraCpf numero = new GeraCpf();
		// GeraCocli cocli = new GeraCocli();

		GeraNomeParticipante participante = new GeraNomeParticipante();

		DadosComumCli dados = new DadosComumCli();

		nome = participante.getNome();
		numero.GeradorRaiz(0);
		cpf = numero.getCpf();


		// System.out.println("XML PreCli");
		// //System.out.println(cocli.cocli);
		// System.out.println(""); // Cocli é vazio no PreCli
		// System.out.println(cpf);
		// System.out.println(dados.TipoPessoa);
		// System.out.println(nome + cpf);
		// System.out.println(dados.dataNascimento);
		// System.out.println(cpf.substring(0,9));
		// System.out.println(cpf.substring(9, 11));
		// System.out.println(dados.titularidadeCpf);
		// System.out.println(dados.regularidadeCpf);
		// System.out.println(dados.consistenciaCpf);
		// System.out.println(dados.situacCpfCaixa);
		// //System.out.println(cocli.cocli);
		// System.out.println(""); // Cocli é vazio no PreCli
		// System.out.println(dados.sexo);
		// System.out.println(dados.codPaisOrigem);
		// System.out.println(dados.codEstCivil);
		// System.out.println(dados.descTipOrgEmissorRg);
		// System.out.println(dados.siglaTipOrgEmissorRg);
		// System.out.println(dados.tipoOrgaoEmissorRg);
		// System.out.println(dados.numeroIdentidadeRg);
		// System.out.println(dados.siglaUfEmissaoRg);
		// System.out.println(dados.dtEmissaoIdentRg);
		// System.out.println(dados.identAtivaRg);
		// System.out.println(dados.codProdutoEnderecoNacional);
		// System.out.println(dados.identContratoEnderecoNacional);
		// System.out.println(dados.tipoLogradouroEnderecoNacional);
		// System.out.println(dados.logradouroEnderecoNacional);
		// System.out.println(dados.numeroEnderecoNacional);
		// System.out.println(dados.complementoEnderecoNacional);
		// System.out.println(dados.bairroEnderecoNacional);
		// System.out.println(dados.codMunicipioEnderecoNacional);
		// System.out.println(dados.nomeMunicipioEnderecoNacional);
		// System.out.println(dados.cepEnderecoNacional);
		// System.out.println(dados.siglaUfEnderecoNacional);
		// System.out.println(dados.correspondenciaEnderecoNacional);
		// System.out.println(dados.propagandaEnderecoNacional);
		// System.out.println(dados.descProfissSiric);
		// System.out.println(dados.profissaoSiric);
		// System.out.println(dados.dtInicioProfissSiric);
		// System.out.println(dados.dtTerminoProfissSiric);
		// System.out.println(dados.profPrincipalProfissSiric);
	}

}
