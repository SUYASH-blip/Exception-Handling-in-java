public class First_Basic_Program {



        public static void main(String[] args) {


            int[] numerator = {10,20,30,200};
            int[] denominator = {5,0,5,10};

            for (int i = 0; i < numerator.length ; i++) {
                System.out.println(divide(numerator[i],denominator[i]));

            }
        }

        static int divide(int a , int b ) {

            try {
                return a / b;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            return -1;
        }
    }


