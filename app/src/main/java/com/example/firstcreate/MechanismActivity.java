package com.example.firstcreate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MechanismActivity extends AppCompatActivity implements
        View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanism);

        TextView WhyDoWeHaveFever = findViewById(R.id.WhyDoWeHaveFever);
        WhyDoWeHaveFever.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.WhyDoWeHaveFever:
                Intent toLink3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scientificamerican.com/article/what-causes-a-fever/"));
                startActivity(toLink3);
                break;
        }
    }

}
