package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(false);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addTakeaway();
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraCheese();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}