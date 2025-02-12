
class Main {
    public static void main(String[] args) {
        // Creating scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Taking the input string
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        
        // Convert the string into a character array
        char[] charArr = str.toCharArray();
        
        int left = 0;
        int right = str.length() - 1;
        
        // Swapping characters using two pointers
        while (left < right) {
            // Swap the characters
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
        
        // Convert the character array back to a string
        String reversedStr = new String(charArr);
        
        // Output the reversed string
        System.out.println("The reversed string is: " + reversedStr);
    }
}
