package br.com.starwars.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import br.com.starwars.controllers.PeopleController;
import br.com.starwars.dto.PeopleDTO;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class PeopleSteps {

	private PeopleController peopleController;
	private com.jayway.restassured.response.Response response;
	private PeopleDTO people;

	public PeopleSteps() {

		this.peopleController = new PeopleController();
		this.people = new PeopleDTO();

	}
	
	@Dado("^que faco uma requisicao GET/people$")
	public void queFacoUmaRequisicaoGETPeople() throws Throwable {
		this.peopleController.getMapping().getBody();
		response = peopleController.getMapping();
	}

	@Entao("^devo receber um status code '(\\d+)' da requisicao people$")
	public void devoReceberUmStatusCode(int code) throws Throwable {
		assertEquals(code, response.statusCode());
	}

	@Entao("^os dados da pessoa pesquisada na tabela abaixo$")
	public void os_dados_da_pessoa_pesquisada_na_tabela_abaixo(DataTable tabela) throws Throwable {
		
		List<Map<String, String>> list = tabela.asMaps(String.class, String.class);
		
	    people = response.as(PeopleDTO.class);
	    assertEquals(list.get(0).get("name"), people.getName());
	    assertEquals(list.get(0).get("height"), people.getHeight());
	    assertEquals(list.get(0).get("mass"), people.getMass());
	    assertEquals(list.get(0).get("hair color"), people.getHair_color());
	    assertEquals(list.get(0).get("skin color"), people.getSkin_color());
	    assertEquals(list.get(0).get("eye color"), people.getEye_color());
	    assertEquals(list.get(0).get("birth year"), people.getBirth_year());
	    assertEquals(list.get(0).get("gender"), people.getGender());
	}

}
