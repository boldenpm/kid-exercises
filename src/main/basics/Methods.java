public class Methods {

    public static void main(String... args) {
        
        String methodArgument = "Just a string";

        methodWithNoArguments();
        methodWithAnArgument(methodArgument);
    }

    private static methodWithNoArguments() {
        System.out.println("A method is a section of code that runs when called by another block of code");
    }

    private static methodWithArgument(final String thisIsTheArgument) {
        System.out.println(thisIsTheArgument);
    }
}