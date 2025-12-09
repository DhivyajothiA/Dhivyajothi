import java.util.Scanner;

public class OddPyramidRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        String previousRow = ""; 

        for (int i = 1; i <= rows; i++) {
            String currentRow = "";

            if (i % 2 == 0) {
               currentRow = previousRow;
            } else {
                int num = 1;
                for (int j = 1; j <= i; j++) {
                    currentRow += num + " ";
                    num += 2;
                }
                previousRow = currentRow; 
            }

            System.out.println(currentRow);
        }
    }
}
