class reverse {
    public static void main(String[] args) {
        int num = 1234;
        int reverse = 0;
        System.out.println("\nOriginal Number was: " +num);
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number is: " +reverse+ "\n");
    }
}