package co.com.pilae.eventonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniComponent();
        onClickBtnLegacy();
    }

    private void onClickBtnLegacy() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String  nombre = txtNombre.getText().toString();
                Toast.makeText(getApplicationContext(),nombre,Toast.LENGTH_SHORT).show();
                txtNombre.setText("");
            }
        });
    }

    private void iniComponent() {
        txtNombre = findViewById(R.id.txtNombre);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
    }
}
