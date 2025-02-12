
class Main {
    public static void main(String[] args) {
        int arr[] = {67, 89, 9, 0, 8};
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
            if (arr[i] < smallest) smallest = arr[i];
        }

        // Corrected print statements with string concatenation
        System.out.println("smallest is " + smallest);
        System.out.println("largest is " + largest);
    }
}
