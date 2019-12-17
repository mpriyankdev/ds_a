package test1;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        App app = new App();
        //app.testBitwiseOpeartion();
        app.testMathFunction();


    }

    private void testBitwiseOpeartion(){
        int a = 2;
        int b = 5;

        System.out.println("bitwise-and[a&b] : "+(a&b));
        System.out.println("bitwise-or[a|b] : "+ (a|b));
        System.out.println("bitwise-xor[a^b] : "+ (a^b));
        System.out.println("rightshift[a>>b] : "+ (a>>1));
        System.out.println("leftshift[a<<b] : "+ (a<<2));
        System.out.println("complement[~a] : "+ (~a));

        System.out.println(1234567892&(1));
    }

    public void testMathFunction(){
        Random r = new Random();

        System.out.println(r.nextInt(10));
    }
}
