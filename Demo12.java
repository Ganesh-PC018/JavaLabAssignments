//  Questation : why if we print the object it gives output in the form of classname@hexcode  ?
//  Answer : has object class is supreme class and it by default provide the toString method which is inherited by Object class which gives result in above form.
//  
//  TIP : if we want to change the output then we have to override the toString method and then we can give name as we need.  



class pankaj{
	String name;
	pankaj(String name){
		this.name=name; 
	}
	
	
	//  overriding the toString method to give the customize output..
	
	public String toString(){
		return getClass().getName() + "@"+ Integer.toHexString(hashCode());
	}
	
	public static void main(String args[]){
		pankaj q = new pankaj("MAYUR");
		System.out.println(q);  
		pankaj w=null;
		System.out.println(w);
	}
	
}

//  this class has the by default code given by the toString method inherited from the object class 
// if we simply do not override the toString method from the object class then the it will give pankaj@hexCode


class mayur{
	public static void main(String args[]){
		mayur g = new mayur();
		System.out.println(g);
	}
}
