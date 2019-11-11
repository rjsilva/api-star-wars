package br.com.starwars.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import br.com.starwars.controllers.PlanetsController;
import br.com.starwars.dto.PlanetDTO;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class PlanetsSteps {

	private PlanetsController planetsController;
	private com.jayway.restassured.response.Response response;
	private PlanetDTO planet;

	public PlanetsSteps() {

		this.planetsController = new PlanetsController();
		this.planet = new PlanetDTO();

	}
	
	@Dado("^que faco uma requisicao GET/planet$")
	public void queFacoUmaRequisicaoGETPeople() throws Throwable {
		this.planetsController.getMapping().getBody();
		response = planetsController.getMapping();
	}
	
	@Entao("^devo receber um status code '(\\d+)' da requisicao planet$")
	public void devoReceberUmStatusCode(int code) throws Throwable {
		assertEquals(code, response.statusCode());
	}

	@Entao("^os dados do planeta pesquisada na tabela abaixo$")
	public void os_dados_da_pessoa_pesquisada_na_tabela_abaixo(DataTable tabela) throws Throwable {
		
		List<Map<String, String>> list = tabela.asMaps(String.class, String.class);
		
		planet = response.as(PlanetDTO.class);
	    assertEquals(list.get(0).get("name"), planet.getName());
	    assertEquals(list.get(0).get("rotation period"), planet.getRotation_period());
	    assertEquals(list.get(0).get("orbital period"), planet.getOrbital_period());
	    assertEquals(list.get(0).get("diameter"), planet.getDiameter());
	    assertEquals(list.get(0).get("climate"), planet.getClimate());
	    assertEquals(list.get(0).get("gravity"), planet.getGravity());
	    assertEquals(list.get(0).get("terrain"), planet.getTerrain());
	    assertEquals(list.get(0).get("surface water"), planet.getSurface_water());
	    assertEquals(list.get(0).get("population"), planet.getPopulation());
	}

}
