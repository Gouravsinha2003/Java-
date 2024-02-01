public class MaximumNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};

        int maxNumber = findMaxNumber(numbers);

        System.out.println("The maximum number in the array is: " + maxNumber);
    }

    public static int findMaxNumber(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        return maxNumber;
    }
}
 
