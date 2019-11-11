# api-star-wars

Manual Para Execução dos Testes - Api


Ferramentas

- IDE(Eclipse)

Tecnologias 

- Java 8
- Cucumber
- RestAssured
- Selenium
- Junit



Pré-Requisito: Atualizar o Projeto Api antes de rodar os testes, para baixar as dependências do maven
	
- Dentro da IDE
- Clicar botão direito no projeto
- Selecionar opção "Maven"
- Selecionar opção "Update maven project"
	
1 - Opção Rodar os testes pela IDE(Eclipse)

- Clicar botão direito no projeto
- Run As  -> JUnit Test
	
-------------Rodar os Testes Aplicação Api--------------- 
	
	Sistema Operacional Mac OSX
- Abrir Terminal
- Entra dentro do projeto
- Executar o camando "mvn test"
	
	Sistema Operacional Windows
- abrir cmd 
- Entra dentro do projeto
- Executar o camando "mvn test"

------------Reports do Testes -----------------------
	
- Dentro do projeto api
	
- Pasta target -> surefire--reports -> cucumber.html -> index.html
	
- clicar no "index.html" ou abrir com seu browser de preferência
	
obs: futuramente esse report, estará no jenkins
