public class WordReversal {
    // take in a string
    // divide up string into array by splitting at whitespace
    // create new string that reads the array backwards
    // print out new string

    private String original;
    private String reversed;
    private String[] split;
    
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
        split = this.original.split(" ");
    }

    public void printSplit() {
        for(int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
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

    public static void main(String[] args) {
        WordReversal reverseWord = new WordReversal();
        reverseWord.setOriginal("dog and cat are friends");
        reverseWord.splitOriginal();
        reverseWord.printSplit();
    }
}