Feature: Automation feature file

  Scenario Outline: Read the input file
    Given The file is available in the "<Input>" path
    Examples:
      | Input        |
      | testfile.txt |