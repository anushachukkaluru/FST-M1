package Activities;

public class Activity2{



    public static void function() {
        int[] digits= {10, 77, 10, 54, -11, 10};
        int tmp=0;
        for (int digit: digits) {
            if (digit == 10) {
                tmp = tmp + digit;
            }

        }
        if(tmp == 30)
        {System.out.println("temp value is as expected");}
    }
       public static void main(String[] args)
       {
           function();
       }
    }


