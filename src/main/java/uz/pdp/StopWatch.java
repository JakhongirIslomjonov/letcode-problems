package uz.pdp;

public class StopWatch {

    // Private data fields for startTime and endTime
    private long startTime;
    private long endTime;

    // No-arg constructor that initializes startTime with the current time
    public StopWatch() {
        this.startTime = System.currentTimeMillis(); // Set startTime to current time in milliseconds
    }

    // Method to reset startTime to the current time
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Method to set endTime to the current time
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Method to calculate the elapsed time in milliseconds
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    // Main method to test the StopWatch class with selection sort
    public static void main(String[] args) {
        // Create a StopWatch object
        StopWatch stopwatch = new StopWatch();

        // Create an array of 100,000 numbers
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        // Start the stopwatch
        stopwatch.start();

        // Perform selection sort on the array
        selectionSort(array);

        // Stop the stopwatch
        stopwatch.stop();

        // Display the elapsed time
        System.out.println("Elapsed time in milliseconds: " + stopwatch.getElapsedTime());
    }

    // Method to perform selection sort on an array
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum value with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
