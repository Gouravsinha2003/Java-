public class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = {1,5,2,3,3,2,5,1};
        int[] frequencies = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (frequencies[i] == -1) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frequencies[j] = -1;
                }
            }
            frequencies[i] = count;
            System.out.println(array[i] + " occurs " + count + " times");
        }
    }
}