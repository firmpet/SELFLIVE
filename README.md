# SELFLIVE CucumberFramework

##DON'T:

	1. Don't commit changes in project auto generated files/folders:
			.idea
			output
			resources
			screenshots
			Target
	2. DON'T EXTEND THE HOOKS
##Install:

	1. Eclipse plugin for cucumber
	2. Or something similiar like IntelliJ
	3. Or use Ruby Mine

##config.properties:

	1. Change URL by changing : URL
	2. Which browser to test on : Firefox, Chrome, Edge, IE

##STEPSDEFS:

	1. Group Them Accordingly
	2. Keep steps simple
	3. Use Page Objects
	4. Don't add selenium code here

##Execute using Runner Class:
	1. USE RUNNERTEST CLASS TO EXECUTE TEST
	2. Group Them Accordingly in TestSuit runner class
	3. Keep runner class per feature and Keep it simple

##Execute using MAVEN Command Line Options:

mvn clean test -Dtest.run.mode=windowed -Dcucumber.options="classpath:features/CRUDOperation.feature"        (runs selected Feature in windowed)
mvn clean test -Dtest.run.mode=windowed -Dcucumber.options="classpath:features/CRUDOperation.feature:36"     (runs selected Scenario in windowed)

##Pages: Page Object : Keep it simple

	1. STRUCTURE IT PROPERLY
	2. PUT SELENIUM CODE HERE
	3. Make changes in DriverInstance to add drivers and point to URL with out any issues

##Features:

	1. Keep scenarios simple
	2. Make use of scenario outline
	3. Make use of tags to group tests
  
##BrowserDrivers:

	1. Update browser drive.exe when necessary
  
##Git Repository:

	1. Only commit changes in src, pom.xml and README when necessary
  
##IMPORTANT : Framework buid as MAVEN so add MAVEN

Framework created by JOSHUA AYOADE
