public class IsPassOrFail {
    public String checkScore(int score) {
        if(score < 50) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    public static void main(String[] args) {
        IsPassOrFail scoreChecker = new IsPassOrFail();
        String result;
        result = scoreChecker.checkScore(55); 
        System.out.println(result);

        result = scoreChecker.checkScore(50); 
        System.out.println(result);

        result = scoreChecker.checkScore(49); 
        System.out.println(result);

        result = scoreChecker.checkScore(55); 
        System.out.println(result);
    }
}