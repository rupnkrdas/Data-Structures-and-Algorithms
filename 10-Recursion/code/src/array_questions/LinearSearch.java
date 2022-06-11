package array_questions;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 9, 12 };
        int target = 4;

        System.out.println(search(arr, target, 0));

        System.out.println(findAllOccurences(arr, target, 0, new ArrayList<>()));

        System.out.println(findAllOccurences2(arr, target, 0));
    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return search(arr, target, index + 1);
        }
    }

    // approach 1
    // static ArrayList<Integer> list = new ArrayList<>();

    // static void findAllOccurences(int[] arr, int target, int index) {
    // if (index == arr.length) {
    // return;
    // }

    // if (arr[index] == target) {
    // list.add(index);
    // findAllOccurences(arr, target, index + 1);
    // } else {
    // findAllOccurences(arr, target, index + 1);
    // }
    // }

    static ArrayList<Integer> findAllOccurences(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllOccurences(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllOccurences2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        list.addAll(findAllOccurences2(arr, target, index + 1));
        return list;
    }

}
