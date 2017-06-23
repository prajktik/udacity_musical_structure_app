package com.example.android.muscialstructureapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;

import com.example.android.muscialstructureapp.databinding.ActivityPaymentBinding;

public class PaymentActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ActivityPaymentBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_payment);
        binding.setPayment(this);
        binding.btnSongs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });

        binding.tvDescriptionPayment.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
