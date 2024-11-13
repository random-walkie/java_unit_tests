public class Greeter {
  @org.jetbrains.annotations.NotNull
  @org.jetbrains.annotations.Contract(pure = true)
  public static String greet(String name) {
    return "Hello " + name + "!";
  }
}
