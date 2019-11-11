#language: pt
#Author: Ronaldo silva
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: - Validar pessoa

  @starwars01 @Regressivo
  Cenario: CT001 - validar people
    Dado que faco uma requisicao GET/people
    Entao devo receber um status code '200' da requisicao people
    E os dados da pessoa pesquisada na tabela abaixo
    | name           | height | mass | hair color | skin color | eye color | birth year  | gender |
		| Luke Skywalker | 172 	  | 77   | blond      | fair		   | blue 		 | 19BBY 	     | male   |
		
		
		
	
