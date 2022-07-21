package com.example.demojunit.Class;

public class Caculator {
  public int multiply(int a, int b) {
    return a * b;
  }

  public static int findMax(int arr[]) {
    int max= arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  public int plus(int a, int b){
    if (a>999){
      throw new IllegalArgumentException("a must less than 999");
    }
    return a+b;
  }

}
