Feature: User can Register

  @req
  Scenario Outline: User do register
    Given I input my name is "<name>" and email is "<email>" and password is "<password>"
    Then I can do register
    Examples:
      | name            | password                        | email             |
      | OWEUON84975**&* | porfioIBCU87777349!!!><(#UU#(*) | 98475930GG@ss.com |
      | aW3)(**         | foi8945047":"<::_PP             | 984598bb@x.co     |
      | )(*IUHDI        | 039iniibnc*cc??>                | dfvni39@..co      |



