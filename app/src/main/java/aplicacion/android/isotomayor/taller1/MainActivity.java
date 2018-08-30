package aplicacion.android.isotomayor.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chb;
    private Switch swt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Hola Como esta?",Toast.LENGTH_LONG).show();


        chb = (CheckBox) findViewById(R.id.CheckBoxs);
        chb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "CheckBox", Toast.LENGTH_SHORT).show();

            }
        });

        swt = (Switch) findViewById(R.id.switchs);
        swt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Switch", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void miMetodo(View v) {
        //int a = 4 ;
        Toast.makeText(MainActivity.this, "Click en el boton", Toast.LENGTH_SHORT).show();
    }


    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Boton presionado", Toast.LENGTH_SHORT).show();
    }


    //@Override

}