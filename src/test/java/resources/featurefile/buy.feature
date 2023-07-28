Feature: Search Test
  As User I wan to Search and verify functionality

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When  I mouse hover on “buy+sell” tab
    And   I click ‘Search Cars’ link
    Then  I navigate to ‘new and used car search’ page
    And   I select make "<make>"
    And   I select model "<model>"
    And   I select location "<location>"
    And   I select price "<price>"
    And   I click on Find My Next Car tab
    Then  I should see the make "<make>" in results



    Examples:
      | make   | model | location   | price  | make |
      | Toyota | Camry | NT-South   | $20000 |      |
      | Honda  | Civic | NSW-Sydney | $18000 |      |
      |        |       |            |        |      |
      |        |       |            |        |      |
      |        |       |            |        |      |
      |        |       |            |        |      |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click 'used' link
    Then I navigate to 'Used Cars For Sale' page
    And I select make "<make>"
    And   I select model "<model>"
    And   I select location "<location>"
    And   I select price "<price>"
    And I click on Find My Next Car tab
    Then  I should see the make "<make>" in results
    Examples:

      | make   | model | location   | price  | make |
      | Toyota | Camry | NT-South   | $22000 |      |
      | Honda  | Civic | NSW-Sydney | $18000 |      |
