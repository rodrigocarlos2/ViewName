
package com.example.aluno.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEdit;
    Button mButton;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        // Main Method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit   = (EditText)findViewById(R.id.editText);
        mButton = (Button)findViewById(R.id.button);

        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String name = mEdit.getText().toString();
                        mText.setText(name);
                    }
                });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
