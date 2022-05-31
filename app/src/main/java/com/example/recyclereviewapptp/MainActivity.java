package com.example.recyclereviewapptp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewEtudiant;
    private RecyclerView.LayoutManager layoutManager;
    private EtudiantAdapter etudiantAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewEtudiant = findViewById(R.id.my_recycler_view);

        ArrayList <Etudiant> listEtudiant = EtudiantContent.getEtudiants();
        etudiantAdapter = new EtudiantAdapter(this,listEtudiant);
        recyclerViewEtudiant.setAdapter(etudiantAdapter);


        layoutManager = new LinearLayoutManager(this);
        recyclerViewEtudiant.setLayoutManager(layoutManager);



        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerViewEtudiant.getContext(), DividerItemDecoration.VERTICAL);
        recyclerViewEtudiant.addItemDecoration(dividerItemDecoration);
    }


}