package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private List<Autor> ListAutor= new ArrayList<Autor>();
    ArrayAdapter<Autor> arrayAdapterAutor;
    EditText eTnombre,Testado;
    Button bTAceptar;
    ListView lvautores;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        eTnombre=findViewById(R.id.eTnombre);
        Testado=findViewById(R.id.Testado);
        bTAceptar=findViewById(R.id.bTAceptar);
        lvautores=findViewById(R.id.lvautores);

        inicializarFirebase();
        ListarDatos();


        bTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Autor autor=new Autor();
                autor.setAutor(UUID.randomUUID().toString());
                autor.setNombre(eTnombre.getText().toString());
                autor.setEstado(Testado.getText().toString());
                databaseReference.child("Autor").child(autor.getAutor()).setValue(autor);

            }
        });
    }



    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();
    }

    private void ListarDatos() {
    }
}