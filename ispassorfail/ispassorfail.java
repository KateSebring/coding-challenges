public class IsPassOrFail {
    public String checkScore(int score) {
        if(score < 50) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
    }

    public static void main(String[] args) {
        IsPassOrFail scoreChecker = new IsPassOrFail();
        scoreChecker.checkScore(55); // should print pass
        scoreChecker.checkScore(50); // should print pass
        scoreChecker.checkScore(49); // should print fail
        scoreChecker.checkScore(40); // should print fail
    }
}