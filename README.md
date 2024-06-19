# UIAutomation

**System and Tools Setups**

- Java 1.8
- Maven
- GitBash & Git GUI
- Pritunl
- Intelij Idea/Community


**Project Setup**

- Connect to the PriTunl
- Clone the project using SSH or http from the link https://gitlab.foxtons-cloud.link/QaAutomation/UIAutomation/-/tree/develop

**Automation Framework**

- Page Object Model
- Cucumber BDD Framework

**How To Use JIRA for UI Automation**

- Create Epic On this JIRA board https://creativechaos.atlassian.net/jira/software/c/projects/FQA/boards/133
- Create Stories from the Epic 
- If needed, we can create Tasks as well
- Create a separate git branch for each Story
- Use the story number as the branch name 
- After Completion, create separate merge requests for respective stories

**Project Hierarchy** 

- Under src->main->java->configurations folder, we have configuration files for browsers (chrome,mozilla and headless chrome) along with qa and staging environment URLs.
- Under test->java->BrowsersDriver, we have a java class to initialize browser drivers.
- Under test->java->pages , we have separate java classes for each page where we are only defining xpaths and functions. Make sure to write comments above each function about waht exactly the function is used for. 
- Under test->java->stepdefinitions, we have step definition file against each page java class where we write our test cases and call the functions to meet the expected results.
- Under test->java->testrunners, we have the runner class to configure test cases run 
- Under test->java->utilities, we have a class for commanMethods where all the general methods are defined which are independent of the web app we are automating. Apart from that we have configReader class, LoadTestProperties class and PropertyKey class.
- Under test->resources->features, we have the feature files for all the pages. Those files contains all the scenarios written using conventional way of Cucumber framework.

**How to run tests**

- To run the whole project (all feature files) in parallel, just open the terminal and run the command `mvn clean install` or `mvn clean test`
- Now to run specific files or suites, firstly give tag names to those files or to those cases using "@" in feature file. After that run this command `mvn clean test -Denv=$ENV -Dcucumber.filter.tags="$TAG"`. Instead of $ENV , pass the environment name like "qa" or "stg" and instead of $TAG, pass the tag name you want to run.
- Currently, all test will run in headless mode by default that can be changed by giving chrome tag in run command

**Allure Report**

- After executing test cases,you can generate allure reports manually the following command
  - 'mvn allure:serve'

