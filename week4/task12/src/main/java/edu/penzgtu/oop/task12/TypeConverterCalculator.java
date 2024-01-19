package edu.penzgtu.oop.task12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeConverterCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        getType(scan, "boolean");
        scan.close();
    }

    static void getType(Scanner scan, String type) {
        type = type.toLowerCase();
        switch(type){
            case "int":
                if (!scan.hasNextInt()) throw new InputError(type);
                System.out.printf("Result: %s", scan.nextInt());
                break;
            case "double":
                if (!scan.hasNextDouble()) throw new InputError(type);
                System.out.printf("Result: %s", scan.nextDouble());
                break;
            case "float":
                if (!scan.hasNextDouble()) throw new InputError(type);
                System.out.printf("Result: %s", scan.nextDouble());
            case "string":
                if (!scan.hasNext()) throw new InputError(type);
                System.out.printf("Result: %s", scan.next());
                break;
            case "char":
                if (!scan.hasNextDouble()) throw new InputError(type);
                System.out.printf("Result (char.toString): %s", scan.next());
                break;
            case "boolean":
                if (!scan.hasNextBoolean()) throw new InputError(type);
                System.out.printf("Result: %s", scan.nextBoolean());
                scan.close();
                break;
            default :
                throw new InputMismatchException("The data type is not defined\n");
        }
    }
}