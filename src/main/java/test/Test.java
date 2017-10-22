package test;

import java.util.ArrayList;

import lombok.val;

public class Test {
  public static void main(String[] args) {
    Shop shop = new Shop("name", "address");
    val address = shop.getAddress();
    val name = shop.getName();
    System.out.println(shop);
    val names = new ArrayList<String>();
  }
}
