package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();

        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                result.addLast(num);
            } else {
                result.addFirst(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        List<Integer> input = List.of(2, 14, 3, 6, 5, 7);
        LinkedList<Integer> output = creator.createLinkedList(input);
        System.out.println(output);
    }
}
