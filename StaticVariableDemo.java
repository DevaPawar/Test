

// Keep this file in its own folder (it defines its own Student class).
class Student {
    String name;                          // instance variable — one per object
    static int studentCount = 0;          // static variable — ONE copy shared by the whole class

    Student(String n) {                   // constructor: runs every time we do 'new Student(...)'
        name = n;
        studentCount++;                   // bump the shared counter for every new student
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Arya");

        Student s2 = new Student("Rahul");

        System.out.println(Student.studentCount);  
    }
}


