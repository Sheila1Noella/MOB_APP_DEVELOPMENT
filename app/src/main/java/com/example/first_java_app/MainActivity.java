package com.example.first_java_app;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.first_java_app.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button BTN1 = findViewById(R.id.Submits);

BTN1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent I = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(I);
    }
});
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url=editText.getText().toString();
//                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//
            }



}