package com.example.workingwithlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {
    /*HashMap makes absolutely no guarantees about the iteration order. It can (and will) even change completely when new elements are added.
TreeMap will iterate according to the "natural ordering" of the keys according to their compareTo() method (or an externally supplied Comparator). Additionally, it implements the SortedMap interface, which contains methods that depend on this sort order.
LinkedHashMap will iterate in the order in which the entries were put into the map*/

    ArrayList<SortedMap<String,String>> mylist;
    ArrayList<HashMap<String,String>> list;
    SortedMap<String, String> person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick(View view)
    {
           /*
        Android ListView is a view which groups several items and display them in vertical scrollable list. The list items are automatically inserted to the list using an Adapter that pulls content from a source such as an array or database. It’s one of the basic and most used UI components of android. The most common usages include displaying data in the form of a vertical scrolling list.
        (Name "ali",Gender "Male",Age "24",Status "Unmarried")
        (Name "Ali", Gender "male", Age "21", Status, "Married")
        (Name "Shazia", Gender "Female", Age "24", status,"married")
                 */
        // HashMap<String,String> hash=new HashMap<String,String>();
        // hash.put("Name","Hassan");
        mylist = new ArrayList<SortedMap<String, String>>();

        person = new TreeMap<String, String>();
        person.put("name", "ali");
        person.put("age", "45");
        person.put("Gender","Male");
        person.put("status","married");
        mylist.add(person);
        // name ali
        //age 45
        //gener male
        //status married

        person = new TreeMap<String, String>();
        person.put("name", "shah");
        person.put("age", "47");
        person.put("Gender","Male");
        person.put("status","married");
        mylist.add(person);

        person = new TreeMap<String, String>();
        person.put("name", "javed");
        person.put("age", "17");
        person.put("Gender","Male");
        person.put("status","unmarried");
        mylist.add(person);

        person = new TreeMap<String, String>();
        person.put("name", "noman");
        person.put("age", "27");
        person.put("Gender","Male");
        person.put("status","married");
        mylist.add(person);

        ListViewAdapter adapter = new ListViewAdapter(this, mylist);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
/*
HashMap
•	It has pair values(keys,values)
•	NO duplication key values
•	unordered unsorted
•	it allows one null key and more than one null values
HashTable
•	same as hash map
•	it does not allows null keys and null values
LinkedHashMap
•	It is ordered version of map implementation
•	Based on linked list and hashing data structures
TreeMap
•	Ordered and sortered version
•	based on hashing data structures

 */
