package google;
public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");        
        StringBuilder s2 = new StringBuilder(" Java");

        System.out.println("Append : "+s1.append(s2));
        System.out.println(s1);
        System.out.println("insert : "+s1.insert(2,"i"));
        System.out.println(s1);
        System.out.println("delete : "+s1.delete(7, 11)); //end Works Here with any value
        System.out.println(s1);
        System.out.println(s1.replace(0,6,"Hello"));
        System.out.println(s1);
        System.out.println(s2.reverse());
        System.out.println(s1.hashCode());
        System.out.println(s1.append("Here we have appended text to see wheter hashcode Changes."));
        System.out.println(s1.hashCode());
    }

}
