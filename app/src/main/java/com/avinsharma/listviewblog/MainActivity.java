package com.avinsharma.listviewblog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize the ListView
        ListView numbersListView = (ListView) findViewById(R.id.numbers_list_view);

        //Create a new ArrayList of Number type
        //and add 10 new objects to it (numbers english and spanish)
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(new Number("one","uno"));
        list.add(new Number("two","dos"));
        list.add(new Number("three","tres"));
        list.add(new Number("four","cuatro"));
        list.add(new Number("five","cinco"));
        list.add(new Number("six","sies"));
        list.add(new Number("seven","ocho"));
        list.add(new Number("eight","ocho"));
        list.add(new Number("nine","nueve"));
        list.add(new Number("ten","diez"));

        //Create a new NumberAdapter and initialize it with
        // our previously created ArrayList
        NumberAdapter adapter = new NumberAdapter(this, list);

        //set the adapter
        numbersListView.setAdapter(adapter);

        //we are done
    }
}
