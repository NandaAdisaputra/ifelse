package com.qiswatululfah.ifelse;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.edt_input)
    EditText edtInput;
    @BindView(R.id.btn_results)
    Button btnResults;
    @BindView(R.id.tv_value)
    TextView tvValue;
    int angka1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnResults.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String angka = edtInput.getText().toString();
        if (angka.isEmpty()) {
            edtInput.setError("Hai Ulfah, Nilai Tidak Boleh Kosong");
        } else {
            angka1 = Integer.parseInt(angka);
            if ((angka1 >= 80) && (angka1 <= 100)) {
                tvValue.setText("Nilai A");
            } else if ((angka1 >= 70) && (angka1 <= 85)) {
                tvValue.setText("Nilai B");
            } else if ((angka1 >= 60) && (angka1 <= 69)) {
                tvValue.setText("Nilai C");
            } else if ((angka1 >= 50) && (angka1 <= 59)) {
                tvValue.setText("Nilai D");
            } else {
                tvValue.setText("Nilai Anda E, Silahkan Belajar Lebih Tekun Lagi");
            }
        }
    }

}
