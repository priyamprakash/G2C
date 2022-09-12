package com.priyam.gtoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Check_List extends AppCompatActivity {

    RecyclerView recycler;
    private DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        recycler= findViewById(R.id.recycler);
        reference = FirebaseDatabase.getInstance().getReference();





    }
}