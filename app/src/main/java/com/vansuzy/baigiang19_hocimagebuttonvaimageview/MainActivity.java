package com.vansuzy.baigiang19_hocimagebuttonvaimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radHinhNha, radHinhNguoi;
    ImageView imgHinh;
    ImageButton btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        // setOnCheckedChangeListener: tự động lắng nghe sự kiện khi click vào RadioButton (tương tự đối với CheckBox)
        radHinhNguoi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)  // đối số isChecked cho biết là RadioButton đó có đang được check hay không
            {
                if (isChecked) {
                    imgHinh.setImageResource(R.drawable.employee);  // setImageResource: lấy hình ảnh nằm trong drawable đẩy lên ImageView
                }
            }
        });
        radHinhNha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imgHinh.setImageResource(R.drawable.building);
                }
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void addControls() {
        radHinhNha = (RadioButton) findViewById(R.id.radHinhNha);
        radHinhNguoi = (RadioButton) findViewById(R.id.radHinhNguoi);
        imgHinh = (ImageView) findViewById(R.id.imgHinh);
        btnThoat = (ImageButton) findViewById(R.id.btnThoat);
    }
}
