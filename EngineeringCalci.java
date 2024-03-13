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
    
    public double lcm(double num1,double num2)
    {
     	if(num2 % num1 ==0)
	{
		return num1;
	}
	return lcm(num1%num2,num2);
   }
    
   public double[] answerData(double numerator,double denominator)
   {
	double lcmR = lcm(numerator,denominator);
	numerator  = numerator/lcmR;
	denominator = denominator/lcmR;
	double ans = numerator/denominator;
        double rem = numerator%denominator;
	return new double[]{ans,rem,denominator};	
   }
   
  public double mod(double num,double modulo)
  {
	return num%modulo;
  }
   
  public long abs(long num)
  {
	
      return num < 0 ? num-num-num : num;
  }
  	
  public EngineeringCalci(double q, double denominator)
  {
     this.q = q;
     this.denominator = denominator;
  }
  public EngineeringCalci()
  {
    
  }
  double r,result,q,denominator,multiplicant,ans;
  public static void main(String[] args) 
  {
	EngineeringCalci o = new EngineeringCalci(18,12);
        double arr[] = o.answerData(o.q,o.denominator);
        o.result = arr[0];
        o.r  = arr[1];
        o.multiplicant = arr[2];
        System.out.println(o);
        EngineeringCalci type1 = o.addition(10d,10d);
        EngineeringCalci type2 = new EngineeringCalci();
	type2.result = 20d;
	type2.r = 30d;
        EngineeringCalci type3 = new EngineeringCalci();
	type3.result = 40d;
	type3.r = 50d;
        EngineeringCalci type4 = o.addition(type2,type3);
        System.out.println(type4+"i");
        System.out.println(o.abs(-19l));	
   }
    
   public EngineeringCalci addition(double num1,double num2)
   {
		EngineeringCalci r1 = new EngineeringCalci();
                r1.result = num1;
          	r1.r = num2;
          	r1.multiplicant = num1+num2;
		return r1; 
   }
   
   public EngineeringCalci addition(EngineeringCalci data1,EngineeringCalci data2)
   {
		EngineeringCalci res = new EngineeringCalci();
		res.result = data1.result+data2.result;
		res.r = data1.r +data2.r;
		return res;
   }
   public String toString()
   {
	return result+" > "+r+" > "+ multiplicant;
   }
   
    
 }
