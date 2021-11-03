package com.example.retrofit_test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface
{
    @GET("test/example_select.php")
    Call<List<Person>> getNameHobby();

    @FormUrlEncoded
    @POST("test/example_insert.php")
    Call<Person> insertPerson(
            @Field("name") String name,
            @Field("hobby") String hobby
    );

    @FormUrlEncoded
    @POST("test/example_update.php")
    Call<Person> updatePerson(
            @Field("id") int id,
            @Field("name") String name,
            @Field("hobby") String hobby
    );

    @FormUrlEncoded
    @POST("test/example_delete.php")
    Call<Person> deletePerson(
            @Field("id") int id
    );
}

