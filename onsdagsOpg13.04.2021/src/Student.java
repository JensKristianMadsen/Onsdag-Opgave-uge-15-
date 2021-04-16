import java.util.Arrays;

public class Student {
  private String name;
  private int[] grades;

  public Student(String name, int exams) {
    this.name = name;
    this.grades = new int[exams];
  }

  public int[] getGrades() {
    return grades;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  @Override
  public String toString() {
    return "Student: " + name +
        "\nGrades: " + Arrays.toString(grades);
  }
}


