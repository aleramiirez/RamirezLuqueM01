package com.vedruna.ramirezluquee01;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.vedruna.ramirezluquee01.interfaces.CRUDInterface;
import com.vedruna.ramirezluquee01.model.Product;
import com.vedruna.ramirezluquee01.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiFragment extends Fragment {


    private List<Product> products;
    private CRUDInterface crudInterface;

    public ApiFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_api, container, false);
        // Add your UI-related code here if needed
        fetchData(); // Call the method to trigger the network request
        return view;
    }

    // Add this method to trigger the network request
    private void fetchData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        crudInterface = retrofit.create(CRUDInterface.class);
        Call<List<Product>> call = crudInterface.getAll();
        call.enqueue(new Callback<List<Product>>() {

            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if (!response.isSuccessful()) {
                    Log.e("error ", response.message());
                    return;
                }
                products = response.body();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    products.forEach(p -> Log.i("api  ", p.toString()));
                }
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.e("Throw err: ", t.getMessage());
            }
        });
    }
}