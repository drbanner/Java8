import java.util.function.Function;

/*
    Example of Function interface in Java-8
 */
public class FunctionDemo1 {

    public static void main(String[] args)
    {
        Function<String, Integer> stringLength = s -> s.length();

        System.out.println("Length of the string \"JaneDoe\" is: " + stringLength.apply("JaneDoe"));

        Function<Integer, Integer> squareRootFunction = i -> i * i;

        System.out.println("Square root of 15 is: " + squareRootFunction.apply(15));
    }
}
