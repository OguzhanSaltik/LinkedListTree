package com.linkedListTree;

import java.util.Random;
import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Creating object of Tree
        Tree sampleTree = new Tree();
        System.out.println("Tree Test\n");

        char ch;

        // Perform tree operations
        do {
            System.out.println("\nTree Operations\n");
            System.out.println("1. Manuel Insert");
            System.out.println("2. Automatic Insert");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    sampleTree.insert(scan.nextInt());
                    print(sampleTree);
                    break;

                case 2:
                    randomizeInsert(scan, sampleTree);
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.println("\nDo you want to continue (Type y or n): \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }

    /**
     * Inserts given size of random data to the tree.
     *
     * @param scan Scanner for user interaction.
     * @param avlt Tree to be inserted.
     */
    private static void randomizeInsert(Scanner scan, Tree avlt) {
        // How many data will inserted to the tree
        System.out.println("How many data will inserted: ");
        int size = scan.nextInt();

        // insert the size of random integers from 0-99 in tree
        for (int i = 1; i <= size; i++) {
            int value = new Random().nextInt(100);
            avlt.insert(value);
            print(avlt);
        }
    }

    /**
     * Displays tree with various orders
     *
     * @param avlt Given tree object.
     */
    private static void print(Tree avlt) {
        System.out.print("\n\nInsert order : ");
        avlt.insertOrder();

        System.out.print("\nSorted order :  ");
        avlt.sortedOrder();
    }
}