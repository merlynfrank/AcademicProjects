
CREATE TABLE [ISInternship.UserLogin]
(userID VARCHAR(20) NOT NULL,
 password VARCHAR(20) NOT NULL,
 usertype VARCHAR(20) NOT NULL,
 CONSTRAINT pk_UserLogin_userID PRIMARY KEY(userID));

CREATE TABLE[ISInternship.Student]
(
sFName VARCHAR (20)NOT NULL,
sLName VARCHAR (20),
major VARCHAR (100) NOT NULL,
graduation DATE,
resume VARCHAR(250),
sEmail VARCHAR(100) NOT NULL,
s_userID VARCHAR(20),
CONSTRAINT pk_Student_sID PRIMARY KEY(s_userID),
CONSTRAINT fk_Student_userID FOREIGN KEY(s_userID)
REFERENCES [ISInternship.UserLogin](userID)
ON DELETE CASCADE ON UPDATE CASCADE);


CREATE TABLE[ISInternship.CareerService]
(
 ocsName VARCHAR(20)NOT NULL,
 ocsPhoneNo VARCHAR(20),
 ocsEmail VARCHAR(50) NOT NULL,
 o_userID VARCHAR(20),
 CONSTRAINT pk_CareerService_ocsID PRIMARY KEY(o_userID),
 CONSTRAINT fk_CareerService_userID FOREIGN KEY(o_userID)
 REFERENCES [ISInternship.UserLogin] (userID)
 ON DELETE CASCADE ON UPDATE CASCADE
 );



CREATE TABLE [ISInternship.Events]
(eventID VARCHAR(20) NOT NULL,
 eventName VARCHAR(50)NOT NULL,
 eventDesc VARCHAR(2000) NOT NULL,
 eventDate DATE NOT NULL,
 eventLocation VARCHAR(50)NOT NULL,
 targetAudience VARCHAR(150),
 o_userID VARCHAR(20),
 CONSTRAINT pk_CareerService_eventID PRIMARY KEY(eventID),
 CONSTRAINT fk_CareerService_o_userID FOREIGN KEY(o_userID)
 REFERENCES [ISInternship.CareerService] (o_userID)
 ON DELETE SET NULL ON UPDATE CASCADE
 );




CREATE TABLE [ISInternship.Company]
(
 companyID VARCHAR(20) NOT NULL,
companyName VARCHAR(50) NOT NULL,
CompanyRegion CHAR(20),
CONSTRAINT pk_Company_companyID PRIMARY KEY (companyID));

CREATE TABLE [ISInternship.HiringManager]
(
empFName CHAR(50)NOT NULL,
empLName CHAR(50),
departmentName CHAR(50),
designation CHAR(50),
empEmail CHAR(100)NOT NULL,
empPhoneNo VARCHAR(20),
empLocation VARCHAR(50),
e_userID VARCHAR(20),
companyID VARCHAR(20)NOT NULL,
CONSTRAINT pk_HiringManager_empID PRIMARY KEY (e_userID),
CONSTRAINT fk_HiringManager_userID FOREIGN KEY (e_userID)
          	REFERENCES [ISInternship.UserLogin] (userID)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT fk_HiringManager_companyID_companyName FOREIGN KEY (companyID)
          REFERENCES [ISInternship.Company] (companyID)
ON DELETE NO ACTION ON UPDATE CASCADE);


CREATE TABLE [ISInternship.JobPosting] (
jobID VARCHAR(20) NOT NULL,
jobTitle VARCHAR(50) NOT NULL, 
jobLocation VARCHAR(50), 
jobType VARCHAR(50),
experience VARCHAR(50), 
workAuthorization VARCHAR(100), 
qualification VARCHAR(100), 
description VARCHAR(1000), 
salary NUMERIC (10,2), 
postDate DATE, 
expirationDate DATE, 
e_userID VARCHAR(20),
companyID VARCHAR(20) NOT NULL,
CONSTRAINT pk_JobPosting_jobID PRIMARY KEY(jobID),
CONSTRAINT fk_JobPosting_empID FOREIGN KEY (e_userID)
		REFERENCES [ISInternship.HiringManager] (e_userID)
			ON DELETE SET NULL ON UPDATE CASCADE,
CONSTRAINT fk_JobPosting_companyID FOREIGN KEY (companyID)
		REFERENCES [ISInternship.Company] (companyID)
			ON DELETE NO ACTION ON UPDATE NO ACTION);

CREATE TABLE [ISInternship.Application](
applicationID VARCHAR(20) NOT NULL,
s_userID VARCHAR(20),
jobID VARCHAR(20),
appDate date,
CONSTRAINT pk_Application_applicationID PRIMARY KEY (applicationID),
CONSTRAINT fk_Application_sID FOREIGN KEY (s_userID)
	REFERENCES [ISInternship.Student] (s_userID)
		ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT fk_Application_jobID FOREIGN KEY (jobID)
	REFERENCES [ISInternship.JobPosting] (jobID)
		ON DELETE NO ACTION ON UPDATE NO ACTION

);



CREATE TABLE [ISInternship.Registration](
registrationID VARCHAR(20) NOT NULL,
s_userID VARCHAR(20),
eventID VARCHAR(20),
CONSTRAINT pk_Registration_registrationID PRIMARY KEY (registrationID),
CONSTRAINT fk_Registration_sID FOREIGN KEY (s_userID)
	REFERENCES [ISInternship.Student] (s_userID)
		ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT fk_Registration_eventID FOREIGN KEY (eventID)
	REFERENCES [ISInternship.Events] (eventID)
		ON DELETE NO ACTION ON UPDATE NO ACTION

);
