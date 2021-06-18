package com.example.retrofitgetusingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Details> detailsList;
    RecyclerView recyclerView;
    DetailsAdaptery adaptery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adaptery=new DetailsAdaptery(getApplicationContext(),detailsList);
        recyclerView.setAdapter(adaptery);

        APICall apiCall=RetrofitClass.getRetrofit().create(APICall.class);
        Call<List<Details>> call=apiCall.getdetails();

        call.enqueue(new Callback<List<Details>>() {
            @Override
            public void onResponse(Call<List<Details>> call, Response<List<Details>> response) {
                detailsList=response.body();
                adaptery.setDetailsList(detailsList);
            }

            @Override
            public void onFailure(Call<List<Details>> call, Throwable t) {

            }
        });


    }
}