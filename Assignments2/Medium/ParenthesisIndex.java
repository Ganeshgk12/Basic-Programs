class ParenthesisIndex {

    public static int findClosingParenthesis(String sentence, int openingPosition) {
    
        if (sentence == null || openingPosition < 0 || openingPosition >= sentence.length()) {
            return -1;
        }

        int balance = 0;
        
        for (int i = openingPosition; i < sentence.length(); i++) {
          	  char c = sentence.charAt(i);
          	  
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance == 0) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
    
        String sentence = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
        
        int openingPosition = 10;
        
        int closingPosition = findClosingParenthesis(sentence, openingPosition);
        
        System.out.println("Closing parenthesis position: " + closingPosition);
    }
}
