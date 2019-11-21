package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EmployeeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        for (int i = 0; i < Core.theEmployees.size(); i++)
        
        {
            TextView holder = new TextView(this);
            String text = Core.theEmployees.get(i).toString();
            holder.setText(text);

            linearLayout.addView(holder);
        }
    }
}
