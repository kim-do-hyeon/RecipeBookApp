package com.example.recipebookapp;
public class ItemModel {
    String food_title;
    String food_time;
    int image;
    float rating;
    int servings;
    int kcal;

    public ItemModel(String food_title, String food_time, int image, float rating, int servings, int kcal) {
        this.food_title = food_title;
        this.food_time = food_time;
        this.image = image;
        this.rating = rating;
        this.servings = servings;
        this.kcal = kcal;
    }

    public String getFood_title() {
        return food_title;
    }

    public String getFood_time() {
        return food_time;
    }

    public int getImage() {
        return image;
    }

    public float getRating() {
        return rating;
    }

    public int getServings() {
        return servings;
    }

    public int getKcal() {
        return kcal;
    }
}
