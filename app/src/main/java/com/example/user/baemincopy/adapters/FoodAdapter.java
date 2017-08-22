package com.example.user.baemincopy.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.user.baemincopy.R;
import com.example.user.baemincopy.datas.FoodData;

import java.util.List;

/**
 * Created by user on 2017-08-21.
 */

public class FoodAdapter extends ArrayAdapter<FoodData> {

    Context mContext;
    List<FoodData> mList;
    LayoutInflater inf;


    public FoodAdapter(Context context, List<FoodData> list) {
        super(context, R.layout.food_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.food_list_item, null);
        }

        return row;
    }

    @Override
    public int getCount() {
        return 20;
    }
}
