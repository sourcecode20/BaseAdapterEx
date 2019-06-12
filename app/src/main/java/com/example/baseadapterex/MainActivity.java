package com.example.baseadapterex;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.baseadapterex.adapter.ListViewEx;
import com.example.baseadapterex.model.SingleRow;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list;
    List<SingleRow> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();

        Resources resources = getResources();
        String[] title = resources.getStringArray(R.array.Title);
        String[] description = resources.getStringArray(R.array.description);

        int[] images = {R.drawable.boy1, R.drawable.boy2, R.drawable.boy3, R.drawable.boy4, R.drawable.boy5, R.drawable.boy6,
                R.drawable.girl1, R.drawable.girl2, R.drawable.girl3, R.drawable.girl4, R.drawable.girl5, R.drawable.girl6};
        for (int i = 0; i < 10; i++) {
            data.add(new SingleRow(title[i], description[i], images[i]));
        }


        list = (ListView) findViewById(R.id.listView);
        list.setAdapter(new ListViewEx(this,data));
    }
}



