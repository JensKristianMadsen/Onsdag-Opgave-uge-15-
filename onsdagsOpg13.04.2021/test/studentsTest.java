import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class studentsTest {


  @Test
  public void registerGradeWith4() {
    Student student = new Student("Jens");
    student.registerGrade(4);
    // Arrange

    int expected = 4;

    // Act

    int actual = student.getGrade();

    // Assert
    assertEquals(expected, actual);
  }
  @Test
  public void registerGradeWithMinus3() {
    Student student = new Student("Jens");
    student.registerGrade(-3);
    // Arrange

    int expected = -3;

    // Act

    int actual = student.getGrade();

    // Assert
    assertEquals(expected, actual);
  }

  @Test
  public void registerGradeWith6() {
    Student student = new Student("Jens");
    //student.registerGrade(4);
    // Arrange
    assertThrows(IllegalArgumentException.class, () -> student.registerGrade(6));
  }

  @Test
  public void registerGradeWithMinus1() {
    Student student = new Student("Jens");
    //student.registerGrade(4);
    // Arrange
    assertThrows(IllegalArgumentException.class, () -> student.registerGrade(-1));
  }
  @Test
  public void registerGradeWithMinus2() {
    Student student = new Student("Jens");
    //student.registerGrade(4);
    // Arrange
    assertThrows(IllegalArgumentException.class, () -> student.registerGrade(-2));
  }
  @Test
  public void registerGradeWithAbove12() {
    Student student = new Student("Jens");
    //student.registerGrade(4);
    // Arrange
    assertThrows(IllegalArgumentException.class, () -> student.registerGrade(13));
  }

  @Test
  public void part1() {
    // Arranger
    double forventet = 2.5;
    // Handling
    double faktiske = (10 * 0.25);

    // Hævde
    assertEquals(forventet, faktiske);
  }

  //@Test
  public void part1Minus() {
    Student student = new Student("Jens");
    // Arranger

    // Handling


    // Hævde
    //assertThrows(IllegalArgumentException.class, () -> student.setNumber(-2));

  }


  @Test
  public void part2() {
  }

  @Test
  public void math() {
  }
}