# ArrayList
Displays knowledge of ArrayList in Java

## App
App creates two arrays
* static ArrayList<Course> courses;
* static ArrayList<GenEd> geneds;

The *loader* classes populate the arrays.\
A for loop goes through the courses array looking for courses that have a genEd.\
For each of theses courses, a for loop finds the correct genEd description.

## Course
**Attributes**\
CourseName name\
int credits\
String description\
boolean genEd\
String genEdType

## CourseName
**Attributes**\
String major\
int number

## GenEd
**Attributes**\
String type\
String description

## GenEdLoader
**Attributes**\
ArrayList\<GenEd\> genEds
