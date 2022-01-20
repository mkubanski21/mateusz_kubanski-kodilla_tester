Feature: Cash deposit
Scenario : Unsuccessful deposit to a wallet because of amount of transaction less or equal to 0
    Given I have 0$ on my wallet
    When I deposit -50$ so transaction is less than 0$
    Then -50$ deposit should be rejected
