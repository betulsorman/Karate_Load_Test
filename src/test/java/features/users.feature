Feature: sample karate test script

  Background:
    Given url baseUrl

  @name=load
  Scenario: user login
    * def data = Java.type('helper.DataGenerator')
    * def user = read('classpath:data/user.json')
    * set user.username = data.generateString()
    * set user.password = data.generatePassword()
    * path '/user/login'
    * request user
    * method GET
    * print response



