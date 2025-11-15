package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Colors {
    private Map<String, String> favouriteColors = new HashMap<>();

    public Colors() {
        favouriteColors.put("John", "Pink");
        favouriteColors.put("Elon Musk", "Blue");
        favouriteColors.put("Joe Biden", "Gray");
    }

    public Boolean changeFavouriteColor(String name, String color){
        if(!favouriteColors.containsKey(name)){
            return false;
        }
        favouriteColors.put(name, color);
        return true;

    }


    public void addNew(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a favourite color: ");
        String color = scanner.nextLine();
        if(favouriteColors.containsKey(name)){
            System.out.println("changed the favourite color for "+name+", "+name+"'s favourite color now is " + color );
        }
        else{
            System.out.println("Added " + name + ", your favourite color is " + color);
        }
        favouriteColors.put(name, color);


        scanner.close();
    }


    public String allFavouriteColors() {
        StringBuilder sb = new StringBuilder();
        favouriteColors.forEach((name, color) -> {
            sb.append(name);
            sb.append("'s favourite color is ");
            sb.append(color);
            sb.append('\n');
        });

        return sb.toString().trim();
    }

    public String favouriteColor(String name){
        return favouriteColors.getOrDefault(name, "sorry we dont have this name in our database");
    }

}
