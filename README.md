# Exercise 2 PGR200 #

## Before you start ##
Open the Properties-files located in the Resources folder. Make sure MAMP or similar application
is running, edit the properties-files so that it corresponds with the address, port number, user name
and password for your localhost or server. Also make sure the ports is not already occupied.

## How to run the application ##

1.  First you start the server, this is done by opening 
    the ServerApplication-class and run this class. This
    class will call the class "DBCreator" create an database 
    and populate it with all the files within the "files" folder.

2.  Now you can open the ClientApplication class and run this. It will
    automatically connect to the server doe to the fact both server
    and client use the same "Properties"-file.
    

**What can you do with my application**

When you run the Client-class you will be prompted with some alternatives.
Here you can ask the server to send content of a table, print out all tables
in the Database, get metadata from a table and so on.


# Comments to my solution #

**The good**

I am satisfied with the fact that my solution can handle any types of MySQL-tables.
It is a very dynamic solution. When i send data from the server, it is packed in an object.
This object gets unpacked by the client and presented to the user with good formatting so it
is easy to understand for the user of this application.


**The bad**

My solution only send primitives such as Strings to the server, this should be done by Objects.
I should have written more tests, but It is really hard to test communication between client and 
server of a Socket. I should also have used The interfaces in a better way. This is described more 
in my documentation. 

## References ##

In my assignment, I have based on the methods "createTable" and "insert" that is in the solution 
I've referred to here. I have built on these and added superior functionality as you can see in my solution.

https://github.com/NikitaZhevnitskiy/dbService

