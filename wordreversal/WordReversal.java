public class WordReversal {
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

    // set reverse string
    // by reading the split array backwards
    public void setReverse() {
        for(int i = split.length - 1; i >= 0; i--) {
            reversed += split[i];
            // stops from adding unneeded space at end
            if(i != 0) {
                reversed += " ";
            }
        }
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
        reverseWord.setReverse();
        reverseWord.printValues();
    }
}