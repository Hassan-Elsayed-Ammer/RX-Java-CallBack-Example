package com.example.rxjavacallbackexample.Retrofit;

import com.example.rxjavacallbackexample.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {

    @GET("Posts")
    Observable<List<Post>> getPosts();
}
