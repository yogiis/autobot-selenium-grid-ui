Feature: Google.com

  @test
  Scenario Outline: User searches for person's name
    Given User on page google.com
    When User input text "<name>"
    Then User success searching
    Examples:
      |name              |
      |yogi is ariyanto  |
