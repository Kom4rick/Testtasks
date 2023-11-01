

public class Task1 {
    public static void main(String[] args) {
        path(args[0],args[1]);

    }
    public static void path(String str, String str2) {
        int n = Integer.parseInt(str);
        int m = Integer.parseInt(str2);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int current = 0;
        
        do {
            System.out.print(array[current]);
            current = (current + m - 1) % n;
        } while (current != 0);
    }
}
