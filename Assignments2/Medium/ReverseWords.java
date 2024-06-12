class ReverseWords {

    public static void reverseWords(char[] message) {
       
        reverse(message, 0, message.length - 1);
        int start = 0;
        for (int end = 0; end < message.length; end++) {
            if (message[end] == ' ') {
                reverse(message, start, end - 1);
                start = end + 1;
            } else if (end == message.length - 1) {
                reverse(message, start, end);
            }
        }
    }

    private static void reverse(char[] message, int start, int end) {
        while (start < end) {
            char temp = message[start];
            message[start] = message[end];
            message[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] message = {'c', 'a', 'k', 'e', ' ',
                        		  'p', 'o', 'u', 'n', 'd', ' ',
                         		 's', 't', 'e', 'a', 'l'};
        System.out.println("Original message: " + new String(message));
        reverseWords(message);
        System.out.println("Reversed message: " + new String(message));
    }
}
