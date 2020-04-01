package cl.ubb.proyecto_hamburguesa;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button1= findViewById(R.id.menuNosotros);
         button2=findViewById(R.id.menuHamburguesas);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menuNosotros:
                startActivity(new Intent(getApplicationContext(), MainThird.class));
                break;
            case R.id.menuHamburguesas:
                startActivity(new Intent(getApplicationContext(), MainSecondary.class));
                break;
        }
    }


    }

