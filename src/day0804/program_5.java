package day0804;

public class program_5 {
    public static void main(String[] args) {
        int[][] arr = { {11,12,13,14}, {21,22,23,24}, {31,32,33,34} };
        for(int[] row : arr){
            for(int col:row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
