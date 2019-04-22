package co.rsk.rnsexample;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    FloatingActionButton floatingActionButton;

    List<String> nameArray = new ArrayList<>();

    {
            nameArray.add("Dummy");
    }

    List<String> infoArray = new ArrayList<>();

    {
        infoArray.add("0xAF415eAAD8E55");
    }

    private static final String LOG = "main activity";

    CustomListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomListAdapter(this, nameArray, infoArray);
        listView = findViewById(R.id.domainsListID);
        listView.setAdapter(adapter);

    }
    static final int ADD_ADDRESS_REQUEST = 0;

    public void addAddress(View view) {
        Log.d(LOG, "Button clicked!");
        startActivityForResult(new Intent(this, AddAddressActivity.class), ADD_ADDRESS_REQUEST);
    }

    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        if (requestCode == ADD_ADDRESS_REQUEST) {
            if (resultCode == RESULT_OK) {
                System.out.println(data.getExtras().getString(AddAddressActivity.ADDRESS_DATA));
                String res = data.getExtras().getString(AddAddressActivity.ADDRESS_DATA);
                if (res != null) {
                    String[] parsed = res.split(":");
                    if (parsed.length > 1) {
                        nameArray.add(parsed[0]);
                        infoArray.add(parsed[1]);
                        adapter.notifyDataSetChanged();
                    }
                }
            }
        }
    }
}
