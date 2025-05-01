package com.driver;

import java.util.List;
import java.util.Optional;

public class Menu {

    private List<Food> menuItems=null;

    public Menu() {
    	menuItems=List.of(new Food(1,"Egg rice",345.76),new Food(2,"vada",548.9)
        ,new Food(3,"Curd rice",67.90)) ;
    }

    public void addMenuItem(Food food) {
    	menuItems.add(food);
    }

    public List<Food> getMenuItems() {
        return menuItems;
    }

    public boolean getMenuItemById(int id) {

         boolean yes=false;

         for(Food f:getMenuItems()){
             if(f.getId()==id){
                 return  true;
             }
         }

         return  false;

    }
}