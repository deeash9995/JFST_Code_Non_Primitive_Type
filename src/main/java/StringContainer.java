import java.util.Scanner;

public class StringContainer {

    public static void main(String[] args) {
        String inputText;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter input text: ");
        inputText = scan.nextLine();

        StringContainer container = new StringContainer();
        System.out.println("Text in String Container : " + container.storeString(inputText));
    }

    private String storeString(String inputText) {
        //write your implementation
        return null;
    }

}
