package com.example.a3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PasswordEntryAdapter extends RecyclerView.Adapter<PasswordEntryAdapter.ViewHolder> {
    private List<PasswordEntry> entries;
    private Context context;

    public PasswordEntryAdapter(Context context) {
        this.context = context;
        this.entries = new ArrayList<>();
    }

    public void add(PasswordEntry entry) {
        entries.add(entry);
        notifyDataSetChanged();
    }

    public void edit(int position) {
        // Edit the password entry at the specified position
    }

    public void delete(int position) {
        // Delete the password entry at the specified position
        entries.remove(position);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.password_entry_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PasswordEntry entry = entries.get(position);
        holder.usernameTextView.setText(entry.getUsername());
        holder.passwordTextView.setText(entry.getPassword());
        holder.websiteUrlTextView.setText(entry.getWebsiteUrl());
    }

    @Override
    public int getItemCount() {
        return entries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView usernameTextView;
        TextView passwordTextView;
        TextView websiteUrlTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            usernameTextView = itemView.findViewById(R.id.username_text_view);
            passwordTextView = itemView.findViewById(R.id.password_text_view);
            websiteUrlTextView = itemView.findViewById(R.id.website_url_text_view);
        }
    }
}
