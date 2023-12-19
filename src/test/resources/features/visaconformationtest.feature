Feature:  Visa Conformation Test Page

  @Regression
  Scenario: Verify user should login successfully
    Given I am on homepage
    When  I click on start button
    And  I select a Nationality Australia
    And  I click on Continue button
    And  I select reason Tourism
    And  I click on Continue button
    Then I verify result You will not need a visa to come to the UK

  @Regression
  Scenario: Verify user should check valid credentials successfully
    Given I am on homepage
    When I click on start button
    And I Select a Nationality Chile
    And I click on Continue button
    And I Select reason Work, academic visit or business
    And I click on Continue button
    And I select intendent to stay for longer than 6 months
    And I click on Continue button
    And I select have planning to work for Health and care professional
    And I click on Continue button
    Then I verify result You need a visa to work in health and care

  @Regression
  Scenario: Verify user should check valid credentials successfully
    Given I am on homepage
    When I click on start button
    And I select a Nationality Colombia
    And I click on Continue button
    And I select reason Join partner or family for a long stay
    And I click on Continue button
    And I select state My partner of family member have uk immigration status yes

    Then Verify result 'You’ll need a visa to join your family or partner in the UK