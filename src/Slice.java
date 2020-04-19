import java.util.Arrays;

class Slice {

    // Function to get slice of a primitive array in Java
    public static int[] getSliceOfArray(int[] arr, int startIndex, int endIndex) {

        // Get the slice of the Array
        int[] slice = Arrays.copyOfRange(

                        // Source
                        arr,

                        // The Start index
                        startIndex,

                        // The end index
                        endIndex);

        // return the slice
        return slice;
    }


    public static void main(String[] args)
    {

        // Get the array, startIndex and endIndex
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 2, end = 4;

        // Get the slice of the array
        int[] slice2 = getSliceOfArray(arr, start, end + 1);

        // Not this way to print a slice of an array
        System.out.println(slice2);
        // Print the slice of the array
        System.out.println(Arrays.toString(slice2));
    }
}

