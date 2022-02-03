package annotations;

public class Parent {

  public void methodToOverride() {
    System.out.println("Method in parent class!");
  }

  @Deprecated
  public void methodToDeprecate() {
    System.out.println("Old and busted!");
  }
}
