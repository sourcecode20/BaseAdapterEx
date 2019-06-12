package com.example.baseadapterex.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baseadapterex.R;
import com.example.baseadapterex.model.SingleRow;


import java.util.List;

public class ListViewEx extends BaseAdapter {
    List<SingleRow> list;
    Context context;

    public ListViewEx(Context context1, List<SingleRow> list) {
        context = context1;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row, viewGroup, false);
        TextView title =(TextView) row.findViewById(R.id.title);
        TextView description =(TextView) row.findViewById(R.id.description);
        ImageView image= (ImageView)row.findViewById(R.id.image);

        SingleRow temp = list.get(i);

        title.setText(temp.titles);
        description.setText(temp.descriptions);
        image.setImageResource(temp.images);


        return row;
    }
}


