package com.example.listviewcustom;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.example.listviewcustom.Animal;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AnimalAdapter extends ArrayAdapter<Animal> {
    private Context ct;
    private ArrayList<Animal> arr;

    public AnimalAdapter(@NonNull Context context, int resource, @NonNull List<Animal> objects) {
        super(context, resource, objects);
        this.ct = context;
        this.arr = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater i = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = i.inflate(R.layout.awnitem_dish, null);
        }


        if (arr.size() > 0) {
            Animal d = arr.get(position);
            ImageView imganml = convertView.findViewById(R.id.imganml);
            TextView txtNameAnml = convertView.findViewById(R.id.txtNameAnml);
            TextView txtDesk = convertView.findViewById(R.id.txtDesk);

            imganml.setImageResource(d.image);
            txtNameAnml.setText(d.animalName);
            txtDesk.setText(d.numitem);

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Animal clickedAnimal = arr.get(position);

                    String animalName = clickedAnimal.getName();

                    if (animalName.equalsIgnoreCase("Kucing")) {
                        Intent intent = new Intent(ct, kucing.class);
                        ct.startActivity(intent);
                    } else if (animalName.equalsIgnoreCase("Singa")) {
                        Intent intent = new Intent(ct, singa.class);
                        ct.startActivity(intent);
                    } else if (animalName.equalsIgnoreCase("Anjing")) {
                        Intent intent = new Intent(ct, anjing.class);
                        ct.startActivity(intent);
                    } else if (animalName.equalsIgnoreCase("Gajah")) {
                        Intent intent = new Intent(ct, gajah.class);
                        ct.startActivity(intent);
                    } else if (animalName.equalsIgnoreCase("Kelinci")) {
                        Intent intent = new Intent(ct, kelinci.class);
                        ct.startActivity(intent);
                    } else if (animalName.equalsIgnoreCase("Kuda")) {
                        Intent intent = new Intent(ct, kuda.class);
                        ct.startActivity(intent);
                    } else if (animalName.equalsIgnoreCase("Otter")) {
                        Intent intent = new Intent(ct, otter.class);
                        ct.startActivity(intent);
                    } else if (animalName.equalsIgnoreCase("Panda")) {
                        Intent intent = new Intent(ct, panda.class);
                        ct.startActivity(intent);
                    } else if (animalName.equalsIgnoreCase("Paus")) {
                        Intent intent = new Intent(ct, paus.class);
                        ct.startActivity(intent);
                    }
                }

            });

        }
        return convertView;
    }
}
