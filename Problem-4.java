public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
        int[] counts = new int[10]; 
        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    counts[i]++;
                }
            }
        }
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts[i]);
            if (i != 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
