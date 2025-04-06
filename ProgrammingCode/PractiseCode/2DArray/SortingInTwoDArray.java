public class SortingInTwoDArray {
    
    public static void main(String[] args) {
        int[][] arr = CreateArray.createArray();
        
        // Flatten the 2D array for easier sorting
        int totalElements = 0;
        for (int i = 0; i < arr.length; i++) {
            totalElements += arr[i].length;
        }
        
        int[] flattened = new int[totalElements];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                flattened[index++] = arr[i][j];
            }
        }
        
        // Bubble sort on the flattened array
        for (int i = 0; i < flattened.length - 1; i++) {
            for (int j = 0; j < flattened.length - i - 1; j++) {
                if (flattened[j] > flattened[j + 1]) {
                    int temp = flattened[j];
                    flattened[j] = flattened[j + 1];
                    flattened[j + 1] = temp;
                }
            }
        }
        
        // Put the sorted elements back into the 2D array
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = flattened[index++];
            }
        }
        
        // Print the sorted 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}