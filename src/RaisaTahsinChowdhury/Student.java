package RaisaTahsinChowdhury;

public class Student {
    String name;
    int id;
    static String universityName;

    Student() {
        System.out.println("Default constructor");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Name: " + this.name);

    }

    Student(int id) {
        this.id = id;
        System.out.println("Id: " + this.id);
    }

    void display() {
        System.out.println("University Name: " + universityName);
    }
}
/*
      Name: Raisa Tahsin Chowdhury
      ID : 2012020140
      Section : C
      Email : cse_2012020140@lus.ac.bd
      Date : 08.08.2021
 */