package com.example.tp6_android_exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText id, name, qt;
    TextView texte;
    Button add,show,delete;
    ProductDAO DAO;
    DataBaseHandler DatabaseHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DAO=new ProductDAO(this);


        id=findViewById(R.id.id);
       name =findViewById(R.id.name);
       qt=findViewById(R.id.qt);
       texte=findViewById(R.id.texte);
       add=findViewById(R.id.add);
       show=findViewById(R.id.show);
       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Product p=new Product();
               p.setId(Integer.parseInt(id.getText().toString()));
               p.setName(name.getText().toString());
               p.setQuantity(Integer.parseInt(qt.getText().toString()));
               DAO.insertdata(p);
           }
       });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cursor c = DAO.showdata();
                
                if (c.getCount() == 0) {
                    //empty
                } else {
                    while (c.moveToNext()) {
                         c.getInt(0) ;
                    }
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DAO.showdata();
            }
        });


        /*
         Cursor c=db.rawQuery("SELECT * FROM product",null);
       // db.rawQuery("SELECT * FROM product where id=?", new String[] { i + "" });
//We can test the
       if( c.getCount()==0){
    while (c.moveToNext()) {
        c.getInt(0);
        c.getString(1) ;
        c.getInt(2);    }

        if( c.getCount()==0 ){
            //empty
        }
        else{
            while (c.moveToNext()) {
                //get data c.getInt(0) …
                }}

         */



        }}

