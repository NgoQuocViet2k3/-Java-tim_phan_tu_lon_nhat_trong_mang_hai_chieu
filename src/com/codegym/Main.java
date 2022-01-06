package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("Nhập phần tử ở hàng %d, cột %d: ", row, col);
                arr[row][col] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận: ");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("%d  ", arr[row][col]);
            }
            System.out.println();
        }

        int rowIndex = 0;
        int colIndex = 0;
        int max = arr[rowIndex][colIndex];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (max < arr[row][col]) {
                    rowIndex = row;
                    colIndex = col;
                    max = arr[rowIndex][colIndex];
                }
            }
        }
        System.out.printf("Giá trị lớn nhất là %d, nằm ở hàng %d, cột %d.\n", max, rowIndex, colIndex);
    }
}

