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
    // Arranger
    double forventet = 2.5;
    // Handling
    double faktiske = (-10*0.25);

    // Hævde
    assertEquals(forventet, faktiske);
  }


  @Test
  public void part2() {
  }

  @Test
  public void math() {
  }
}