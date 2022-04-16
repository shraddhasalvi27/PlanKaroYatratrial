package com.example.plankaroyatratrial.dashboard;

import androidx.cardview.widget.CardView;

import com.example.dashboard.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
