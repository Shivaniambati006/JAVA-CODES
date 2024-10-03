public class Practice1 {

    public static void fun(int[] n) {
        n[2] = 9;  // Modifying the 3rd element of the array (index 2)
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};  // Declare and initialize the array
        fun(a);  // Pass the array to the function
        System.out.println(a[2]);  // Print the 3rd element of the array (index 2)
    }
}
