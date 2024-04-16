/*
    Prime and Non Prime Number Count
    Fun : wheter is it Prime or not;
    Fun : random Task (array )
    Random Number Condition :
                1.  each Number Cotains 7 Digits(it must be 7 Digit)
                2.  Array of N length
                3. Generate Digit and Extracr 7 Digit from it in  1 
                4. Always Avoid Using STATIC method
                5. Reverse The Condition 
*/
class RandomNumberGenerate
{
    Byte a11 =1;
    public void generateNumber(int []array,int length)
    {
        long givenNum=0l;
        for(int i=0;i<length;i++)
        {
            givenNum += System.currentTimeMillis();
            if(givenNum%9999999 < 1000000)
            {
                givenNum += System.nanoTime()+1263485;//You Can Use While Loop Here
            }
            array[i] = (int)Math.abs(givenNum%(int)9999999);
            givenNum = givenNum + 187246+System.nanoTime(); 
        }
    }
}
class PrimeNumberCount
{
    public static boolean isPrime(int num)
    {
        for(int i=2;i*i < num;i++)
        {
            if(num %i == 0)
            {
                return false;
            }
        }
        return true;
    }

    // public static int isPrime2(int num)
    // {
    //     int i=2;
    //     int flag = 0;
    //    while(num > i*i)
    //    {
    //          if(num%i != 0)
    //          {
    //             flag =1;
    //          }
    //          else
    //          {
    //             flag =0;
    //          }
    //         i++;
    //    }

    //    return flag;
    // }
    public int[] countPrimeOrNot(int array[],int length)
    {
        int primeCount =0;
        int nonPrimeCount =0;

        for(int i=0;i<length;i++)
        {
            if(isPrime(array[i]))
            {
                primeCount++;
            }
            else
            {
                nonPrimeCount++;
            }
        }
        return new int[]{primeCount,nonPrimeCount};
    }
    public int[] countPrimeOrNot2(int array[],int length)
    {
        int primeCount =0;
        int nonPrimeCount =0;

        for(int i=0;i<length;i++)
        {
            if(!isPrime(array[i]))
            {
                nonPrimeCount++;
            }
            else
            {
                primeCount++;
            }
        }
        return new int[]{primeCount,nonPrimeCount};
    }
   

    public static void main(String[] args) {
    int array[] = new int[1000000];
    // int array1[] = new int[2];
    RandomNumberGenerate num = new RandomNumberGenerate();
    num.generateNumber(array, 1000000);
    // PrimeNumberCount.printData(array);
    PrimeNumberCount objPrime = new PrimeNumberCount();
    System.out.println("|---------------------------------------------------------------|");
    System.out.println("|\t\t\tPrime or Non-Prime\t\t\t|");
    int arr[] = new int[2];
    for(int i=0;i<5;i++)
    {
        long start = System.currentTimeMillis();
        arr = objPrime.countPrimeOrNot(array, 1000000);
        long end = System.currentTimeMillis();
        long duration = end-start;
        System.out.println("|\t\t\t\t"+duration+"\t\t\t\t|");
        
    }
    System.out.println("Prime Count : "+arr[0]);
    System.out.println("Non-Prime Count : "+arr[1]);
    System.out.println("|---------------------------------------------------------------|");
    System.out.println("|\t\t\tPrime or Non-Prime\t\t\t|");
    for(int i=0;i<5;i++)
    {
        long start = System.currentTimeMillis();
         arr = objPrime.countPrimeOrNot2(array, 1000000);
        long end = System.currentTimeMillis();
        long duration = end-start;
        System.out.println("|\t\t\t\t"+duration+"\t\t\t\t|");
        
    }
    System.out.println("Prime Count : "+arr[0]);
    System.out.println("Non-Prime Count : "+arr[1]);
    System.out.println("|---------------------------------------------------------------|");
}

    public static void printData(int array[])
    {
        for(int i=0;i<array.length;i++)
        System.out.println(array[i]);
    }
}