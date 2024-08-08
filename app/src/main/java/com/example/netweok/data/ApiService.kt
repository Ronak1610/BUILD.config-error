package com.example.netweok.data

import androidx.annotation.IntRange
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
  @GET("facts/random")
  suspend fun getRandomFact():FactEnitity
  @GET("facts/random")
  suspend fun getRandomFacts(
      @Query("animal_type") animalType:String,
      @IntRange(from = 2L)@Query("amount") amount:Int,
  ):List<FactEnitity>
}