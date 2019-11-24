# AcademicProjects
Sem 1 DBMS Project
Smith-IS-Career-Center_1.0 – README

Smith-IS-Career-Center is an application which provides a platform for Information Systems students of the Smith School.

Data Sources:
Student data was pulled from elms – Class Student Roaster
JobPosting – selective data from indeed.com
Company – indeed.com
Hiring Manager – Self Generated
Career Service – Self Generated
Event – Self Generated
Application Pre-requisites:
1.	 Java - jdk 1.8.0_152 or higher
a.	Set JAVA_HOME to the latest jdk
b.	Update Path variable to point to the latest jdk
2.	PostGreSQL - postgresql-10.3-2-windows-x64
a.	Set port - 5432 
b.	Set password as – ultimate@123
c.	DB name as – is_internships
d.	Schema name as – is_internships
Application Set-Up
1.	Open Command Prompt.
2.	Browse to the location of the .jar file (in this case “Project0503-05_executable_smith-is-internship-0.0.1-SNAPSHOT.jar”)
3.	Check for the java version using the below command
a.	java –version  this should point to jdk 1.8.0_152 or higher.
4.	To start the application run the following command
a.	java -jar smith-is-internship-0.0.1-SNAPSHOT.jar
This command will show the below ASCII Spring figure which indicates that the application is starting up, refer the screenshot below.
 
Look for the following line statements to confirm start-up, refer the screen shot below.
Tomcat started on port(s): 8080 (http)
Started ISInternshipApiApp in 47.07 seconds (JVM running for 52.098)
 
This states that the application is now up and running for use at port 8080.
Using the application:

1.	Open the browser of your choice and browse to  http://localhost:8080/login
2.	User Authentication:
Use the below credentials to login to the system(refer screenshot)
Enter username: S0000001
Enter password: merlyn@03

 

3.	On authentication failure below message will appear:
 

4.	On successful authentication, student homepage will be displayed, refer below screenshot:
 

Use Case 1 – Search and apply to jobs:

a)	Non filtered search: When all the job search filters are left empty, the application will display all the job postings present in the database, refer below screenshot.


b)	Filtered search: 
List of filters: The user can choose from the below list of drop downs and refine his/her search query
 

Once the criteria are specified, clicking on search button, will return a list of jobs that qualify those criteria and user can apply to those jobs by clicking on the Apply button.
 
c)	The user can also view the jobs that he/she has applied to, by going to the Job Application tab.
 

Use Case 2 - Search and register to OCS events.
a)	Browse Events tab shows all the events hosted by the Career Services team. The user can browse through the list and register for the events on this page.
 
b)	The user can go to the Registered Events tab to see all the events that he/she has registered to.

The user can log out using the logout button to exit the application.
 
Terminate the Application:
In order to terminate the application follow the below steps:
1.	Go to the command prompt that is running the application and press Ctrl+C
This will close and release all the resources in use, and terminate the application gracefully.
