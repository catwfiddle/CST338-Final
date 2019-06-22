//Xiaoran Sun
//CST 338


package com.example.cst338final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

   CheckBox Cookies, Soda, Candy, Juice, Cake,
           Fruits, Vegetables, Bread, Cereal, Pizza, Chips, iceCream;

   Button addButton;
   TextView textList, items;
   ImageView logo;

   //The ArrayList is used store each string object.
   // It is used for adding each string object's reference
   // and removing each string object's reference.
   ArrayList<String> groceries = new ArrayList<>();

   @Override

   //This method initializes the Checkboxes
   //the button, the logo image, and the TextView that
   //are in the activity_main.xml file.

   protected void onCreate(Bundle savedInstanceState) {


      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Log.d("Life Cycle: ", "in onCreate()");
      items = (TextView) findViewById(R.id.groceries);
      Cookies = (CheckBox) findViewById(R.id.cookies);
      Chips = (CheckBox) findViewById(R.id.chips);
      Soda = (CheckBox) findViewById(R.id.soda);
      Candy = (CheckBox) findViewById(R.id.candy);
      Juice = (CheckBox) findViewById(R.id.juice);
      Cake = (CheckBox) findViewById(R.id.cake);
      Fruits = (CheckBox) findViewById(R.id.fruits);
      Vegetables = (CheckBox) findViewById(R.id.vegetables);
      Bread = (CheckBox) findViewById(R.id.bread);
      Cereal = (CheckBox) findViewById(R.id.cereal);
      Pizza = (CheckBox) findViewById(R.id.pizza);
      iceCream = (CheckBox) findViewById(R.id.iceCream);
      addButton = (Button) findViewById(R.id.button);
      textList = (TextView) findViewById(R.id.groceryList);
      logo = (ImageView) findViewById(R.id.logo);


   }


   //This method is a listener method. This is method is
   //called in the activity_main.xml for the checkboxes,
   //button and the textView textList.
   //If the checkboxes are checked, and the button is checked,
   //then it adds the items to the groceries ArrayList and it is
   // displayed on the textList textView. If the button
   //is checked without any of the checkboxes being checked, then it will
   //remove the items that are in the groceries array list in the
   //that are displayed in the textList textView
   // and clear the textList textView.

   public void processClicks(View view) {

      int id = view.getId();

      if (id == R.id.button) {

         if (Cookies.isChecked()) {
            groceries.add("Cookies");
         } else {
            groceries.remove("Cookies");
         }

         if (Chips.isChecked()) {
            groceries.add("Chips");
         } else {
            groceries.remove("Chips");
         }

         if (Soda.isChecked()) {
            groceries.add("Soda");
         } else {
            groceries.remove("Soda");
         }

         if (Candy.isChecked()) {
            groceries.add("Candy");
         } else {
            groceries.remove("Candy");
         }

         if (Juice.isChecked()) {
            groceries.add("Juice");
         } else {
            groceries.remove("Juice");
         }

         if (Cake.isChecked()) {
            groceries.add("Cake");
         } else {
            groceries.remove("Cake");
         }

         if (Fruits.isChecked()) {
            groceries.add("Fruits");
         } else {
            groceries.remove("Fruits");
         }

         if (Vegetables.isChecked()) {
            groceries.add("Vegetables");
         } else {
            groceries.remove("Vegetables");
         }

         if (Bread.isChecked()) {
            groceries.add("Bread");
         } else {
            groceries.remove("Bread");
         }

         if (Cereal.isChecked()) {
            groceries.add("Cereal");
         } else {
            groceries.remove("Cereal");
         }

         if (Pizza.isChecked()) {
            groceries.add("Pizza");
         } else {
            groceries.remove("Pizza");
         }

         if (iceCream.isChecked()) {
            groceries.add("Ice cream");
         } else {
            groceries.remove("Ice cream");
         }

         //Clears the textList.
         textList.setText(null);
         textList.setVisibility(View.VISIBLE);

         // This adds each item from the groceries arrayList
         // to the textList.
         for (String item : groceries) {
            textList.append(item + " ");

         }

      }


   }


   @Override
   //Activity is finished with initialization.
   public void onStart() {
      super.onStart();
      Log.d("Life Cycle: ", "in onStart)");
   }

   @Override
   //Activity is on resume from another activity.
   public void onResume() {
      super.onResume();
      Log.d("Life Cycle: ", "in onResume)");

   }

   @Override
   //Another activity starts
   public void onPause() {
      super.onPause();
      Log.d("Life Cycle: ", "in onPause()");
   }

   @Override
   //The activity stops.
   protected void onStop() {
      super.onStop();
      Log.d("Life Cycle: ", "in onStop)");

   }

   @Override
   //The activity is closing.
   protected void onDestroy() {
      super.onDestroy();
      Log.d("Life Cycle: ", "in onDestroy)");
   }


}
