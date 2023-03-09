package com.example.mycontact;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends  BaseAdapter{
    private Activity activity;
    private LayoutInflater inflater;
    private ArrayList<Contact> data;

    public MyAdapter(Activity activity,ArrayList<Contact> data) {
        this.activity = activity;
        this.data = data;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View v = view;
        if(v == null){
           v = inflater.inflate(R.layout.item, null);
        }
        TextView txtId = v.findViewById(R.id.txtID);
        TextView txtName = v.findViewById(R.id.txtName);
        TextView txtPhone = v.findViewById(R.id.txtPhone);

        txtId.setText(String.valueOf(data.get(i).getId()));
        txtName.setText(data.get(i).getName());
        txtPhone.setText(data.get(i).getNumber());

        return v;
    }
}
