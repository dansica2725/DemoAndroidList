package c346.rp.edu.sg.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView androidLv;
    ArrayList<AndroidVersion> androidArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidLv = findViewById(R.id.androidLv);

        androidArray.add(new AndroidVersion("Pie", "9.0"));
        androidArray.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        androidArray.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        androidArray.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        androidArray.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        androidArray.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        androidArray.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));

//        androidArray.add("Pie - 9.0");
//        androidArray.add("Oreo - 8.0 - 8.1");
//        androidArray.add("Nougat - 7.0 - 7.1.2");
//        androidArray.add("Marshmallow - 6.0 - 6.0.1");
//        androidArray.add("Lollipop - 5.0 - 5.1.1");
//        androidArray.add("KitKat - 4.4 - 4.4.4");
//        androidArray.add("Jelly Bean - 4.1 - 4.3.1");

        ArrayAdapter<AndroidVersion> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, androidArray);
        androidLv.setAdapter(adapter);

    }
}
