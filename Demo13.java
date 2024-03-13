class Father {
	int balance;
	static int money;
	static String name ;
	public Father()
    {
        System.out.println(balance);
    }
	public static void main(String[] args){
		Father a = new Father();
		System.out.println(a);
		a.balance = 2309;
		money =9023;
		System.out.println(a.varag(a.balance,money,345,23,232));
		System.out.println(a.objectIsSupremClass(a)); // it gives the output Father@1db16a6 where Father is a static referance and 1db16a6 is instance memory referance.
		System.out.println(a.classAsReturnType(a));
		
	}
	
	
	public int varag(int a, int... b){  // int... b is a array of parameter passed to the function
		int q = 0;
		for (int i=0;i<b.length;i++){
			q = q + b[i];   // to access the varag element we have to use the varag as an array object..
			System.out.println(q);
		}
		System.out.println("balance + length "+(a + b.length));
		return a;
	}
	public Object objectIsSupremClass(Father b)
    {
		return b;	
	}
	public Father classAsReturnType(Father b)
    {
		return b;
	}
	
}