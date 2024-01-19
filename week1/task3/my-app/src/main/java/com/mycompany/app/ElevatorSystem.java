package com.mycompany.app;

import java.util.Objects;
import java.util.Scanner;

public class ElevatorSystem {
    public static void main(String[] args) {
        ElevatorControlSystem elevatorControlSystem = new ElevatorControlSystem();
        elevatorControlSystem.elevators.initialize(3);
        elevatorControlSystem.elevators.setQuantity(3);
        elevatorControlSystem.start();
    }
}

class ElevatorControlSystem {
    Elevator elevators = new Elevator();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Elevator System Started.");

        while (true) {
            System.out.println("Which floor will we go up/down to? (Type 'exit' to end)");
            int floorNum = getInput();
            if (floorNum == -1) {
                break;
            }
            operateElevator(floorNum);
        }

        end();
    }

    private int getInput() {
        if (!scanner.hasNextInt()) {
            String input = scanner.nextLine().trim();
            if (Objects.equals(input, "exit")) {
                return -1;
            } else {
                System.out.println("Enter an integer or type 'exit' to end!");
                return getInput();
            }
        }

        int floor = scanner.nextInt();
        if (floor > elevators.getMaxFloor() || floor < 1) {
            System.out.println("Wrong floor! Please enter a valid floor number.");
            return getInput();
        }

        return floor;
    }

    private void operateElevator(int floorNum) {
        int elevatorIndex = searchClosestElevator(floorNum);
        System.out.println("Elevator " + elevatorIndex + " is coming from floor " + elevators.getFloor(elevatorIndex));
        elevators.setFloor(elevatorIndex, floorNum);
    }

    private int searchClosestElevator(int floorNum) {
        int minDistance = Integer.MAX_VALUE;
        int closestElevatorIndex = 0;

        for (int i = 0; i < elevators.getQuantity(); i++) {
            int distance = Math.abs(floorNum - elevators.getFloor(i));
            if (distance < minDistance) {
                minDistance = distance;
                closestElevatorIndex = i;
            }
        }

        return closestElevatorIndex;
    }

    private void end() {
        System.out.println("-----------------------------------");
        System.out.println("Elevator System Ended. Thank you for using!");
    }
}
