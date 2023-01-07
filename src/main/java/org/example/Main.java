package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

  private static Algorithms algorithms = new Algorithms();

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.print("Input data Numbers >");
    final String input = scanner.nextLine();
    final String[] inputArray = Pattern.compile(" ").split(input);
    final List numberList = Arrays.stream(inputArray).map(s -> Long.valueOf(s)).toList();
    System.out.print("Input target Number >");
    final Long targetNumber = scanner.nextLong();
    try {
      final int index = algorithms.linearSearch(numberList, targetNumber);
      System.out.println(String.format("Found %d at %d", targetNumber, index));
    } catch (Exception e) {
      System.out.println(e.getLocalizedMessage());
    }
  }
}
