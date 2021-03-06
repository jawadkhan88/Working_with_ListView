package com.example.workingwithlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.SortedMap;

public class ListViewAdapter  extends BaseAdapter {
    /*
  An adapter actually bridges between UI components and the data source that fill data into UI Component. Adapter holds the data and send the data to adapter view, the view can take the data from adapter view and shows the data on different views like as spinner, list view, grid view etc. The adapter pulls the items out of a data source, an array for example, and then converts each item into a view which it then inserts into the ListView.

The ListView and GridView are subclasses of AdapterView and they can be populated by binding them to an Adapter, which retrieves data from an external source and creates a View that represents each data entry. The common adapters are ArrayAdapter, BaseAdapter, CursorAdapter, SimpleCursorAdapter, SpinnerAdapter and WrapperListAdapter.
   */
    Activity activity;
    ArrayList<SortedMap<String, String>> list;
    TextView name, gender, age, status;

    public ListViewAdapter(Activity activity, ArrayList<SortedMap<String, String>> list)
    {
        super();

        this.activity = activity;
        this.list = list;
    }
    @Override
    public int getCount()
    {
        return list.size();
    }

    @Override
    public Object getItem(int i)
    {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater = activity.getLayoutInflater();

        if(view == null)
        {
            view = inflater.inflate(R.layout.column_row, null);

            name = ((TextView)view.findViewById(R.id.textViewName));
            age = ((TextView)view.findViewById(R.id.textViewAge));
            gender=((TextView)view.findViewById(R.id.textViewGender));
            status = ((TextView)view.findViewById(R.id.textViewStatus));

        }
        SortedMap<String, String> map = list.get(i);

        name.setText( map.get("name"));
        age.setText(map.get("age"));
        gender.setText(map.get("Gender"));
        status.setText(map.get("status"));

        return view;
    }
}
