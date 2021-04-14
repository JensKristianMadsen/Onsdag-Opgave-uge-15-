import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class studentsTest {

  @Test
  public void part1() {
    // Arranger
    double forventet = 2.5;
    // Handling
    double faktiske = (10*0.25);

    // Hævde
    assertEquals(forventet, faktiske);
  }
  @Test
  public void part1Minus() {
    Student student = new Student();
    // Arranger

    // Handling


    // Hævde
    assertThrows(IllegalArgumentException.class, () -> student.setNumber(-2));

  }


  @Test
  public void part2() {
  }

  @Test
  public void math() {
  }
}