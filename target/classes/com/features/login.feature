Feature: login test for Offline JBK Application

@jbk
Scenario Outline: valid facebook login test

Given user enters "file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html"
When user ente "<uname>" and "<pass>"
And click login button
Then user will be on homepage

Examples:
|uname            |pass  |
|kiran@gmail.com  |123456|
|mangesh@gmail.com|qwerty|
|neelam@gmail.com |asdfgh|

