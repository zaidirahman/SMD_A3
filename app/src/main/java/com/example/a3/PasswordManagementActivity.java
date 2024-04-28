package com.example.a3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PasswordManagementActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PasswordEntryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_management);

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new PasswordEntryAdapter(this);
        recyclerView.setAdapter(adapter);

        // Add, edit, and delete password entries
        Button addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add a new password entry
                adapter.add(new PasswordEntry("new_username", "new_password", "new_website_url"));
                // Update the RecyclerView to show the new password entry
                adapter.notifyDataSetChanged();
            }
        });

        Button editButton = findViewById(R.id.edit_button);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Edit an existing password entry
                adapter.edit(0);
            }
        });

        Button deleteButton = findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Delete a password entry
                adapter.delete(0);
            }
        });
    }
}











//package com.example.a3;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class PasswordManagementActivity extends AppCompatActivity {
//    private RecyclerView recyclerView;
//    private PasswordEntryAdapter adapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_password_management);
//
//        recyclerView = findViewById(R.id.recycler_view);
//        adapter = new PasswordEntryAdapter(this);
//        recyclerView.setAdapter(adapter);
//
//        // Add, edit, and delete password entries
//        Button addButton = findViewById(R.id.add_button);
//        addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Add a new password entry
//                adapter.add(new PasswordEntry("new_username", "new_password", "new_website_url"));
//            }
//        });
//
//        Button editButton = findViewById(R.id.edit_button);
//        editButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Edit an existing password entry
//                adapter.edit(0);
//            }
//        });
//
//        Button deleteButton = findViewById(R.id.delete_button);
//        deleteButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Delete a password entry
//                adapter.delete(0);
//            }
//        });
//    }
//}
