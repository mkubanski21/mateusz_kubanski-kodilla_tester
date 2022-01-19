Feature: FizzBuzz
  If number is divided by 3 print "Fizz", if number is divided by 5 print "Buzz",
  if number is divided by 3 and 5 print "FizzBuzz" and if number doesn't meet any of those conditions print "None".

  Scenario Outline: Check if received number is divided by 3 or by 5 or by 3 and 5 or by none of those numbers
  Given <number> is received
  When  Number is divided by 3 or by 5 or by 3 and 5 or by none of those numbers
  Then  Print <answer>
  Examples:
    | number | answer |
    | 6 | "Fizz" |
    | 10 | "Buzz" |
    | 30 | "FizzBuzz" |
    | 17 | "None" |
