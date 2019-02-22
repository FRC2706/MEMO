package mergerobotics.memo.gui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import mergerobotics.memo.R;

public class sandstormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandstorm);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void teleopPage(View view){
        Intent intent = new Intent(this, teleopActivity2019.class);
        startActivity(intent);
    }

    //OnClick methods for cargo, hatch and delivery buttons
    public void cargoPickupPage(View view){
        Intent intent = new Intent(this, CargoPickupActivity.class);
        startActivity(intent);
    }
    public void hatchPickupPage(View view){
        Intent intent = new Intent(this, HatchPickupActivity.class);
        startActivity(intent);
    }

    public void deliveryCyclePage(View view){
        Intent intent = new Intent(this, DeliveryCycleActivity.class);
        startActivity(intent);
    }

}
