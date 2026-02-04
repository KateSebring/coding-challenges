import java.util.ArrayList;

public class WordReversal {
    // take in a string
    // divide up string into array by splitting at whitespace
    // create new string that reads the array backwards
    // print out new string

    private String original;
    private String reversed;
    private ArrayList<String> split;
    
    // initialize strings
    public WordReversal() {
        this.original = "";
        this.reversed = "";
    }

    // set original based on input
    public void setOriginal(String input) {
        this.original = input;
    }

    // split original at each whitespace
    // and add to the split arraylist
    public void splitOriginal() {

    }

    // set reverse string
    // by reading the split array backwards
    public void setReverse() {

    }

    // print out strings
    public void printValues() {
        System.out.println("Original input: " + this.original);
        System.out.println("Reversed input: " + this.reversed);
    }
}