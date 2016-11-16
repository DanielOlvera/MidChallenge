package com.example.daniel.midchallenge_project;

import com.example.daniel.midchallenge_project.entities.Listing;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Daniel on 11/15/16.
 */

public interface HelperAPI {

    @GET("/posts")
    Call<List<Listing>> getPosts();
}
