import java.util.Arrays;

public class Rough 
{
    public static void main(String[] args) 
    {
        Rough r1 = new Rough();
        String arr[] = new String[50000];
        
        r1.firstFour(arr);
        // printData(arr);


        /*Using System.nanoTime() method */
        long startTIme = System.nanoTime();
        r1.deptId(arr);
        r1.lastThree(arr);
        long endTime = System.nanoTime();
        long duration = endTime - startTIme;
        System.out.println("Time taken to generate numbers using nanoTime() method : "+ duration);
        System.out.println("-------------------------------------------------------------------------------------");
        // String ss2 = arr[0].substring(arr[0].length() - 3);

        // //Calculating time for first approach.
        // long startTIme1 = System.nanoTime();
        // int isValid = isValidRegistration1(arr);
        // long endTime1 = System.nanoTime();
        // long duration1 = endTime1 - startTIme1;
        // System.out.println("Time taken to run first approach : "+ duration1);
        // System.out.println("Last three digits are valid : "+ isValid);
        // System.out.println("-------------------------------------------------------------------------------------");

        // //Calculating time for second approach.
        // long startTIme2 = System.nanoTime();
        // int isValid1 = isValidRegistration2(arr, ss2);
        // long endTime2 = System.nanoTime();
        // long duration2 = endTime2 - startTIme2;
        // System.out.println("Time taken to run second approach : "+ duration2);
        // System.out.println("Valid last three digits : "+ isValid1);
      for(int i=0;i<4;i++)
      {

          System.out.println("--------------------------------------------"+ i +"-----------------------------------------");
          //Calculating time for third approach.
          long startTIme3 = System.nanoTime();
          int isValid2 = isValidRegistration3(arr, 50000);
          long endTime3 = System.nanoTime();
          long duration3 = endTime3 - startTIme3;
          System.out.println("Time taken to run third approach : "+ duration3);
          startTIme3 = System.nanoTime();
          isValid2 = isValidRegistration3(arr, 20000);
          endTime3 = System.nanoTime();
          duration3 = endTime3 - startTIme3;
          System.out.println("Time taken to run third approach : "+ duration3);
          startTIme3 = System.nanoTime();
          isValid2 = isValidRegistration3(arr, 10000);
          endTime3 = System.nanoTime();
          duration3 = endTime3 - startTIme3;
          System.out.println("Time taken to run third approach : "+ duration3);
          startTIme3 = System.nanoTime(); 
          isValid2 = isValidRegistration3(arr, 5000);
          endTime3 = System.nanoTime();
          System.out.println("Time taken to run third approach : "+ duration3);

          System.out.println("Valid last three digits are : "+isValid2);
          endTime3 = System.nanoTime();

      }

        /*Using System.currentTimeMillis() method */
        // long startTIme1 = System.currentTimeMillis();
        // r1.deptId1(arr);
        // r1.lastThree1(arr);
        // long endTime1 = System.currentTimeMillis();
        // long duration1 = endTime1 + startTIme1;
        // System.out.println("Time taken to generate numbers using currentTimeMillis() method : " + duration1);
    }
    /*-----------------------------------------------------------Using System.nanoTime() method----------------------------------------------------- */
    
