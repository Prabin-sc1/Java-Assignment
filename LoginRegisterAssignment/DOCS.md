
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
ss1
b. Import the folder where you clone the project
ss2

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

ss3

4. Now run the app as spring boot app

5. Open your favourite browser and copy the below url and paste it in your browser 
  http://localhost:9494/ 

  