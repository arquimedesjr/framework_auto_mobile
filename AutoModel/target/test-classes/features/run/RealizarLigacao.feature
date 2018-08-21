Feature: Realizar uma Ligacao 

Scenario: Ligar para a central de atendimento 

	Given inicializo aplicacao mobile 
	When realizo uma ligacao "20811446"
	Then finalizo a ligacao

	
	