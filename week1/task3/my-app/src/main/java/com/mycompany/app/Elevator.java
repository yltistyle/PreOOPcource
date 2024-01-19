package com.mycompany.app;

import java.util.Arrays;

public class Elevator {
    private int quantity = 3;
    private int[] floors;
    private int maxFloor = 160;

    public void initialize(int quantity) {
        this.quantity = quantity;
        this.floors = new int[quantity];
        Arrays.fill(floors, 1);
    }

    public void setQuantity(int count) {
        quantity = count;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getFloor(int index) {
        return floors[index];
    }

    public void setFloor(int index, int floor) {
        floors[index] = floor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }
}
