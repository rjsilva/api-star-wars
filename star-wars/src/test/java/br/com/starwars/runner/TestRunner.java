package br.com.starwars.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(snippets=SnippetType.CAMELCASE,
	monochrome=true, 
	plugin= {"html:target/surefire-reports/cucumber.html"},
	glue= {"br.com.starwars.steps"},
	features="classpath:features/",
	tags="@starwars01,@starwars02"
	) 
   
public class TestRunner {}