package com.example.tp2ex3iconimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.intellij.lang.annotations.Language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//utilisé classAdapter et ArrayList

        ListView listView = findViewById(R.id.histoir);
        ArrayList<Langage> langages = new ArrayList<>();

        langages.add(new Langage("Java","1978",R.drawable.java));
        langages.add((new Langage("Kotlin","1867",R.drawable.kotlin)));
        langages.add(new Langage("JavaScript","1943",R.drawable.javascript));
        langages.add(new Langage("Swift","1965",R.drawable.swift));
        langages.add(new Langage("Python","1892",R.drawable.python));

        ClasseAdapter adapter = new ClasseAdapter(langages,this);
        listView.setAdapter(adapter);


//SimpleAdapter

//        ListView listView = findViewById(R.id.histoir);
//        List<Map<String,String>> dataList = new ArrayList<>();
//        HashMap<String,String >  dataJava = new HashMap<>();
//        dataJava.put("langage","Java");
//        dataJava.put("desc","langage de programmetion");
//        dataJava.put("img", String.valueOf(R.drawable.java));
//        dataList.add(dataJava);
//
//        HashMap<String,String >  dataKotlin = new HashMap<>();
//        dataKotlin.put("langage","Kotlin");
//        dataKotlin.put("desc","developper Apps Android");
//        dataKotlin.put("img",String.valueOf(R.drawable.kotlin));
//        dataList.add(dataKotlin);
//
//        HashMap<String,String >  dataSwift = new HashMap<>();
//        dataSwift.put("langage","Swift");
//        dataSwift.put("desc","developper Apps IOS");
//        dataSwift.put("img",String.valueOf(R.drawable.swift));
//        dataList.add(dataSwift);
//
//        HashMap<String,String >  dataJs = new HashMap<>();
//        dataJs.put("langage","JavaScript");
//        dataJs.put("desc","validation des sites web");
//        dataJs.put("img",String.valueOf(R.drawable.javascript));
//        dataList.add(dataJs);
//
//        HashMap<String,String >  dataPython = new HashMap<>();
//        dataPython.put("langage","Python");
//        dataPython.put("desc","developper des games");
//        dataPython.put("img",String.valueOf(R.drawable.python));
//        dataList.add(dataPython);
//
//        HashMap<String,String >  dataGithub = new HashMap<>();
//        dataGithub.put("langage","Github");
//        dataGithub.put("desc","Repo des projets");
//        dataGithub.put("img",String.valueOf(R.drawable.github));
//        dataList.add(dataGithub);
//
//        String [] from = {"img","langage","desc"};
//        int[] information = {R.id.img1,R.id.textView1,R.id.textView2};
//
//        SimpleAdapter adapter = new SimpleAdapter(this,dataList,R.layout.ressource,from,information);
//        listView.setAdapter(adapter);
//


        //utilisé classAdapter et HashMap dans ArrayList
//        ListView langage = findViewById(R.id.histoir);
//        HashMap<String,String> donees = new HashMap<>();
//        ArrayList<HashMap<String,String>> list = new ArrayList<>();
//        donees.put("img",String.valueOf(R.drawable.java));
//        donees.put("langage","java");
//        donees.put("desc","programmation");
//        list.add(donees);
//        donees = new HashMap<>();
//        donees.put("img",String.valueOf(R.drawable.python));
//        donees.put("langage","python");
//        donees.put("desc","dev gemes");
//        list.add(donees);
//        ClasseAdapter adapter = new ClasseAdapter(list,this);
//        langage.setAdapter(adapter);

    }
}