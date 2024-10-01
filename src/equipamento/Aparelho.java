package equipamento;

public class Aparelho {

	public static void main(String[] args) {
		iPhone iPhone = new iPhone();
		
		ReprodutorMusical reprodutorMusical = iPhone;
		AparelhoTelefonico aparelhoTelefonico = iPhone;
		NavegadorInternet navegadorInternet = iPhone;
		
		reprodutorMusical.tocar();
		aparelhoTelefonico.atender();
		navegadorInternet.exibirPagina("ww.teste.com");

	}

}
