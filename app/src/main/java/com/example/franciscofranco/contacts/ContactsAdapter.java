package com.example.franciscofranco.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by FranciscoFranco on 8/3/16.
 */
public class ContactsAdapter extends ArrayAdapter<Contact> {

    public ContactsAdapter(Context context, LinkedList<Contact> contacts) {
        super(context, 0, contacts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contact contact = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_contact, parent, false);
        }
        // Lookup view for data population
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView number = (TextView) convertView.findViewById(R.id.number);
        // Populate the data into the template view using the data object
        name.setText(contact.name);
        number.setText(contact.number);
        // Return the completed view to render on screen
        return convertView;
    }
}
