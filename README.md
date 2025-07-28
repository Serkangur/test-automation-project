## 🧪 How to Run the Tests

🖥️ 1. React-App-Automation (Selenium Frontend UI Tests)
Steps to run the Selenium-based frontend automation tests:

🔹 **Clone the repository**

```bashgit clone
https://github.com/Serkangur/test-automation-project.git

```
🔹 **Open the project in IntelliJ IDEA**

Go to: File > Open
Select the test-automation-project directory
Inside it, select and open the React-App-Automation folder

🔹 **Load Maven dependencies**

IntelliJ will automatically detect the pom.xml. If not:
Click on Load Maven Project (usually appears as a button on the top-right)
Wait until all dependencies are downloaded

🔹 **Check TestNG Configuration**

Ensure TestNG is installed either via pom.xml or by adding the TestNG plugin
(Optional) Enable Allure for reporting by configuring its dependencies

🔹 **Run the Tests**

Navigate to: src/test/java directory
Open any test class, for example: ValidLoginTest.java
Right-click the file → Click Run to execute the test

🔹 **View Allure Report (Optional but Recommended)**

```bash
cd C:\Users\space\Desktop\Automation\test-automation-project
allure serve
```
This command will start a local server and automatically open a browser window displaying the Allure test report. Make sure Allure is installed on your system and added to the system PATH.
This will launch a browser window showing the test execution report in a visually rich format.

##  🖥️ 2. API-Testing (REST-assured Backend API Tests)
Steps to run REST-assured-based backend tests:

🔹 **Open API-Testing project**

In IntelliJ IDEA: File > Open
Go to: File > Open
Select the test-automation-project directory
Navigate inside the cloned repo and select the API-Testing folder

🔹 **Load Maven dependencies**

Wait for pom.xml to load or click Load Maven Project manually

🔹 **Environment Configuration**

Ensure the base URI or endpoints used in the project match the API you're testing
If needed, modify configurations inside ConfigReader or relevant utility class

🔹 **Run the Tests**

Navigate to src/test/java, locate the UserTests class, right-click on it and select Run to execute all API test scenarios.

🔹 **View Allure Report (Optional)**

```bash
cd C:\Users\space\Desktop\Automation\test-automation-project
allure serve
```
