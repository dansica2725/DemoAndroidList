package c346.rp.edu.sg.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> verisonList;
    LayoutInflater inflater;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> verisonList) {
        super(context, resource, verisonList);
        this.parent_context = context;
        this.layout_id = resource;
        this.verisonList = verisonList;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(layout_id, null);

        TextView name, version;

        name = convertView.findViewById(R.id.nameTv);
        version = convertView.findViewById(R.id.versionTv);

        name.setText(verisonList.get(position).getName());
        version.setText(verisonList.get(position).getVersion());

        return convertView;
    }
}
