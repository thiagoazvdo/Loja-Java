# Projeto para implementar conceitos praticos de Interface em Java

~ Entendendo melhor o exemplo e contexto do programa ~

* PACOTE IMPRESSAOINTERFACE

# 1. A interface Impressora possui um metodo sem retorno que recebe um objeto do tipo imprimivel

# 2. A interface Imprimivel possui os metodos getCabecalhoPagina e getCorpoPagina, ambos retornam strings. 

# 3. Temos 2 tipos de impressora, a HP e a Epson ~ Implementam a interface Impressora que por sua vez implementa 
o metodo imprimir que requer por parametro um objeto do tipo Imprimivel.

* PACOTE PAGAMENTOINTERFACE

# 1. A interface Autorizavel possui um metodo double getValorTotal

# 2. A interface Operadora possui um metodo boolean autorizar que recebe por parametro um objeto que 
implementa Autorizavel e um cartao.

# 3. Temos as classes Cartao que possui um titular e um numero, Cielo e RedeCard que implementam a interface Operadora.

* PACOTE PAGAMENTOCAIXA

# 1. Classe Compra implementa a interface Autorizavel e Imprimivel, ou seja, implementa os metodo getValorTotal,
getCabecalhoPagina e getCorpoPagina. De atributos possui valorTotal, produto e nomeCliente. 

# 2. Classe Checkout possui atributos de classe dos tipos Operadora e Impressora que sao obrigatorios para 
instanciacao da mesma. Temos ainda o metodo fecharCompra que recebe por parametro uma Compra e um Cartao. 

* PACOTE-TESTE

# 1. Por ultimo uma classe de Teste Main que :
 		1.1 instancia RedeCard do tipo Impressora;
		1.2 uma impressora HP do tipo Impressora;
		1.3 um cartao;
		1.4 uma compra;
		1.5 o checkout para fechar a compra e imprimir a nota.
		
