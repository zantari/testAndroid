package org.example;


public class Main {
    static void main(String[] args) {
        Colors colors = new Colors();

        System.out.println(colors.favouriteColor("Joe Biden"));


        System.out.println(colors.allFavouriteColors());

        Boolean isChanged = colors.changeFavouriteColor("Joe Biden", "Green");

        if(isChanged){
            System.out.println("Changed");
        }
        else{
            System.out.println("We dont have this name");
        }



        colors.addNew();




    }
}
