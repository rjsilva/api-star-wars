package br.com.starwars.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanetDTO {
	
	private String name;
	private String rotation_period;
	private String orbital_period;
	private String diameter;
	private String climate;
	private String gravity;
	private String terrain;
	private String surface_water;
	private String population;
	private List<String> residents = null;
	private List<String> films = null;
	private String created;
	private String edited;
	private String url;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	public String getName() {
		return name;
	}
	public String getRotation_period() {
		return rotation_period;
	}
	public String getOrbital_period() {
		return orbital_period;
	}
	public String getDiameter() {
		return diameter;
	}
	public String getClimate() {
		return climate;
	}
	public String getGravity() {
		return gravity;
	}
	public String getTerrain() {
		return terrain;
	}
	public String getSurface_water() {
		return surface_water;
	}
	public String getPopulation() {
		return population;
	}
	public List<String> getResidents() {
		return residents;
	}
	public List<String> getFilms() {
		return films;
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
		return additionalProperties;
	}

}
