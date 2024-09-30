# DesafioPOO
Repositório com os fontes do Desafio de POO 

### Desafio do projeto
Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

### Diagrama
```mermaid
classDiagram
    class iPhone {
    }

	class ReprodutorMusical {
		+tocar()
		+pausar()
		+selecionarMusica(String musica)
	}
	<<interface>> ReprodutorMusical

	class AparelhoTelefonico{
		+ligar(String numero)
		+atender()
		+iniciarCorreioVoz()
	}
	<<interface>> AparelhoTelefonico


	class Navegador na Internet {
		+exibirPagina(String url)
		+adicionarNovaAba()
		+atualizarPagina()
	}
	<<interface>> Navegador na Internet

	iPhone --|> ReprodutorMusical
	iPhone --|> AparelhoTelefonico
	iPhone --|> Navegador na Internet
