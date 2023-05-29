package com.example.recipebookapp;


import com.google.gson.annotations.SerializedName;

public class Login_Model {
    @SerializedName("type")
    private String type;

    public String getType() {
        return type;
    }
}