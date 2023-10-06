public class Ejercisio11 {
    public static void main(String[] args) {
        int factorial1 = 10;

        medirFactorial(factorial1);
    }

    public static void medirFactorial(int factorial){
        int result = 1;
        for (int i = factorial; i > 0; i--) { 

            result = result * i ;

            if (i > 1) {
                 System.out.print(i+" x ");
            }
            if (i == 1) {
                 System.out.print(i+" : "+result);
            }
        }
    }
}
