Feature: Country Drop Down Test

  Background: As a user on Home Office Visa Uk Website

  @Regression
  Scenario: Verify the following country available in country dropdown list
  Give I am on home page
    When I click on start button
    Then I can see following country into dropdown
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |