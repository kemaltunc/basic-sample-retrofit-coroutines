package com.tunc.coroutinenetworklayer.data.api

import com.tunc.coroutinenetworklayer.data.model.TodoResponse
import retrofit2.http.GET

interface RetrofitService {

    @GET("todos")
    suspend fun getTodos(): List<TodoResponse>
}