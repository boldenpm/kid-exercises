public class Variables {

    public static void main(String[] args) {

        int integer = 1;
        boolean trueOrFalse = true;
        String text = "This is a String.  It can have whole numbers (integers) like [15], decimals (floating point) like [1.56] and special characters like [@#$^].";
        int[] integerArray = new int[10];
        
        integerArray[0] = 1;
        integerArray[1] = 3;
        integerArray[2] = 4;
        integerArray[3] = 9;
        integerArray[4] = 51;
        integerArray[5] = 98671;
        integerArray[6] = 0;
        integerArray[7] = -145;
        integerArray[8] = 3;
        integerArray[9] = 3;

        System.out.println(integer);
        System.out.println(trueOrFalse);
        System.out.println(text);
        System.out.println(integerArray);

        System.out.println("Do you think a quotation mark can be put in a String since it is surrounded by quotes?");

    }
}