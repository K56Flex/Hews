package com.leavjenn.hews.network;

import com.leavjenn.hews.model.Comment;
import com.leavjenn.hews.model.Post;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface HackerNewsService {

    @GET("/topstories.json")
    void getTopStories(Callback<int[]> callback);

    @GET("/item/{itemId}.json")
    void getItem(@Path("itemId") String itemId, Callback<Post> callback);


    // RxJava

    @GET("/topstories.json")
    Observable<List<Long>> getTopStories();

    @GET("/newstories.json")
    Observable<List<Long>> getNewStories();

    @GET("/askstories.json")
    Observable<List<Long>> getAskStories();

    @GET("/showstories.json")
    Observable<List<Long>> getShowStories();

    @GET("/item/{itemId}.json")
    Observable<Post> getStory(@Path("itemId") String itemId);


    @GET("/item/{itemId}.json")
    Observable<Comment> getComment(@Path("itemId") String itemId);

}
