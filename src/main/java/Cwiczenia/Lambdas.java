package Cwiczenia;

public class Lambdas {
    public static void main(String[] args) {
        // f(x) -> x*x
        MathOperation addition = (a, b) -> a+b;
        double additionResult = executeOperation(3.0, 15.0, addition);
        System.out.println("Wynik operacji (a,b ) " + additionResult);

        MathOperation substraction = (a,b) -> a-b;
        double additionResult1 =  executeOperation( 15.00, 3.00, substraction);
        System.out.println("Wynik Operacji dla a-b" + additionResult1 );

     MathOperation multiplication =(a,b) -> a*b;
     double additionResult2 = executeOperation( 3,3, multiplication );
        System.out.println("Wynik Operacji z mnozenia " + additionResult2 );

    }

    static double executeOperation (double a , double b, MathOperation operation){
        double result = operation.operate (a,b);
        return result;
    }
}
