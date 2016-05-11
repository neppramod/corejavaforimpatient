package ch01.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 13.	Write	a	program	that	prints	a	lottery	combination,	picking	six	distinct	numbers
 * between	1	and	49.	To	pick	six	distinct	numbers,	start	with	an	array	list	filled	with	1
 * ...	49.	Pick	a	random	index	and	remove	the	element.	Repeat	six	times.	Print	the
 * result	in	sorted	order.
 */

public class Solution {
    public static void main(String[] args) {
        lotteryCombination();
    }

    public static void lotteryCombination() {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i <= 49; i++) {
            integerList.add(i);
        }

        List<Integer> pickedList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int pickedIndex = r.nextInt(integerList.size());
            pickedList.add(integerList.get(pickedIndex));
            integerList.remove(pickedIndex);
        }

        Collections.sort(pickedList);
        for (int picked : pickedList) {
            System.out.print(picked + " ");
        }
        System.out.println();
    }
}
