package OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantDemoApp {
    ArrayList<User> userList = new ArrayList<>();
    ArrayList<Food> foodList = new ArrayList<>();
    Map<String,ArrayList<Food>>  menu = new HashMap<>();
    public RestaurantDemoApp(){
        User user1 = new User("user1","s3cr3t");
        User user2 = new User("user2","s3cr3t");
        User user3 = new User("user3","s3cr3t");
        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);
        Food appetizer1 = new Food("appetizer","APPETIZER","ing1,ing2,ing3,",10);
        Food appetizer2 = new Food("appetizer","APPETIZER","ing1,ing2,ing3,",11);
        Food appetizer3 = new Food("appetizer","APPETIZER","ing1,ing2,ing3,",12);

        ArrayList<Food> appetizerList = new ArrayList<>();
        appetizerList.add(appetizer1);
        appetizerList.add(appetizer2);
        appetizerList.add(appetizer3);

        Food mainDish1 = new Food("mainDish1","MDISH","ing1,ing2,ing3,",20);
        Food mainDish2 = new Food("mainDish2","MDISH","ing1,ing2,ing3,",21);
        Food mainDish3 = new Food("mainDish3","MDISH","ing1,ing2,ing3,",22);

        ArrayList<Food> mainDishList = new ArrayList<>();
        mainDishList.add(mainDish1);
        mainDishList.add(mainDish2);
        mainDishList.add(mainDish3);

        Food drink1 = new Food("drink1","DRINK","ing1,ing2,ing3,",5);
        Food drink2 = new Food("drink2","DRINK","ing1,ing2,ing3,",6);
        Food drink3 = new Food("drink3","DRINK","ing1,ing2,ing3,",7);

        ArrayList<Food> drinkList = new ArrayList<>();
        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);

        menu.put("Appetizer",appetizerList);
        menu.put("Main dishes",mainDishList);
        menu.put("drinks",drinkList);
    }
    public static void main(String[] args) {
        RestaurantDemoApp restaurantDemoApp = new RestaurantDemoApp();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter username and password:");
        String username = input.next();
        String password = input.next();

        boolean loggedIn = restaurantDemoApp.login(username,password);
       if (loggedIn){
           int userControl = input.nextInt();
           while (userControl !=-1){
               System.out.println("we are in while loop");
           }
       }
       else{
           System.out.println("invalid password or username!");
       }

        System.out.println(restaurantDemoApp.userList);

        for (User u: restaurantDemoApp.userList) {
            System.out.println(u.getUsername());
        }
    }
    public static  void printControl(){
        System.out.println("Enter (-1) to exit, and \n1.Appetizer\n2.Main dish\n3.Drinks");
    }

    public boolean login(String username,String password){
        boolean isLoginSuccessful = false;
       User user = new User(username,password);
       for(User u: this.userList){
        if (u.getUsername().equals(username) && u.getPassword().equals(password)){
            isLoginSuccessful = true;
        }}
        return isLoginSuccessful;
    }

    //key = all --> return all foods
    //key = appetizer --> return only appetizers
    //key = drinks --> return only drinks
    //key = mdish --> return only mdishes

    public ArrayList<Food> getMeMenu(String key){
        ArrayList<Food> foods = new ArrayList<>();
        switch (key){
            case "all":
                for (ArrayList<Food> foods1: menu.values()){
                    foods.addAll(foods1);
                }
                break;
            case "appetizer":
                foods.addAll(menu.get("Appetizer"));
                break;
            case "drinks":
                foods.addAll(menu.get("drinks"));
                break;
            case "mdish":
                foods.addAll(menu.get("Main Dishes"));
        break;
        }
        return foods;
    }
}
