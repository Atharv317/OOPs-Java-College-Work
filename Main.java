package oop;

class Student {
  Integer id;
  String name;
  String department;

  Student() {
    id = null;
    name = null;
    department = null;
  }

  Student(Integer id, String name, String department) {
    this.name = name;
    this.id = id;
    this.department = department;
  }

  public void display() {
    System.out.println(id + " " + name + " " + department + "\n");
  }
}

class Course {
  private Integer courseId;
  private String courseName;
  private Integer credits;

  public void setCourseId(Integer courseId) {
    this.courseId = courseId;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public void setCredits(Integer credits) {
    this.credits = credits;
  }

  public Integer getCourseId() {
    return courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public Integer getCredits() {
    return credits;
  }
}

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student(45, "Atharv Shukla", "CSE(AI&ML)");
    s1.display();
    s2.display();

    Course c1 = new Course();
    c1.setCourseId(7);
    c1.setCourseName("B.tech");
    c1.setCredits(10);
    System.out.println(c1.getCourseId());
    System.out.println(c1.getCourseName());
    System.out.println(c1.getCredits());
  }
}
