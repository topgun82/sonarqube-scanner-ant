public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  void uncoveredMethod() {
    System.out.println(foo());
  }
}
