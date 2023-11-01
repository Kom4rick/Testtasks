package main.java;

import java.io.*;


public class Task2 {
    public static void main(String[] args) throws IOException {
        circle(args[0], args[1]);
    }

    public static void circle(String krug, String dots) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(krug));
        BufferedReader br1 = new BufferedReader(new FileReader(dots));
        float[] koordinatyCentra = new float[2];
        float radius = 0;
        while (br.ready()) {
            String[] massiv = br.readLine().split(" ");
            for (int i = 0; i < massiv.length; i++) {
                if (massiv.length >= 2) {
                    koordinatyCentra[i] = Integer.parseInt(massiv[i]);
                } else radius = Float.parseFloat(massiv[i]);
            }
        }

        while (br1.ready()) {
            String[] massiv = br1.readLine().split(" ");
            if (Math.pow(Integer.parseInt(massiv[0]) - koordinatyCentra[0], 2) + Math.pow(Integer.parseInt(massiv[1]) - koordinatyCentra[1], 2) < Math.pow(radius, 2)) {
                System.out.print(1 + "\n");
            } else if (Math.pow(Integer.parseInt(massiv[0]) - koordinatyCentra[0], 2) + Math.pow(Integer.parseInt(massiv[1]) - koordinatyCentra[1], 2) > Math.pow(radius, 2)) {
                System.out.print(2 + "\n");
            } else {
                System.out.print(3 + "\n");
            }
        }
        br.close();
        br1.close();
    }
}
