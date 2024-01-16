package com.vedruna.ramirezluquee01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class CountFragment extends Fragment {

    private TextView numberText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_count, container, false);

        numberText = view.findViewById(R.id.number);
        Button btnSubstract = view.findViewById(R.id.btnSubtract);
        Button btnAdd = view.findViewById(R.id.btnAdd);
        Button btnReset = view.findViewById(R.id.btnReset);

        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberString = numberText.getText().toString();

                int number = 0;
                try {
                    number = Integer.parseInt(numberString);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                if (number > 0) {
                    number -= 1;

                    numberString = String.valueOf(number);
                    numberText.setText(numberString);
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberString = numberText.getText().toString();

                int number = 0;
                try {
                    number = Integer.parseInt(numberString);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                number += 1;

                numberString = String.valueOf(number);
                numberText.setText(numberString);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText("0");
            }
        });

        return view;
    }
}