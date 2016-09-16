# ExamPrepJPA2

•	Describe how we have handled persistence in the last three semesters. The considerations should include all relevant layers. File IO, Relational Databases, the browsers local storage and cookies on the browser.
o	We have previously achieved persistent data through the use of files being written directly to the disk with Java. SQL databases have also been used to achieve persistent data.
o	We have barely used cookies during our semesters. Cookies are only partially persistent, as they are programmed to expire after some date. We have not used browser local storage.
•	Explain the Pros & Cons in using an Object Relational Mapping Framework
o	It is much more convenient to access the database through java. This also makes getting the related objects of an object an automatic process.
o	The generated database may not be so efficient or nice to look at compared to one that has been carefully planned.
•	Elaborate on some of the problems a ORM tries to solve
o	With ORM you can write the program logic with objects instead of using SQL code.
•	Explain how Inheritance in an OO language can be mapped to tables in a relational database
o	Single table, table per class, join table
Here I am using the inheritance strategy “JOINED”. This cuts down on values needed (I assumed that even empty values take up space in the SQL project). In any case it looks cleaner in the database.
