package annotations;

public class Child extends Parent {

  @Override
  public void methodToOverride() {
    System.out.println("Overriding method from parent class!");
  }
}
