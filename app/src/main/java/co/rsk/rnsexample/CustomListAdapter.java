package co.rsk.rnsexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the list of names
    private final List<String> nameArray;

    //to store the list of addresses
    private final List<String> addressArray;

    public CustomListAdapter(Activity context,
                             List<String> nameArrayParameter,
                             List<String> addressArrayParameter){

        super(context,R.layout.domainview_row , nameArrayParameter);

        this.context=context;
        this.nameArray = nameArrayParameter;
        this.addressArray = addressArrayParameter;

    }

    //mapper
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.domainview_row, null,true);

        TextView nameTextField = rowView.findViewById(R.id.nameTextViewID);
        TextView addressTextField = rowView.findViewById(R.id.addressTextViewID);

        nameTextField.setText(nameArray.get(position));
        addressTextField.setText(addressArray.get(position));

        return rowView;
    };
}
