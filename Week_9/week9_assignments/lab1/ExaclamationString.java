public class ExaclamationString {
    //vars
    private String userInput;
    private String result;
    private char c;
    private char up;

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    // compute
    public void replaceVowelsWithExclamation() {
        if (userInput == null) {
            result = "";
            return;
        }
        StringBuilder sb = new StringBuilder(userInput.length());
        for (int i = 0; i < userInput.length(); i++) {
            c = userInput.charAt(i);
            up = Character.toUpperCase(c);
            if (up == 'A' || up == 'E' || up == 'I' || up == 'O' || up == 'U') {
                sb.append('!');
            } else {
                sb.append(c);
            }
        }
        result = sb.toString();
    }

    public String getResult() {
        return result;
    }
}
