<h1>Crud Spring Boot</h1>

> Status: Finished ✔️

### Contents
  
* [What is it?](#what-is-it)
* [Requirements](#requirements)
* [Technologies Used](#technologies)
* [Installation](#installation)
* [Run Application](#run-application)

## <a name="what-is-it"></a>What is it?

A back-end project of a CRUD using Java and Spring Boot.

## <a name="requirements"></a>Requirements

- Java 12+
- Spring Boot (version 2.1.7.RELEASE)
- MySQL 6.0+

## <a name="technologies"></a>Technologies Used

- Java
- Spring Boot
- MySQL

## <a name="installation"></a>Installation

- Clone the repository for your device
- Import it as a MAVEN project
- Under src/main/resources/applicationModel.properties modify the file name applicationModel.properties to application.properties
- In the application.properties file, edit the USER and PASSWORD of your MySQL database;
- In your Postman client, import requests from the ProjetoSB.postman_collection.json file

### Application.properties
```xml
spring.datasource.username=
spring.datasource.password=
```
## <a name="run-application"></a>Run Application

After meeting the requirements and installation, run the main method as a spring boot app in ProjetoSbApplication.java

### CRUD
* This project doesn't start the database with test data, the first CRUD method run must be the POST to populate the database
* After you add the requests to your Postman client, you'll have access to the following API features

<table border="1">
   <thead>
   <tr>
       <th>Entities/Methods</th>
       <th>Produto</th>
   </tr>
   </thead>
   <tbody>
   <tr>
       <td>(GET) Listar</td>
       <td>✔️</td>
   </tr>
   <tr>
       <td>(GET) Buscar Por Id</td>
       <td>✔️</td>
   </tr>
   
   <tr>
       <td>(GET) Buscar Por Parte Do Nome</td>
       <td>✔️</td>
   </tr>
   
   <tr>
       <td>(GET) Buscar Por Página</td>
       <td>✔️</td>
   </tr>
   
   <tr>
       <td>(POST) Adicionar</td>
       <td>✔️</td>
   </tr>
   
   <tr>
       <td>(DEL) Excluir</td>
       <td>✔️</td>
   </tr>
   </tbody>
</table>
