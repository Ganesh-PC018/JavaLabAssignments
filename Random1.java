// import java.util.Arrays;

public class Random1 
{
    public static void main(String[] args) 
    {
        Random1 r1 = new Random1();

        // Define array sizes
        int[] arraySizes = {5000, 4000, 3000, 2000, 1000};

        // Printing header for the table
        
        // Calculate and print time for different array sizes
        long startTimeFirstApproach=0;
        long durationFirstApproach=0;
        long endTimeFirstApproach=0,startTimeSecondApproach=0,endTimeSecondApproach=0,durationSecondApproach=0,startTimeThirdApproach=0,endTimeThirdApproach=0,durationThirdApproach=0;
        for (int i = 0; i < arraySizes.length; i++) 
        {
            int size = arraySizes[i];
            String[] arr = new String[size];
            r1.firstFour(arr);
            // Calculating time for the first approach
            startTimeFirstApproach= System.nanoTime();
            isValidRegistration1(arr);
            endTimeFirstApproach= System.nanoTime();
            durationFirstApproach= endTimeFirstApproach - startTimeFirstApproach;
        
            // Calculating time for the second approach
             startTimeSecondApproach = System.nanoTime();
            isValidRegistration2(arr, arr[0].substring(arr[0].length() - 3));
            endTimeSecondApproach = System.nanoTime();
            durationSecondApproach = endTimeSecondApproach - startTimeSecondApproach;
        
            // Calculating time for the third approach
            startTimeThirdApproach = System.nanoTime();
            isValidRegistration3(arr, arr[0].substring(arr[0].length() - 3));
            endTimeThirdApproach = System.nanoTime();
            durationThirdApproach = endTimeThirdApproach - startTimeThirdApproach;
            
            // Printing data for each array size
            printData(size, arr);
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-20s | %-20s | %-20s |%n", "Array Size","First Approach", "Second Approach", "Third Approach");
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int i=0;i<arraySizes.length;i++)
        {
            System.out.printf("| %-20d | %-20d | %-20d | %-20d |%n", arraySizes[i], durationFirstApproach, durationSecondApproach, durationThirdApproach);
            // Printing the table footer
            System.out.println("---------------------------------------------------------------------------------------------");
        }       
    }
    public static void printData(int arraySizes,String []arr)
    {
        for(int i=0;i<arraySizes;i++)
        {
            System.out.println(arr[i]);
        }
    }
    // Method to generate initial data
    public void firstFour(String[] arr) 
    {
        long nanoTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = String.valueOf((nanoTime % 9999) + 1);
            arr[i] = String.format("%04d", Integer.parseInt(arr[i]));
            nanoTime += 3;
        }
        deptId(arr);
        lastThree(arr);
    }
    // Method to generate department IDs
    public void deptId(String arr[]) 
    {
        long nanoTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) 
        {
            String s = "";
            for (int j = 0; j < 3; j++) 
            {
                s = s + String.valueOf((char) ((nanoTime % 10) + 'a'));
                nanoTime += 3;
                switch ((int)nanoTime % 10) {
                    case 1:
                        nanoTime = nanoTime * (long) Math.pow(34 + j, 2);
                        break;
                    case 2:
                        nanoTime = nanoTime + System.currentTimeMillis();
                        break;
                    case 3:
                        nanoTime = nanoTime * 123;
                        break;
                    case 4:
                        nanoTime = (long) s.hashCode();
                        break;
                    case 5:
                        nanoTime = nanoTime + System.currentTimeMillis();
                        break;
                    case 6:
                        nanoTime = nanoTime * 123;
                        break;
                    case 7:
                        nanoTime = (long) s.hashCode();
                        break;
                    case 8:
                        nanoTime = nanoTime / 2 + nanoTime;
                }
            }
            arr[i] = arr[i] + s;
            nanoTime += 13;
        }
    }
    // Method to generate last three digits
    public void lastThree(String arr[]) 
    {
        long nanoTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) 
        {
            String s1 = "";
            for (int j = 0; j < 3; j++) {
                s1 = String.valueOf((nanoTime % 999) + 1);
                s1 = String.format("%03d", Integer.parseInt(s1));
                nanoTime += 13;
            }
            arr[i] = arr[i] + s1;
            nanoTime += 13;
        }
    }
    // Method to check validity of registration using the first approach
    public static int isValidRegistration1(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String regNumber = arr[i];
            String lastThreeDigits = regNumber.substring(regNumber.length() - 3);
            int lastThree = Integer.parseInt(lastThreeDigits);
            if (lastThree <= 50) {
                count++;
            }
        }
        return count;
    }
    // Method to check validity of registration using the second approach
    public static int isValidRegistration2(String[] arr, String s1) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String regNumber = arr[i];
            int sequenceNumber = 0;
            for (int j = regNumber.length() - 3; j < regNumber.length(); j++) {
                char c = regNumber.charAt(j);
                if (Character.isDigit(c)) {
                    sequenceNumber = sequenceNumber * 10 + Character.getNumericValue(c);
                }
            }
            if (sequenceNumber <= 50) {
                count++;
            }
        }
        return count;
    }
    // Method to check validity of registration using the third approach
    public static int isValidRegistration3(String[] arr, String s1) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String regNumber = arr[i];
            int sequenceNumber = 0;
            for (int j = regNumber.length() - 3; j < regNumber.length(); j++) {
                char c = regNumber.charAt(j);
                int digitValue = Character.digit(c, 10);
                sequenceNumber = sequenceNumber * 10 + digitValue;
            }
            if (sequenceNumber <= 50) {
                count++;
            }
        }
        return count;
    }
    // Method to print a row in the table
    public static void printTableRow(String operation, long time) {
        System.out.printf("| %-20s | %-10d |%n", operation, time);
    }
}