public class Liczydlo2 {
    public static void main(String[] args) {
        int[] licz3 = new int[]{3, 4, 5, 6, 3, 3, 3, 5, 5, 6, 7, 3};
        int count=0;
        for (int i = 0; i < 12; i++) {
            if (licz3[i] == 3) ;{
             count++;

            }
        } System.out.println(count);

    }
}