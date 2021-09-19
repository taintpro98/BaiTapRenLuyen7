package com.communityuni.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.communityuni.model.Contact;
import com.example.baitaprenluyen7.R;

public class ContactAdapter extends ArrayAdapter<Contact> {

    Activity context;
    int resource;
    public ContactAdapter(Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View customView = this.context.getLayoutInflater().inflate(this.resource, null);
        TextView txtTen = (TextView) customView.findViewById(R.id.txtTen);
        TextView txtPhone = (TextView) customView.findViewById(R.id.txtPhone);
        ImageView imgCall = (ImageView) customView.findViewById(R.id.imgCall);
        ImageView imgSms = (ImageView) customView.findViewById(R.id.imgSms);
        ImageView imgDetail = (ImageView) customView.findViewById(R.id.imgDetail);

        Contact contact = getItem(position);
        txtTen.setText(contact.getTen());
        txtPhone.setText(contact.getPhone());

        return customView;
    }
}
