package br.com.starwars.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class PeopleDTO {
	
	
	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
	private List<String> films = null;
	private List<String> species = null;
	private List<String> vehicles = null;
	private List<String> starships = null;
	private String created;
	private String edited;
	private String url;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getName() {
	return name;
	}

	public String getHeight() {
	return height;
	}

	public String getMass() {
	return mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public String getSkin_color() {
		return skin_color;
	}

	public String getEye_color() {
		return eye_color;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public String getGender() {
	return gender;
	}

	public String getHomeworld() {
	return homeworld;
	}

	public List<String> getFilms() {
	return films;
	}

	public List<String> getSpecies() {
	return species;
	}


	public List<String> getVehicles() {
	return vehicles;
	}


	public List<String> getStarships() {
	return starships;
	}


	public String getCreated() {
	return created;
	}


	public String getEdited() {
	return edited;
	}

	public String getUrl() {
	return url;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}


}
