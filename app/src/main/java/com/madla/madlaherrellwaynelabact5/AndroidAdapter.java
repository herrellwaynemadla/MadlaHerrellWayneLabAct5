package com.madla.madlaherrellwaynelabact5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import  android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class AndroidAdapter extends ArrayAdapter<AndroidVer>{
    Context mContext;
    int mResource;

    public AndroidAdapter(@NonNull Context context, int resource, @NonNull List<AndroidVer> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    @NonNull
    public  View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        int image = getItem(position).getLogo();
        String name = getItem(position).getName();
        String ver = getItem(position).getVer();
        String api = getItem(position).getApi();
        String date = getItem(position).getDate();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);
        ImageView tL = convertView.findViewById(R.id.imageView);
        TextView tN = convertView.findViewById(R.id.textView);
        TextView tV = convertView.findViewById(R.id.textView2);
        TextView tA = convertView.findViewById(R.id.textView3);
        TextView tD = convertView.findViewById(R.id.textView4);

        tL.setImageResource(image);
        tN.setText(name);
        tA.setText(api);
        tV.setText(ver);
        tD.setText(date);

        return convertView;
    }
}
