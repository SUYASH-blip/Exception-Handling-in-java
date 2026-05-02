public class Multiple_Catch_Blocks {

        public static void main(String[] args) {


            int[] hello = new int[10];



            try{
                hello[10] = 90;
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            catch(RuntimeException e){
                System.out.println(e);
            }
        }
    }

// try and catch blocks must always be written inside a method.

// we can also catch multiple exceptions inside a single catch block like
//catch(Aritmetic | Runtime | Indexoutofbounds ) etc but follow hierarchy .


