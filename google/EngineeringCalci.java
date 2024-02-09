package google;
/*
 *  Factorial : 
 *  Inverse   :
 *  logarithm : 
 *  x^2
 *  
 */

 class EngineeringCalci
 {

    public long add(long num1,long num2)
    {
        return num1+num2;
    }

    public long sub(long num1,long num2)
    {
        return num1-num2;
    }

    public long mul(long num1,long num2)
    {
        return num1*num2;
    }

    public double div(double num1,double num2)
    {
        if(num2 == 0)
        {
            return -1d;
        }
        return num1/num2;
    }

    public long factorial(long num)
    {
        if(num ==0 || num == 1)
        {
            return 1l;
        }        
        return num*factorial(num-1);
    }

    public double permulation(long n,long r)
    {
        return factorial(n)/factorial(n-r);
    }

    public long combination(long n,long r)
    {
        return factorial(n)/factorial(r);
    }

    public long square(long num)
    {
        return num*num;
    }

    public long cube(long num)
    {
        return num*num*num;
    }
    
    public long lcm(long num1,long num2)
    {
     	if(num2 % num1 ==0)
	{
		return num1;
	}
	return lcm(num1%num2,num2);
   }
    
   public long[] answerData(long num1,long num2)
   {
	long num = lcm(num1,num2);
	num1  = num1/num;
	num2 = num2/num;
	long ans = num1/num2;
        long rem = num1%num2;
	return new long[]{ans,rem,num2};	
   }
   
  public long mod(long num,long modulo)
  {
	return num%modulo;
  }
   
  public long abs(long num)
  {
	
      return num < 0 ? num-num-num : num;
  }



  	

    public static void main(String[] args) {
	EngineeringCalci o = new EngineeringCalci();
	long arr[] = o.answerData(40,12);
        System.out.println(o.abs(-19l));
	for(long a : arr)
	{
		System.out.print(a+" > ");
	}
    }
 }
