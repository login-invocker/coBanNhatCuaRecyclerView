package com.example.testtttttttttttttttttttttttt;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

////////////////////////////////
public class HelpHodler extends RecyclerView.ViewHolder {
    public TextView txt;
    public HelpHodler(@NonNull View itemView) {

        super(itemView);
        txt=itemView.findViewById(R.id.txt);
    }
}
