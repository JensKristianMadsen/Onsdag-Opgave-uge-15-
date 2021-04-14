public class Main {
  public static void main(String[] args) {
    Student student = new Student("Jens");
// -3, 00, 02, 4, 7, 10, 12
    int number = student.readGrade();

   student.registerGrade(number);

    System.out.println(student.getGrade());
    //Hjælpe til i morgen
    student.pintStundesGrade();


  }
}
