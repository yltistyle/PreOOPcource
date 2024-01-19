package edu.penzgtu.oop.task21;

public class App {

    public static void main( String[] args ) {
        App print = new App();

        print.heightPiramid(10);
    }
    void heightPiramid(int height) {
        if (height < 0) {
            System.out.println("Error input");
        }
        StringBuilder value = new StringBuilder();
        for (int i = 0; i <= height; i++) {value.append(" ");}
        int cp = value.length()-2;
        while (cp >= 0){
            value.delete(0, 0);
            value.setCharAt(cp, '#');
            value.append("#");
            System.out.println(value);
            cp--;
        }
    }
}
