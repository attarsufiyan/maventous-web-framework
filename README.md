Maventous Web Automation Framework
_______________________________________________________________________________________________________________________________________________________________________________________

📘 Project Overview
________________________________________________________________________________________________________________________________________________________________________________________

* The Maventous Web Automation Framework is a scalable and modular test automation framework built using Selenium WebDriver, Java, TestNG, and BDD Cucumber for testing web applications.

* It automates functional and UI testing for the Maventous web application, covering critical user flows such as Login, Navigation, Dashboard validations, and Form interactions.

* The framework follows the Page Object Model (POM) design pattern combined with BDD architecture, ensuring clean separation between business logic and UI implementation.

* It supports real browser execution and is designed to be CI/CD ready, with seamless integration into Jenkins and containerized execution using Docker (non-headless Chrome).
* <img width="377" height="616" alt="image" src="https://github.com/user-attachments/assets/67777425-ac4d-4f74-af76-b8cad7e900c0" />
<img width="922" height="770" alt="image" src="https://github.com/user-attachments/assets/5f1a13b6-a122-4d93-b455-3ce061e308cd" />



_________________________________________________________________________________________________________________________________________________________________________________________

⚙️ Key Features
__________________________________________________________________________________________________________________________________________________________________________________________

* Automates web application testing using Selenium WebDriver.

* Implements BDD Cucumber for writing business-readable test scenarios in Gherkin syntax.

* Follows Page Object Model (POM) for improved maintainability and reduced code duplication.

* Supports data-driven testing through external configuration and test data files.

* Integrates TestNG for test execution control, grouping, rerun capability, and parallel execution.

* Generates detailed HTML execution reports using Cucumber and Extent Reports.

* Provides failed scenario re-execution using a dedicated Failed Test Runner.

* Supports Docker-based execution with real Chrome browser using Selenium Standalone Chrome.

* Easily integrable with CI/CD pipelines using Jenkins.
  ________________________________________________________________________________________________________________________________________________________________________________________
  
  🧰 Tech Stack
__________________________________________________________________________________________________________________________________________________________________________________________

* Programming Language: Java — Core language used for automation development.

* Automation Tool: Selenium WebDriver — Automates browser-based testing.

* BDD Framework: Cucumber — Enables business-readable test scenarios.

* Testing Framework: TestNG — Manages execution flow, grouping, and parallel runs.

* Design Pattern: Page Object Model (POM) — Improves scalability and maintainability.

* Build Tool: Maven — Dependency management and build lifecycle.

* Reporting: Cucumber Reports / Extent Reports — Generates detailed HTML reports.

* Containerization: Docker — Enables consistent execution using Selenium Standalone Chrome.

* Version Control: Git & GitHub — Source code management.
_______________________________________________________________________________________________________________________________________________________________________________________________

🧱 Project Structure
________________________________________________________________________________________________________________________________________________________________________________________________

Root Folder: maventous-web/ — Main directory containing framework source code, configurations, and reports.

📁 src/main/java

* utils
Contains reusable utility and base framework classes.

  GenericUtils.java
  → Common Selenium utilities such as waits, screenshots, and element handling.
  
  TestBase.java
  → Handles browser initialization, driver setup, environment loading, and teardown.
  
  Variables.java
  → Stores global constants and reusable framework variables.

📁 src/test/java

* cucumberOptions
  Contains Cucumber + TestNG runner classes.

TestNGTestRunner.java
 → Main execution runner defining feature paths, glue code, tags, and plugins.

FailedTestRunner.java
 → Executes only failed scenarios for faster re-runs.

* features

Contains all BDD feature files written in Gherkin.
Example:
Login.feature
Dashboard.feature

* pageObjects

Implements the Page Object Model.
One Java class per web page.
Stores locators and page-level actions.
Ensures UI changes impact only one class.

* stepDefinitions
Maps Gherkin steps to Java methods.
Acts as a bridge between feature files and page objects.

📁 src/test/resources

global.properties
→ Stores environment configurations such as browser type, URL, and timeouts.

extent.properties
→ Configures Extent Report behavior and appearance.

📁 target

Auto-generated folder containing:

Cucumber HTML & JSON reports

Surefire reports

Failed scenario logs

📁 test-output

Default TestNG execution reports.

![1](https://github.com/user-attachments/assets/5bdd1892-f75a-4bbd-bdd5-5a306695ca26)
![2](https://github.com/user-attachments/assets/2e91309c-bf82-4eba-955c-82c391652ee8)
![3](https://github.com/user-attachments/assets/ee7f02b9-b68f-4ff5-94a5-f6cfa09943f3)



📄 pom.xml

Maven configuration file managing:

Selenium

TestNGCucumber

Reporting dependencies

Build plugins

___________________________________________________________________________________________________________________________________________________________________________________________________

👨‍💻 Author
____________________________________________________________________________________________________________________________________________________________________________________________________

Name: Sufiyan Attar
Role: QA Automation Engineer
Email: sufiyanattar@hotmail.com

  
