package co.rsk.rnsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    List<String> nameArray = new ArrayList<>();

    {
            nameArray.add("Octopus");
            nameArray.add("Pig");
            nameArray.add("Sheep");
            nameArray.add("Rabbit");
            nameArray.add("Snake");
            nameArray.add("Spider");
    }

    List<String> infoArray = new ArrayList<>();

    {
        infoArray.add("8 tentacled monster");
        infoArray.add("Delicious in rolls");
        infoArray.add("Great for jumpers");
        infoArray.add("Nice in a stew");
        infoArray.add("Great for shoes");
        infoArray.add("Scary.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this, nameArray, infoArray);
        listView = findViewById(R.id.domainsListID);
        listView.setAdapter(adapter);
    }
}
