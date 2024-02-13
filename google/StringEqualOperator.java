package google;

public class StringEqualOperator {
    public static void main(String[] args) {
        String name = "Ganesh";
        String name1 = "Ganesh";
        String name2 = new String("Ganesh");
        System.out.println(name == name1);
        System.out.println(name == name2);
        //Above will Compare Reference 
        /*
         * **************************************************
         *              STRING CONSTANT POOL                *
         *                                                  *----------------> name
         *                                                  *
         *                                                  *
         *                    "Ganesh"                      *----------------> name1
         *                                                  *
         *                                                  *
         *                                                  *
         ****************************************************
         *                  NON HEAP                        *
         *                                                  *
         *                                                  *
         *                  New : "Ganesh"                  * ---------------> name2
         *                                                  *
         *                                                  *
         *                                                  *
         *                                                  * 
         ****************************************************
         */

    }
}
