package exercise;

public class ArrayExercise {
    public static void main(String[] args) {

        // Array declare +initilize
        int[] numbers = {10,20,30,40,50};

        // Array declare
        int[] ages = new int[5];

        // Array initilization
//        ages[0] = 10;
//        ages[1] = 20;
//        ages[2] = 30;
//        ages[3] = 40;
//        ages[4] = 50;

        for (int i = 0; i< ages.length; i++){
            ages[i] = 10 * (i+1);
        }

        String[] months =  {"jan","feb","mar"};

        for (int i =0; i< months.length; i++)
            System.out.println(months[i]);

        // how to traverse array element
        for (int i = 0; i<ages.length; i++){
            System.out.println(i + "=" + ages[i]);
        }
    }
}
