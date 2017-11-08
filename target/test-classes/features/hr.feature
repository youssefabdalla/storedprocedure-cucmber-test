@hr 
Feature: The business logic can transfer employees between departments 

Scenario: An Employee can be transfered from Sales to Operations 
	Given There is an Employee in Department Sales
	When I reassign the employee to Department Operations
	Then The Employee is assigned to Department Operations