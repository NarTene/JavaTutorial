package Operators.Arithmetic_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        /*
         Operator	Result
	+	Addition
	-	Subtraction (also unary minus)
	*	Multiplication
	/	Division
	%	Modulus
	++	Increment
	+=	Addition assignment
	-=	Subtraction assignment
	*=	Multiplication assignment
	/=	Division assignment
	%=	Modulus assignment
	--	Decrement
         */

        //Arithmetic using integers
        System.out.println("Integer Arithmetic");
        int a = 1+1;
        int b = a*3;
        int c = b / 4;
        int d = c-a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // Arithmetic using doubles
        System.out.println("\n Floating Point Arithmetic");
        double da = 1+1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);






    }
}
