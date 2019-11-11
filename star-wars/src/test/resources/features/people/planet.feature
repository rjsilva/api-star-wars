#language: pt
#Author: Ronaldo silva
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: - Validar planet

  @starwars02 @Regressivo
  Cenario: CT001 - validar planet
    Dado que faco uma requisicao GET/planet
    Entao devo receber um status code '200' da requisicao planet
    E os dados do planeta pesquisada na tabela abaixo
    | name     | rotation period | orbital period | diameter | climate | gravity    | terrain  | surface water | population |
		| Tatooine | 23           	 | 304            | 10465    | arid		 | 1 standard | desert 	 | 1             | 200000     |
