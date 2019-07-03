package com.example.alumno.myapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumno.myapplication.R;
import com.example.alumno.myapplication.models.User;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtPassword;
    EditText txtUsuario;

    ArrayList<User> ListaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        User user1=new User();
        user1.setUsername("bichito");
        user1.setPassword("123456");

        User user2=new User();
        user2.setUsername("bichito");
        user2.setPassword("123456");

        ListaUsuarios.add(user1);
        ListaUsuarios.add(user2);

        btnLogin=(Button)findViewById(R.id.btnStart);

        //capturar cajitas text
        txtUsuario=(EditText)findViewById(R.id.txtUsuario);
        txtPassword=(EditText)findViewById(R.id.txtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui valido usuario y contraseña
                User userCurrent = User.findUserByUsername(ListaUsuarios, txtUsuario.getText().toString());
                if (userCurrent.isValid(txtPassword.getText().toString())){
                    Toast.makeText(LoginActivity.this, "Usuario y contraseña correcta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
