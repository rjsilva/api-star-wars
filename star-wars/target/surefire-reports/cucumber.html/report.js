$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/people/people.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Author: Ronaldo silva"
    },
    {
      "line": 3,
      "value": "#Version: 1.0"
    },
    {
      "line": 4,
      "value": "#Encoding: UTF-8"
    }
  ],
  "line": 5,
  "name": "- Validar pessoa",
  "description": "",
  "id": "--validar-pessoa",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "CT001 - validar people",
  "description": "",
  "id": "--validar-pessoa;ct001---validar-people",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@starwars01"
    },
    {
      "line": 7,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que faco uma requisicao GET/people",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "devo receber um status code \u0027200\u0027 da requisicao people",
  "keyword": "Entao "
});
formatter.step({
  "line": 11,
  "name": "os dados da pessoa pesquisada na tabela abaixo",
  "rows": [
    {
      "cells": [
        "name",
        "height",
        "mass",
        "hair color",
        "skin color",
        "eye color",
        "birth year",
        "gender"
      ],
      "line": 12
    },
    {
      "cells": [
        "Luke Skywalker",
        "172",
        "77",
        "blond",
        "fair",
        "blue",
        "19BBY",
        "male"
      ],
      "line": 13
    }
  ],
  "keyword": "E "
});
formatter.match({
  "location": "PeopleSteps.queFacoUmaRequisicaoGETPeople()"
});
formatter.result({
  "duration": 6324264809,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "PeopleSteps.devoReceberUmStatusCode(int)"
});
formatter.result({
  "duration": 4041390,
  "status": "passed"
});
formatter.match({
  "location": "PeopleSteps.os_dados_da_pessoa_pesquisada_na_tabela_abaixo(DataTable)"
});
formatter.result({
  "duration": 591136741,
  "status": "passed"
});
formatter.uri("features/people/planet.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Author: Ronaldo silva"
    },
    {
      "line": 3,
      "value": "#Version: 1.0"
    },
    {
      "line": 4,
      "value": "#Encoding: UTF-8"
    }
  ],
  "line": 5,
  "name": "- Validar planet",
  "description": "",
  "id": "--validar-planet",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "CT001 - validar planet",
  "description": "",
  "id": "--validar-planet;ct001---validar-planet",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@starwars02"
    },
    {
      "line": 7,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que faco uma requisicao GET/planet",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "devo receber um status code \u0027200\u0027 da requisicao planet",
  "keyword": "Entao "
});
formatter.step({
  "line": 11,
  "name": "os dados do planeta pesquisada na tabela abaixo",
  "rows": [
    {
      "cells": [
        "name",
        "rotation period",
        "orbital period",
        "diameter",
        "climate",
        "gravity",
        "terrain",
        "surface water",
        "population"
      ],
      "line": 12
    },
    {
      "cells": [
        "Tatooine",
        "23",
        "304",
        "10465",
        "arid",
        "1 standard",
        "desert",
        "1",
        "200000"
      ],
      "line": 13
    }
  ],
  "keyword": "E "
});
formatter.match({
  "location": "PlanetsSteps.queFacoUmaRequisicaoGETPeople()"
});
formatter.result({
  "duration": 4183475494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "PlanetsSteps.devoReceberUmStatusCode(int)"
});
formatter.result({
  "duration": 168727,
  "status": "passed"
});
formatter.match({
  "location": "PlanetsSteps.os_dados_da_pessoa_pesquisada_na_tabela_abaixo(DataTable)"
});
formatter.result({
  "duration": 7140263,
  "status": "passed"
});
});