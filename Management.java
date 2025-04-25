package MangementSystem;

class Management {
    public static void main(String[] args) {
       Course a = new Course(1,"B.Tech",3);
       Faculty f = new Faculty("A");

       f.assignCourse(a);

       Student s1 = new Student("A",1);
       Student s2 = new Student("B",2);
       Student s3 = new Student("C",3);
       Student s4 = new Student("D",4);

       s1.showProfile();
       f.showProfile();

       s1.enroll(a);
       s2.enroll(a);
       s3.enroll(a);
       s4.enroll(a);



    }

}
abstract class User{
    abstract void showProfile();
}
interface Enrollable{
    void enroll(Course course);
}
class Student extends User implements Enrollable {
   String name;
   int rollno;

   Student(String name, int rollno) {
       this.name = name;
       this.rollno = rollno;
   }


    public void enroll(Course course) {

    }
    void showProfile() {
        System.out.println("Student name is  " + name + " and roll number is " + rollno);
    }
}
class Faculty extends User{
    String name;


    Faculty(String name) {
        this.name = name;
    }

    void showProfile() {
        System.out.println("Faculty name is " + name);

    }
    void assignCourse(Course c) {
        String cname = c.title;
        System.out.println(name + " is assigned with " + cname);
    }

}
class Admin extends User{

    void showProfile() {
        System.out.println("Admin profile");
    }
}
class Course {
    int courseCode;
    String title;
    int capacity;

    Course(int courseCode, String title, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        if (capacity>2){
            System.out.println("We can't enroll course as capacity exceeds 2 capacity");
        }
    }
}