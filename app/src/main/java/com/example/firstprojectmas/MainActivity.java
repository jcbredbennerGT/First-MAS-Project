package com.example.firstprojectmas;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int storesRegistered = 0;
    String name;
    EditText storeInput;
    Button registerButton;
    Button clearButton;
    TextView currentStoreDisplay;
    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        //mDatabase = FirebaseDatabase.getInstance().getReference();

        storeInput = (EditText) findViewById(R.id.editStoreName);
        registerButton = (Button) findViewById(R.id.button_register);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = storeInput.getText().toString();
                switch (storesRegistered) {
                    case 0:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store0);
                        currentStoreDisplay.setText(name);
                        break;
                    case 1:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store1);
                        currentStoreDisplay.setText(name);
                        break;
                    case 2:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store2);
                        currentStoreDisplay.setText(name);
                        break;
                    case 3:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store3);
                        currentStoreDisplay.setText(name);
                        break;
                    case 4:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store4);
                        currentStoreDisplay.setText(name);
                        break;
                    case 5:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store5);
                        currentStoreDisplay.setText(name);
                        break;
                    case 6:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store6);
                        currentStoreDisplay.setText(name);
                        break;
                    case 7:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store7);
                        currentStoreDisplay.setText(name);
                        break;
                }

                if (storesRegistered <= 8) {
                    storesRegistered++;
                    //mDatabase.child("companies").child(name).setValue(name);
                }
            }
        });

        clearButton = (Button) findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storesRegistered) {
                    case 1:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store0);
                        currentStoreDisplay.setText("Deleted");
                        break;
                    case 2:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store1);
                        currentStoreDisplay.setText("Deleted");
                        break;
                    case 3:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store2);
                        currentStoreDisplay.setText("Deleted");
                        break;
                    case 4:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store3);
                        currentStoreDisplay.setText("Deleted");
                        break;
                    case 5:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store4);
                        currentStoreDisplay.setText("Deleted");
                        break;
                    case 6:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store5);
                        currentStoreDisplay.setText("Deleted");
                        break;
                    case 7:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store6);
                        currentStoreDisplay.setText("Deleted");
                        break;
                    case 8:
                        currentStoreDisplay = (TextView) findViewById(R.id.Store7);
                        currentStoreDisplay.setText("Deleted");
                        break;
                }
                if (storesRegistered > 0) {
                    storesRegistered--;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up clear_button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*firebase data*/






}