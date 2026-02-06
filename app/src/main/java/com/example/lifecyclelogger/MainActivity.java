package com.example.lifecyclelogger;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity Lifecycle Logger - משימה 1
 * 
 * המשימה שלכם: הוסיפו הודעות Log.d() לכל פונקציות מחזור החיים.
 * 
 * פונקציות שצריך להוסיף:
 * 1. onCreate() - כבר קיימת, רק צריך להוסיף Log
 * 2. onStart()
 * 3. onResume()
 * 4. onPause()
 * 5. onStop()
 * 6. onDestroy()
 * 
 * דוגמה להודעת Log:
 * Log.d("LifecycleDemo", "onCreate called");
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }
}

