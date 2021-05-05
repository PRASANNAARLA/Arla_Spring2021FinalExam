/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10example02;

/**
 *
 * @author prasanna arla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 8;
        int arr[] = new int[]{12, 30, 15, 7, 11};

        int x = recursiveSearch(arr, 0, arr.length - 1, i);
        if (x != -1) {
            System.out.println("prasanna arla");
            System.out.println("Element " + i + " is located at index "
                    + x);
        } else {
            System.out.println("Element " + i + " is not present");
        }
    }

    private static int recursiveSearch(int[] array, int x, int y, int z) {
        if (y < x) {
            return -1;
        }
        if (array[x] == z) {
            return x;
        }
        if (array[y] == z) {
            return y;
        }
        return recursiveSearch(array, x + 1, y - 1, z);
    }
}
