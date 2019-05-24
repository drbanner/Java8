import java.util.function.Function;
/*
    Example of using Function interface Java-8
 */
public class FunctionDemo2 {

    public static void main(String[] args)
    {
        Function<String, String> function1 = s -> s.replaceAll(" ", "");
        String text = "Java8 Functions And Examples And Sample";
        System.out.println(function1.apply(text));

        Function<String, Integer> function2 = s -> s.length() - s.replaceAll(" ", "").length();
        System.out.println("Number of spaces in the string: " + function2.apply(text));

    }
}
