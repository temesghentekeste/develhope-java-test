package org.develhope.javatest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Write your main class to have 1 SoftwareEngineer job and 1 TaxiDriver  job
//
//        also create 10 people and assign these people to jobs.

        Job softwareEngineer = new SoftwareEngineer("Milan", true, "Accenture", 4);
        Job taxiDriver = new TaxiDriver("Milan", "Urban", true, "ABC-123", "MZK-777" );

        Person person1 = new Person("Alice", "Johnson", 25);
        Person person2 = new Person("Bob", "Smith", 30);
        Person person3 = new Person("Catherine", "Brown", 22);
        Person person4 = new Person("David", "Clark", 28);
        Person person5 = new Person("Emma", "Williams", 35);
        Person person6 = new Person("Frank", "Anderson", 40);
        Person person7 = new Person("Grace", "Miller", 29);
        Person person8 = new Person("Henry", "Wilson", 33);
        Person person9 = new Person("Isabella", "Taylor", 27);
        Person person10 = new Person("Jack", "Moore", 31);


        if( softwareEngineer instanceof  SoftwareEngineer ) {


            ((SoftwareEngineer) softwareEngineer).addPerson(person1);
            ((SoftwareEngineer) softwareEngineer).addPerson(person2);
            ((SoftwareEngineer) softwareEngineer).addPerson(person3);
            ((SoftwareEngineer) softwareEngineer).addPerson(person4);
            ((SoftwareEngineer) softwareEngineer).addPerson(person5);

            System.out.println(person1);
            softwareEngineer.hirePerson(person1);
            ((SoftwareEngineer) softwareEngineer).printAllPeople();
        }


        System.out.println();
        System.out.println();

       if(taxiDriver instanceof TaxiDriver) {
           ((TaxiDriver) taxiDriver).addPerson(person6);
           ((TaxiDriver) taxiDriver).addPerson(person7);
           ((TaxiDriver) taxiDriver).addPerson(person8);
           ((TaxiDriver) taxiDriver).addPerson(person9);

           ((TaxiDriver) taxiDriver).printAllPeople();
       }



    }
}