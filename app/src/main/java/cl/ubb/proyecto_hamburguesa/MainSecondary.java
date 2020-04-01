package cl.ubb.proyecto_hamburguesa;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainSecondary extends AppCompatActivity implements View.OnClickListener {
    Button button1, boton1, boton2, boton3, boton4, boton5, boton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_secondary);
        button1= findViewById(R.id.nosotrosMenu);
        boton1= findViewById(R.id.hamburguesa1);
        boton2= findViewById(R.id.hamburguesa2);
        boton3= findViewById(R.id.hamburguesa3);
        boton4= findViewById(R.id.hamburguesa4);
        boton5= findViewById(R.id.hamburguesa5);
        boton6= findViewById(R.id.hamburguesa6);

        button1.setOnClickListener(this);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nosotrosMenu:
                startActivity(new Intent(getApplicationContext(), MainQuarter.class));
                break;
            case R.id.hamburguesa1:
                startActivity(new Intent(getApplicationContext(), MainQuarter.class));
                break;
            case R.id.hamburguesa2:
                startActivity(new Intent(getApplicationContext(), MainQuarter.class));
                break;
            case R.id.hamburguesa3:
                startActivity(new Intent(getApplicationContext(), MainQuarter.class));
                break;
            case R.id.hamburguesa4:
                startActivity(new Intent(getApplicationContext(), MainQuarter.class));
                break;
            case R.id.hamburguesa5:
                startActivity(new Intent(getApplicationContext(), MainQuarter.class));
                break;
            case R.id.hamburguesa6:
                startActivity(new Intent(getApplicationContext(), MainQuarter.class));
                break;
        }
    }

}
