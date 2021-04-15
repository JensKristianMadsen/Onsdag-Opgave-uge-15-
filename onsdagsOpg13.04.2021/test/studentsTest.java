import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class studentsTest {


  @Test
  public void registerGradeWith4() {
    Teacher teacher = new Teacher();

    // Arrange

    int expected = 4;

    // Act

    int actual = teacher.validateGrade(4);

    // Assert
    assertEquals(expected, actual);
  }
  @Test
  public void registerGradeWithMinus3() {
    Teacher teacher = new Teacher();

    // Arrange

    int expected = -3;

    // Act

    int actual = teacher.validateGrade(-3);

    // Assert
    assertEquals(expected, actual);
  }

  @Test
  public void registerGradeWith6() {
    Teacher teacher = new Teacher();;

    // Arrange

    assertThrows(IllegalArgumentException.class, () -> teacher.validateGrade(6));
  }

  @Test
  public void registerGradeWithMinus1() {
    Teacher teacher = new Teacher();

    // Arrange
    assertThrows(IllegalArgumentException.class, () -> teacher.validateGrade(-1));
  }

  @Test
  public void registerGradeWithMinus4() {
    Teacher teacher = new Teacher();

    // Arrange
    assertThrows(IllegalArgumentException.class, () -> teacher.validateGrade(-4));
  }

  @Test
  public void registerGradeWithAbove12() {
    Teacher teacher = new Teacher();

    // Arrange
    assertThrows(IllegalArgumentException.class, () -> teacher.validateGrade(13));
  }
  /*
// Ekstra opgave(hvis I har tid til overs):En af eksaminerne er todelt: 1. delprøve vægter med 25 % og 2. delprøvevægter med 75 %.5.Der skal minimum skrives unit tests til én metode.AfleveringEt link til GitHub repository og GitHub navn på jer begge.Her skal det gerne fremgå af historikken,
// at I begge har været aktive med at pushe ændringer til github (kan ses påunder Insightpå repository).
  @Test
  public void part1() {
    // Arranger
    double forventet = 2.5;
    // Handling
    double faktiske = (10 * 0.25);

    // Hævde
    assertEquals(forventet, faktiske);
  }
  /*

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
  }*/
}