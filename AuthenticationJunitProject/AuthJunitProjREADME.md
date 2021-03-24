# Handling User Authentication .



## Project objective:

Set up a spring boot project to do testing of a user authentication class which is used in the main web application. The objective is to create a JUnit class that will test all aspects of the authentication class.


## Technologies Utilized 

 * Junit 5 
 * Spring/Hibernate/SpringControllers 

# Project Capabilites

The project utilizes the Spring frame work to successfully output a simple web UI that will direct the use to a series of ```jsp``` pages that allow them to 
login in using an HTML form connected to a Spring Controller. The application has a simple post method that gets the user entered Username and Password and compares it 
to the existing database username and password: 

```sql 

database db_example.user_auth with the data

```

| id | email | name | password | 
|:----:|:------:|:------:|:----------:|
| 1  | bob@bob.com | Bobby | coolbob | 
| 2  | jaun@jpalenque.net | Juanio | Raza | 


### Junit Tests

The application tests the following two methods that are utilized in the application in conjunction with the getters/setters methods: the ```findByName/getUserByName``` and the ```checkPassword``` methods. 

Addtionally, the application tests all the jsp pages related to its UI functions these include: ```index-/, /login```. 




 
