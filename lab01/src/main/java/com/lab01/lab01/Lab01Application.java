package com.lab01.lab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@SpringBootApplication
public class Lab01Application {
    public static ArrayList<BunMenu> CART = new ArrayList<BunMenu>();

    public static void main(String[] args) {
        SpringApplication.run(Lab01Application.class, args);
    }
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/shop")
    BunMenu[] viewBunMenuList(){
        return BunFactory.getBunMenusList();
    }

    @RequestMapping("/shop/{id}")
    BunMenu viewBunMenu(@PathVariable int id){
        return BunFactory.getBunMenu(id);
    }
    @RequestMapping("/shop/{id}/addOrder")
    String addToCart(@PathVariable int id) {
        CART.add(BunFactory.getBunMenu(id));
        return String.format("\"%s\" add complete", BunFactory.getBunMenu(id).getName());
    }
    @RequestMapping("/cart")
    String viewCart() {
        double total = CART.stream().mapToDouble(BunMenu::getPrice).sum();
        StringBuilder toString = new StringBuilder(String.format("Total number of items in cart is %d (", CART.size()));
        for (BunMenu menu : CART) {
            toString.append(String.format("\"%s\", ", menu.getName()));
        }
        toString.append(String.format(") Total: %.2f", total));
        return toString.toString();
    }

    @RequestMapping("/checkout")
    String checkout() {
        double total = CART.stream().mapToDouble(BunMenu::getPrice).sum();
        CART.clear();
        return "Order has been received. Total price is " + total;
    }
}
