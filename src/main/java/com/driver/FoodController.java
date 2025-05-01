package com.driver;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {


    private Menu menu=new Menu();

    private Order currentOrder=new Order();

    public FoodController() {

    }

    @GetMapping("/menu")
    public List<Food> getMenu() {
        return menu.getMenuItems();
    }

    @PostMapping("/order/{itemId}")
    public Order placeOrder(@PathVariable int itemId) {
        Boolean yes = false;
        if (menu.getMenuItemById(itemId)) {

            yes = true;
        }
        if (yes) {
            for (Food item : menu.getMenuItems()) {
                if (item.getId() == itemId) {

                    currentOrder.addItem(menu.getMenuItems().get(itemId));

                }
            }

        }
        return currentOrder;
    }

        @GetMapping("/order")
        public Order getCurrentOrder() {
        return currentOrder;
    }

        @GetMapping("/order/total")
        public double getTotalBill() {
        return currentOrder.getTotalBill();
    }
}
