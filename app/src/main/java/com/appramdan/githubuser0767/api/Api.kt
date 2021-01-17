package com.appramdan.githubuser0767.api

import com.appramdan.githubuser0767.data.model.DetailUserResponse
import com.appramdan.githubuser0767.data.model.User
import com.appramdan.githubuser0767.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token  b3c9b9d8b9c8fd21f7717907332693dff0a4bd1f")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token  b3c9b9d8b9c8fd21f7717907332693dff0a4bd1f")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token  b3c9b9d8b9c8fd21f7717907332693dff0a4bd1f")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token  b3c9b9d8b9c8fd21f7717907332693dff0a4bd1f")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}