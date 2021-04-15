import java.util.Scanner;

public class Teacher {
  Scanner scanner = new Scanner(System.in);


  public void registerGrades(Student student) {

    int[] arrayGrade = student.getGrades();

    for (int i = 0; i < arrayGrade.length; i++) {

      System.out.println("Enter grades: ");
      int c = scanner.nextInt();
      if (validateGrade(c) > 0)
      arrayGrade[i] = c;
    }
  }

  public int validateGrade(int number) {

    if (number < -3 || number == -2 || number == -1 || number == 1 || number == 3 || number == 5
        || number == 6 || number == 8 || number == 9 || number == 11 || number > 12) {

      System.out.println("fejl");
      return -1;

    }

    return 1;
  }
}