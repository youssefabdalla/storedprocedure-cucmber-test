$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hr.feature");
formatter.feature({
  "line": 2,
  "name": "The business logic can transfer employees between departments",
  "description": "",
  "id": "the-business-logic-can-transfer-employees-between-departments",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@hr"
    }
  ]
});
formatter.before({
  "duration": 1924550345,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "An Employee can be transfered from Sales to Operations",
  "description": "",
  "id": "the-business-logic-can-transfer-employees-between-departments;an-employee-can-be-transfered-from-sales-to-operations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "There is an Employee in Department Sales",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I reassign the employee to Department Operations",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The Employee is assigned to Department Operations",
  "keyword": "Then "
});
formatter.match({
  "location": "TransferEmployeeStepDefinitions.thereIsAnEmployeeInDepartmentSales()"
});
formatter.result({
  "duration": 2300073718,
  "status": "passed"
});
formatter.match({
  "location": "TransferEmployeeStepDefinitions.reassignedToDepartmentOperations()"
});
formatter.result({
  "duration": 48141576,
  "status": "passed"
});
formatter.match({
  "location": "TransferEmployeeStepDefinitions.theEmployeeIsAssignedToDepartmentOperations()"
});
formatter.result({
  "duration": 13680906,
  "status": "passed"
});
});