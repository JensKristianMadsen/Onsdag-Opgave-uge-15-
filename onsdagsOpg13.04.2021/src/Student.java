import java.util.Arrays;


public class Student {
  private String name;
  private int[] grades;


  public Student(String name, int exams) {
    this.name = name;
    this.grades = new int[exams];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int[] getGrades() {
    return grades;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", grades=" + Arrays.toString(grades) +
        '}';
  }
}


