package com.example.listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
ListView lsvAnm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsvAnm= findViewById(R.id.lsvAnm);
        ArrayList<Animal> arr= new ArrayList<>();

        Random r= new Random();

        arr.add(new Animal(R.drawable.kelinci,"Hewan pemilik telinga panjang yang khas.","Kelinci"));
        arr.add(new Animal(R.drawable.kucing,"Hewan yang bersikap independen dan lincah.","Kucing"));
        arr.add(new Animal(R.drawable.anjing,"Hewan yang setia dan cerdas.","Anjing"));
        arr.add(new Animal(R.drawable.singa,"Ia sang Raja Hutan!","Singa"));
        arr.add(new Animal(R.drawable.panda,"Hewan yang berwarna hitam dan putih.","Panda"));
        arr.add(new Animal(R.drawable.paus,"Ikan yang sangat besar.","Paus"));
        arr.add(new Animal(R.drawable.berangberang,"Hewan yang suka mencari makan di air.","Otter"));
        arr.add(new Animal(R.drawable.kuda,"Ia adalah hewan yang kuat!","Kuda"));
        arr.add(new Animal(R.drawable.gajah,"Hewan besar dan bertelinga lebar.","Gajah"));

        AnimalAdapter adapter = new AnimalAdapter(this,0,arr);
        lsvAnm.setAdapter(adapter);
    }

}

