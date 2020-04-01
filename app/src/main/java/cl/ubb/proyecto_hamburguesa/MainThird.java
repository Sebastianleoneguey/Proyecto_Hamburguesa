package cl.ubb.proyecto_hamburguesa;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainThird extends AppCompatActivity implements View.OnClickListener{
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_third);
        button1= findViewById(R.id.nosotrosMenu);

        button1.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nosotrosMenu:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                break;
        }
    }

}
