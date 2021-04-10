package edu.itesm.nytimes

import retrofit2.Response
import retrofit2.http.GET


interface APIService {
    @GET("hardcover-fiction.json?api-key=eyHTp417GrUfHQrgAAddNFs94zg1C9kG")
    suspend fun getBooks() : Response<Results>
}