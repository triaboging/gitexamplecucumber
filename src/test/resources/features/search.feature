Feature: Search Steps

  @positive
  Scenario Outline: Go to the google page with positive result
    Given input search <string>
    Then compare expected <result>
    Examples:
      | result                                | string                                |
      | Ловля сома на днепре - Поиск в Google | Ловля сома на днепре |

  @negative
  Scenario Outline: Go to the google page with negative result
    Given input search string
    Then compare expected <result>
    Examples:
      | result                              |
      | Ловля сома на море - Поиск в Google |
