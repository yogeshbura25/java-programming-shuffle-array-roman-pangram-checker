class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = checkIfPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
        input = input.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (input.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
