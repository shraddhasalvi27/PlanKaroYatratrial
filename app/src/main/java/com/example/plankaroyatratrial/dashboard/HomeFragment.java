package com.example.plankaroyatratrial.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    private Button calenderbtn;
    private Button notepadbtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
        calenderbtn = (Button) findViewById(R.id.calenderbtn);
        calenderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalender();
            }

        });
    }
    public void openCalender(){
        Intent intent= new Intent(this,Calender.class);
        startActivity(intent);
    }

    notepadbtn = (Button) findViewById(R.id.notepadbtn);
        notepadbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openMainnotepad();
        }

    });
}
    public void openMainnotepad(){
        Intent intent= new Intent(this,Calender.class);
        startActivity(intent);
    }


}
