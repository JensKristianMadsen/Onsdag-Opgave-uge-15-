public class Teacher {
  UI ui = new UI();


  public void registerGrades(Student student) {

    int[] arrayGrade = student.getGrades();

    for (int i = 0; i < arrayGrade.length; i++) {
      int c = ui.getInt("Enter Grade: " + "\n");
      while (validateGrade(c) < 0) {
        ui.printErrorMessage("You enter: " + c + " Is not a grade" + "\n");
        c = ui.getInt("Try agein: " + "\n");
      }
      arrayGrade[i] = c;

    }
    student.setGrades(arrayGrade);
  }

  public int validateGrade(int number) {

    if (number < -3 || number == -2 || number == -1 || number == 1 || number == 3 || number == 5
        || number == 6 || number == 8 || number == 9 || number == 11 || number > 12) {

      ui.printMessage("fejl");
      return -1;
    }
    return 1;
  }
}