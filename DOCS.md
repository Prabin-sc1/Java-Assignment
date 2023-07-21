
# Login And Registration

Simple Login and Registration Project Using Spring Boot, Thymeleaf, and MySQL based on MVC architecture.

## Table Of Content
    1. Features
    2. Demo
    3. Technologies and Tools Used
    4. Installation

    
    
## Features

    1. User can register, login and logout.
    2. Passwords securely stored using encryption.
    3. User can change password.
    4. User can see their profile.

## Technologies Used

1. Spring Boot
2. Thymeleaf
3. MySQL
4. Spring Data JPA
5. Spring Security
6. Bootstrap

## Tools Used
1. STS IDE
2. Mysql WorkBench
3. Git

## Installation
1. Clone this repository to specific folder
https://github.com/Prabin-sc1/Java-Assignment 

2. Open STS IDE
a. At the top left corner, click one file and choose Open Project file from system.
![Screenshot (163)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/aaa7835f-9c57-4305-9a5d-ca4e4a26bc66)

b. Import the folder where you clone the project

![Screenshot (164)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/ccc822be-6d94-490b-b09e-4f4f6a3627ea)


c. Click on finish...

3. Now it's time to setup database
A. open application.properties


server.port= 9494
spring.datasource.url= jdbc:mysql://localhost:3306/loginregister
spring.datasource.username= root
spring.datasource.password= root
spring.datasource.driver-class-name= com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto= update

Prerequisite :
a. You have to create database namely loginregister
b. Put your database user and password
c. You should be connected with internet

![Screenshot (165)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/8516c46a-3d0d-41c7-b825-e974a5dff275)

4. Now run the app as spring boot app

5. Open your favourite browser and copy the below url and paste it in your browser 
  http://localhost:9494/

##Screenshot
![Screenshot (168)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/3e098302-3344-43a0-9db3-f171cfdc848a)
![Screenshot (167)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/6ac9cdac-58e2-44a3-ab32-5c800b73ff90)
![Screenshot (166)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/89698869-e70f-4cce-b897-b140ffdf7428)
![Screenshot (171)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/b42188cb-109d-42c7-b375-d04697c25ced)
![Screenshot (170)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/60216b19-5e73-4c3c-a98b-eec706394ce0)
![Screenshot (169)](https://github.com/Prabin-sc1/Java-Assignment/assets/79828184/c4cdc6b7-fc7a-4e60-9209-6891adab81fa)


  
