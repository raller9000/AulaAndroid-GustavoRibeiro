package com.example.projeto2508;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        Log.d("ciclo de vida", "onStart");
    }

    protected void onResume() {
        super.onResume();
        Log.d("ciclo de vida", "onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.d("ciclo de vida", "onPause");
    }

    protected void onStart() {
        super.onStart();
        Log.d("ciclo de vida", "onStart");
    }

    protected void onStop() {
        super.onStop();
        Log.d("ciclo de vida", "onStop");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo de vida", "onRestart");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo de vida", "onDestroy");
    }

}