package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Integer[] scores = new Integer[]{80, 66, 73, 92, 43};
    Stream<Integer> scoreStream= Arrays.stream(scores);

    List<String> shoppingList = new ArrayList<>();
    shoppingList.add("coffee");
    shoppingList.add("bread");
    shoppingList.add("pineapple");
    shoppingList.add("milk");
    shoppingList.add("pasta");
    Stream<String> shoppingListStream=shoppingList.stream();
    shoppingListStream.sorted().forEach((item)-> System.out.println(item));

    System.out.println(shoppingList.stream().map((item)->item.toUpperCase()).collect(Collectors.toList()));

    System.out.println(shoppingList.stream().map((item)->item.toUpperCase()).filter((item)->item.startsWith("P")).collect(Collectors.toList()));

  }
}
