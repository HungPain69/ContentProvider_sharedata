package com.example.contentproviderapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MyContentResolve myContentResolve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickAdd(View view){
        String title = ((EditText)findViewById(R.id.editText2)).getText().toString();
        String content = ((EditText)findViewById(R.id.editText3)).getText().toString();
//        myContentResolve.insertContact(title,content);
//        Toast.makeText(getBaseContext(),
//                "uri.toString()", Toast.LENGTH_LONG).show();

        Toast.makeText(getBaseContext(),
                AppConst.CONTENT_URI.toString(), Toast.LENGTH_LONG).show();
    }

}