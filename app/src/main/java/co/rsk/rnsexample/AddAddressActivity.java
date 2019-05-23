package co.rsk.rnsexample;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import co.rsk.rnssdk.BuildConfig;
import co.rsk.rnssdk.RnsResolver;

public class AddAddressActivity extends AppCompatActivity {

    RnsResolver resolver = new RnsResolver();

    private final static String NO_RESPONSE = "0x0000000000000000000000000000000000000000";

    private class ResolveNameAddress extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                String result = resolver.getAddress(params[0]);
                if (!result.equals(NO_RESPONSE)) {
                    return params[0]+":"+result;
                }
            } catch (Exception e) {
                return null;
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            Intent intent = new Intent();
            intent.putExtra(ADDRESS_DATA, result);
            setResult(RESULT_OK, intent);
            finish();
        }
    }

    public final static String ADDRESS_DATA = "ADDRESS_DATA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);

        EditText address = findViewById(R.id.addressEditTextID);
        Button addbutton = findViewById(R.id.addAddressID);
        addbutton.setOnClickListener(v -> {
            if (address.getText().length() > 0) {
                ResolveNameAddress resolve = new ResolveNameAddress();
                resolve.execute(address.getText().toString());
            }
        });
    }
}
