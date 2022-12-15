package prakt32;


import prakt30.DrinkTypeEnum;

import java.io.*;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {

        String filename = "time.ser";
        TableOrdersManager tableOrdersManager = new TableOrdersManager(32);
        Order order = new TableOrder();
        order.add(new Dish("Shaurma", "Cheese", 200));
        order.add(new Dish("HotDog", "Beef", 150));
        tableOrdersManager.add(order,1);

        Order order2 = new TableOrder();
        order2.add(new Dish("Hamburger", "Chicken", 300));
        tableOrdersManager.add(order2,2);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(tableOrdersManager);
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        tableOrdersManager = null;

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            tableOrdersManager = (TableOrdersManager)in.readObject();
            in.close();
        } catch(IOException ex){
            ex.printStackTrace();
        } catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
        for(Order order1: tableOrdersManager.getOrders()){
            if (order1 != null){

                Arrays.stream(order1.getMenu()).toList().forEach((obj) -> System.out.println(obj));
            }
        }
        System.out.println("Manager: " + Arrays.toString(tableOrdersManager.getOrders()));
    }
}
