package com.example.citiclubapp.ui.BusinessHallPage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;

public class BusinessHallActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_hall);

        btn1 = findViewById(R.id.Btn_我的仓单);
        btn2 = findViewById(R.id.Btn_仓单质押);
        btn3 = findViewById(R.id.Btn_仓单查询);
        btn4 = findViewById(R.id.Btn_仓单销售);
        btn5 = findViewById(R.id.Btn_入库申请);

        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);
        btn5.setOnClickListener(onClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                break;
            case R.id.item2:
                break;
            case R.id.item3:
                break;
        }
        return true;
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.Btn_我的仓单:
                    break;
                case R.id.Btn_仓单质押:
                    break;
                case R.id.Btn_仓单查询:
                    break;
                case R.id.Btn_仓单销售:
                    break;
                case R.id.Btn_入库申请:
                    break;
            }
        }
    };
}