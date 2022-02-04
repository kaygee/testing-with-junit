package kg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class BankAccountConditionalTest {

  @Test
  @EnabledOnOs({OS.MAC})
  public void testMac() {
    System.out.println("Enabled for MAC");
  }

  @Test
  @EnabledOnOs({OS.MAC})
  public void testWindows() {
    System.out.println("Enabled for Windows");
  }

  @Test
  @EnabledOnJre({JRE.JAVA_8})
  public void testJDK8() {
    System.out.println("Enabled for JDK8");
  }

  @Test
  @EnabledOnJre({JRE.JAVA_17})
  public void testJDK17() {
    System.out.println("Enabled for JDK17");
  }

  @Test
  @EnabledIfSystemProperty(named = "os.version", matches = "match")
  public void testIfSystemProperty() {
    System.out.println("Enabled for JDK17");
  }
}
