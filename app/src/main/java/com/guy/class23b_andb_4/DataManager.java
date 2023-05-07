package com.guy.class23b_andb_4;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Property> generateProperties() {
        ArrayList<Property> properties = new ArrayList<>();


        properties.add(new Second()
                .setStatus("Good")
                .setYear(1990)
                .setDesc("4 rooms apartment")
                .setLocation("Mivtza Kadesh 38")
                .setImage("https://upload.wikimedia.org/wikipedia/commons/e/e4/PAJASA_Service_Apartment_Mumbai.jpg")
                .setPrice(2000000)
        );

        properties.add(new Second()
                .setStatus("Good")
                .setYear(1999)
                .setDesc("3 rooms apartment")
                .setLocation("Mivtza Kadesh 50")
                .setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Laundry_Room.jpg/800px-Laundry_Room.jpg")
                .setPrice(2000000)
        );

        properties.add(new Fresh()
                        .setContractor("Kata Group")
                        .setLogo("https://katagroup.co.il/wp-content/uploads/2022/10/l-2-kata.png")
                        .setExtra("No %")
                .setDesc("5 rooms apartment")
                .setLocation("Hayarkon 234")
                .setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/One-by-five_Apartments_Austin%2C_TX.jpg/800px-One-by-five_Apartments_Austin%2C_TX.jpg")
                .setPrice(4000000)
        );

        return properties;
    }
}