    public void firstFour(String[] arr)
    {
        //get the current time in nanoseconds.
        long nanoTime = System.nanoTime();
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = String.valueOf((nanoTime % 9999)+1); //% operator compute remainder of dividing nanoTime by 9999. This operation ensures result is between 0 to 9998. by adding 1 the geneted number is within the range 1 to 9999 . 0001 to 9999
            arr[i] = String.format("%04d",Integer.parseInt(arr[i]));
            nanoTime+=13;
        }
        deptId(arr);
        lastThree(arr);
        // printData(arr);

    }

    public void deptId(String arr[])
    {
        long nanoTime = System.nanoTime();
        for(int i=0;i<arr.length;i++)
        {
            String s = "";
            for(int j=0;j<3;j++)
            {
                s = s + String.valueOf((char)((nanoTime % 10)+'a'));
                nanoTime +=13;
            }
            arr[i] = arr[i] + s;
            nanoTime += 13;
        }
    }

    public void lastThree(String arr[])
    {
        long nanoTime = System.nanoTime();
        for(int i=0; i<arr.length;i++)
        {
            String s1 = "";
            for(int j=0;j<3;j++)
            {
                s1 = String.valueOf((nanoTime % 999)+1);
                s1 = String.format("%03d", Integer.parseInt(s1));
                nanoTime += 13;
            }
            arr[i] = arr[i] + s1;
            nanoTime+=13;
        }
        
    }

    // /*----------------------------------------------------Using System.currentTimeMillis() method------------------------------------------- */

    // public void firstFour1(String[] arr)
    // {
    //     //get the current time in nanoseconds.
    //     long millsTime = System.currentTimeMillis();
    //     for(int i=0; i<arr.length;i++)
    //     {
    //         arr[i] = String.valueOf((millsTime % 9999)+1); 
    //         arr[i] = String.format("%04d",Integer.parseInt(arr[i]));
    //         millsTime+=13;
    //     }
    //     deptId1(arr);
    //     lastThree1(arr);

    // }

    // public void deptId1(String arr[])
    // {
    //     long millsTime = System.currentTimeMillis();
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         String s = "";
    //         for(int j=0;j<3;j++)
    //         {
    //             s = s + String.valueOf((char)((millsTime % 10)+'a'));
    //             millsTime +=13;
    //         }
    //         arr[i] = arr[i] + s;
    //         millsTime += 13;
    //     }
    // }

    // public void lastThree1(String arr[])
    // {
    //     long millsTime = System.currentTimeMillis();
    //     for(int i=0; i<arr.length;i++)
    //     {
    //         String s1 = "";
    //         for(int j=0;j<3;j++)
    //         {
    //             s1 = String.valueOf((millsTime % 999)+1);
    //             s1 = String.format("%03d", Integer.parseInt(s1));
    //             millsTime += 13;
    //         }
    //         arr[i] = arr[i] + s1;
    //         millsTime+=13;
    //     }
        
    // }
/*-----------------------------------------First Approach---------------------------------------------------------- */

    public static int isValidRegistration1(String[] arr,int length)
    {
        //Here we validate the sequence number using different approaches.
        int count = 0;
        for(int i = 0; i<length;i++)
        {
            String regNumber = arr[i];
            // String s1 = regNumber.substring(regNumber.length() - 3);
            String lastThreeDigits = regNumber.substring(regNumber.length() - 3);   
            int lastThree = Integer.parseInt(lastThreeDigits);
            if (lastThree <= 50) 
            {
                count++;
            }
        
        }
        return count;
       
        
    }

/*------------------------------------Second Approach--------------------------------------------------------------- */
    public static int isValidRegistration2(String[] arr, int length)
    {
        int count = 0;
        
        for(int i=0; i<length;i++)
        {
            String regNumber = arr[i];
            int sequenceNumber = 0;
            for (int j = regNumber.length() - 3; j < regNumber.length(); j++) 
            {
                char c = regNumber.charAt(j);
                if (Character.isDigit(c)) 
                {
                    sequenceNumber = sequenceNumber * 10 + Character.getNumericValue(c); // Construct the number by multiplying by 10 and adding
                                                               // the next digit
                }
                // int digitValue = Character.getNumericValue(c);
                
            }
            if (sequenceNumber <= 50) 
            {
                count++; // If the sequence number is less than 50, the registration is invalid
            }

        }
        return count;
    }


    /*--------------------------------Third Approach------------------------------------------------------------- */
    
    public static int isValidRegistration3(String[] arr, int  length)
    {
        int count = 0;
        for(int i=0;i<length;i++)
        {
            String regNumber = arr[i];
            int sequenceNumber = 0;
            for (int j = regNumber.length() - 3 ; j < regNumber.length(); j++) 
            {
                char c = regNumber.charAt(j);
                int digitValue = Character.digit(c, 10); // Get the numeric value of the character
                sequenceNumber = sequenceNumber * 10 + digitValue; // Construct the number by multiplying by 10 and adding
                                                                   // the next digit
            }
            if (sequenceNumber <= 50) {
                count++; // If the sequence number is less than 50, the registration is invalid
            }

        }
        return count;
    }

public static void printData(String arr[])
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}