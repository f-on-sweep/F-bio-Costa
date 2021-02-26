package testes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.Elem;
import metodos.Metd;

public class Stp {

	Metd md = new Metd();
	Elem mt = new Elem();

	@Given("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String url) throws Throwable {

		md.abrirNavegador(url, "Chrome");

	}

	@When("^incluir produtos no carrinho \"([^\"]*)\"$")
	public void incluir_produtos_no_carrinho(String texto) throws Throwable {

		md.escrever(mt.getPesquisar(), "botas masculinas");
		md.Submit(mt.getPesquisar());
		md.esperaImplicita();
		md.clicar(mt.getProduto());
		md.clicar(mt.getTamanho());
		md.clicar(mt.getComprar());
		md.clicar(mt.getEscolherMaisProduto());
		md.escrever(mt.getPesquisar(), "botas femininas");
		md.Submit(mt.getPesquisar());
		md.esperaImplicita();
		md.clicar(mt.getProdutoF());
		md.clicar(mt.getTamanho());
		md.clicar(mt.getComprar());
		md.clicar(mt.getContinuar());
		md.escrever(mt.getEmail(), "luizapaladin@gmail.com");
		md.clicar(mt.getProssegir());
		md.escrever(mt.getNome(), "Luiza");
		md.escrever(mt.getSobreNome(), "Silva");
		md.clicar(mt.getSexo());
		md.escrever(mt.getDia(), "15");
		md.escrever(mt.getMes(), "Ago");
		md.escrever(mt.getAno(), "2021");
		md.escrever(mt.getCpf(), "846.814.178-07");
		md.escrever(mt.getCep(), "06120130");
		md.escrever(mt.getTipoEndere�o(), "Rua");
		md.escrever(mt.getNomeRua(), "Ipe");
		md.escrever(mt.getNumero(), "30");
		md.escrever(mt.getBairro(), "Jardim das Fl�res");
		md.escrever(mt.getEstado(), "S�o Paulo");
		md.escrever(mt.getCidade(), "Osasco");
		md.escrever(mt.getTel(), "11986722456");
		md.escrever(mt.getSenha(), "123456");
		md.clicar(mt.getContinuarOp());
		md.esperaImplicita();

	}

	@Then("^validar os produtos incluidos no carrinho$")
	public void validar_os_produtos_incluidos_no_carrinho() throws Throwable {
 
		md.validarTexto();
		md.fechar();

	}

}
