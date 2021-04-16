public class Main {
  public static void main(String[] args) {

    Student student = new Student("Jens", 7);

    Teacher teacher = new Teacher();

    teacher.registerGrades(student);
    System.out.println(student);
  }
}
