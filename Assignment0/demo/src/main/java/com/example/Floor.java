package com.example;

/**
* Represents a floor in a building. 
* Manages the people present on the floor and provides functionality to add individuals to the floor.
* Known Bugs: None
*
* Jiarui Zhang
* jiaruiz@brandeis.edu
* 01 19 2025
* COSI 21A PA0
*/

public class Floor{
    MyArray<Person> peopleAtFloor;

    public Floor(/*add some params here maybe */){
        peopleAtFloor = new MyArray<Person>();
    }

    public void enterFloor(Person person){
        peopleAtFloor.add(person);
    }

    public String toString(){
        return peopleAtFloor.toString();
    }
}
