package com.example.tp2ex3iconimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClasseAdapter extends BaseAdapter {
    ArrayList<Langage> data;
    Context context;
    public ClasseAdapter(ArrayList<Langage> data , Context context){
        this.data =data;
        this.context=context;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
//            convertView = LayoutInflater.from(context)
//                    .inflate(R.layout.activity_main, null);
//            TextView langueNom= convertView.findViewById(R.id.textView1);
//            TextView langueAnne = convertView.findViewById(R.id.textView2);
//            ImageView img01 = convertView.findViewById(R.id.img1);
//            HashMap<String,String> hm = (HashMap<String, String>) data.get(position);
//            img01.setImageResource(Integer.valueOf(hm.get("img")));
//            langueNom.setText(hm.get("langage"));
//            langueAnne.setText(hm.get("desc"));
//        }
//        return convertView;

        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.ressource,null);

            ImageView img = convertView.findViewById(R.id.img1);
            TextView text1 = convertView.findViewById(R.id.textView1);
            TextView text2 = convertView.findViewById(R.id.textView2);
            Langage ps = (Langage)  data.get(position);
            img.setImageResource(data.get(position).getImage());
            text1.append(ps.getName());
            text2.append(ps.getCode());
        }
        return convertView;
    }
}
