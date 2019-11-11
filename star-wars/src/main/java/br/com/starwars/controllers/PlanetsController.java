package br.com.starwars.controllers;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.EncoderConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import br.com.starwars.config.EndPoint;
import br.com.starwars.service.Http;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class PlanetsController extends Http<Response> {

	/**
	 * lista planetas
	 */
	@Override
	public Response getMapping() {

		
		try {
			Response response = RestAssured
					.given()
					.config(RestAssured.config()
				    .encoderConfig(EncoderConfig.encoderConfig()
					.encodeContentTypeAs("aplication/json",ContentType.JSON)))
					.when()
					.baseUri(EndPoint.BASE_URL_PLANETS).get();

			return response;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
}
