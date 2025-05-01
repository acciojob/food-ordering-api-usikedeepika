package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private List<Food> items=null;

    public Order() {
    	// your code goes here
        items=new ArrayList<>();
    }

    public void addItem(Food food) {
      items.add(food);
    }

    public List<Food> getItems() {
    	  List<Food> ans=new ArrayList<>();
          for(Food food:items){
              ans.add(food);
          }


        return ans;
    }

    public double getTotalBill() {
        double totalBill = 0;
         for(int i=0;i<items.size();i++){
             totalBill+=items.get(i).getPrice();
         }
        return totalBill;
    }
}
