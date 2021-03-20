# User Feedback Project 

## Technologies

Utilizes MySQL database with the name '''db_example''' and table '''feedback''' which have the fields of '''sql id, comments, rating, user '''. Utilizes a Spring RestController
and a Regular Controller to route the user to seperate '''JSP pages'''. These include only two, the '''index.jsp''' where you have the user has the option to 
either view the existing '''feedback''' table in its entirety (output with '''json''') and secondly to a '''addnewfeedback.jsp''' where the user can input 
a new '''sql feedback''' row into the table. The program will then output the new row added with '''json''' addnewfeedback.jsp'''. 
