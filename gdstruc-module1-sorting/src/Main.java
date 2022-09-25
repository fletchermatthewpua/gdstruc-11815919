public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -58;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        //printing unsorted numbers for bubble sort
        System.out.println("Bubble Sort in descending order\nBefore bubble sort: ");
        printArrayElements(numbers);

        //bubble sorting the elements in descending order
       bubbleSort(numbers);

        //printing bubble sorted numbers
        System.out.println("\n\nAfter bubble sort: ");
        printArrayElements(numbers);


        //another array for selection sort
        int[] numbersTwo = new int[10];

        numbersTwo[0] = 45;
        numbersTwo[1] = 15;
        numbersTwo[2] = 4;
        numbersTwo[3] = 78;
        numbersTwo[4] = -9;
        numbersTwo[5] = 109;
        numbersTwo[6] = 51;
        numbersTwo[7] = 77;
        numbersTwo[8] = 301;
        numbersTwo[9] = 11;

        //printing unsorted numbers for selection sort
        System.out.println("\n\nSelection Sort in descending order\nBefore selection sort: ");
        printArrayElements(numbersTwo);

        //selection sorting the elements in descending order
        selectionSort(numbersTwo);

        //printing selection sorted numbers
        System.out.println("\n\nAfter selection sort: ");
        printArrayElements(numbersTwo);
    }


    //bubble sort in descending order
    private static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                //swapping the elements
                if (arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //selection sorting in descending order but finding the smallest number first
    private static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int largestIndex = i;

            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[j] > arr[largestIndex])
                {
                    largestIndex = j;
                }
            }

            if (arr[i] < arr[largestIndex])
            {
                int temp = arr[largestIndex];
                arr[largestIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

}