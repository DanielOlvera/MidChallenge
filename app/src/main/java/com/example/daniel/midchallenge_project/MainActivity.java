package com.example.daniel.midchallenge_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daniel.midchallenge_project.R;
import com.example.daniel.midchallenge_project.entities.Listing;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @InjectView(R.id.textView) TextView textView;

        @Inject
        Retrofit retrofit;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ((App) getApplication()).getNetComponent().inject(this);

            //Create a retrofit call object
            Call<List<Listing>> posts = retrofit.create(HelperAPI.class).getPosts();

            //Enque the call
            posts.enqueue(new Callback<List<Listing>>() {
                @Override
                public void onResponse(Call<List<Listing>> call, Response<List<Listing>> response) {
                    //Set the response to the textview
                    textView.setText(response.body().get(0).getBody());

                }

                @Override
                public void onFailure(Call<List<Listing>> call, Throwable t) {
                    //Set the error to the textview
                    textView.setText(t.toString());
                }
            });
        }
    }
}
