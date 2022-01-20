Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $<deposit> in my wallet
    When I request $<withdrawal>
    Then $<withdrawal> should be dispensed
    And the balance of my wallet should be $<balance>
    Examples:
      | deposit | withdrawal | balance|
      | 200 | 30 | 170 |
      | 201 | 201 | 0 |

  Scenario Outline: Unsuccessful withdrawal from a wallet in credit
    Deposit is lower than withdraw.
    Given I have deposited $<deposit> in my wallet
    When I request $<withdrawal>
    Then $<withdrawal> withdrawal should be rejected
    Examples:
      | deposit | withdrawal |
      | 100 | 101 |

  Scenario Outline: Unsuccessful deposit to a wallet because of amount less or equal to 0
   Withdrawal t are less or equal to 0.
    Given I have deposited $<deposit> in my wallet
    When Deposit is less or equal to 0
    Then $<deposit> deposit should be rejected
    Examples:
      | deposit |
      | 0 |
      | -50 |

  Scenario Outline: Unsuccessful withdrawal from a wallet because of amount less or equal to 0
    Given I have deposited $<deposit> in my wallet
    When I request withdrawal less than 0: $<withdrawal>
    Then $<withdrawal> withdrawal should be rejected
    Examples:
      | deposit | withdrawal |
      | 100 | 0 |
      | 100 | -50 |

