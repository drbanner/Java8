public class Java8Demo {

    public static void main(String [] args) {
        Interface1 interface1 = () -> System.out.println("Test the lambda demo");
        interface1.m1();

        Interface2 addition = (a,b) -> System.out.println("Addition on a and b using lambda expression: "+ (a+b));
        Interface2 subtraction = (a,b) -> System.out.println("Subtraction on a and b using lambda expression: "+ (a-b));
        Interface2 multiply = (a,b) -> System.out.println("Multiplication on a and b using lambda expression: "+ (a*b));
        Interface2 divide = (a,b) -> System.out.println("Division on a and b using lambda expression: "+ (a/b));

        addition.operation(5,8);
        subtraction.operation(66,9);
        multiply.operation(66,6);
        divide.operation(66,9);

        Interface3 interface3 = s -> System.out.println("Length of string: "+s.length());
        interface3.stringLength("JaneDoe");
    }
}

interface Interface1
{
    public void m1();
}


interface Interface2
{
    public void operation(int a, int b);
}

interface Interface3
{
    public void stringLength(String s);
}