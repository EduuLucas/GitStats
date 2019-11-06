package com.ifpb.gitstats.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ifpb.gitstats.R;
import com.ifpb.gitstats.control.GetJsonUser;
import com.ifpb.gitstats.model.User;

public class PutUser extends AppCompatActivity {

    private EditText user;
    private Button btnSearch;
    private User userLogado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_user);
        
        inicializarComponentes();

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userputted = user.getText().toString();

                GetJsonUser requisicao = new GetJsonUser(userputted);

            }
        });

    }

    private void inicializarComponentes() {
        user = findViewById(R.id.textUser);
        btnSearch = findViewById(R.id.btnSearch);
    }


}
