package com.example.citiclubapp.widgetLayout;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.citiclubapp.R;

public class InsideTitle extends LinearLayout {
    public ImageButton back;
    public TextView name;

    public InsideTitle(final Context context, AttributeSet atters){
        super(context,atters);
        LayoutInflater.from( context ).inflate( R.layout.inside_title, this );
        back=findViewById( R.id.back );
        name=findViewById( R.id.name );
        back.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(context instanceof Activity)
                    ((Activity) context).finish();
            }
        } );
    }

    public void setTitle(String title){
        name.setText(title);
    }
}
