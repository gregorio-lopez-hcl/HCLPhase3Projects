The Login-Registration Project utilizes all necessary java technologies, Spring MVC with Hibernate, log4j, and MySQL Connector, etc. 

The application displays intially a index (or Home) screen where the user can either list existing user rows in the "users" table in a database known as "db_example" or
choose to search and then edit an existing user row in the table. 

If the user chooses to edit the user, they must first enter the id of the coressponding row in the  table to then output the row currently, and display a jsp form to edit
the selected row. 

If the user enters valid input (by at least entering valid text/strings) then the program will direct them to a successfully edited user jsp page. 

All jsp pages have an option to return to the index jsp, and will throw to an error jsp page if the user enters an invalid entry, specifically a non-existant id 
number in the table (id is the primary key). 