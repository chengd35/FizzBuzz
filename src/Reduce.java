public class Reduce {
    public static void main(String[] args) {
        //Starting number
        int i = 100;

        int counter = 0;

        while(i>0){
            //Even or odd
            boolean even = i % 2 == 0;

            if(even){
                i /= 2;
            }
            else{
                i -= 1;
            }
            counter++;
        }

        System.out.println(counter);

    }
}
