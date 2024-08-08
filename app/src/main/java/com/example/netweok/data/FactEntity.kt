package com.example.netweok.data
import com.google.gson.annotations.SerializedName
data class FactEnitity(
    @SerializedName("_id") val id: String,
    @SerializedName("_V") val version:Long,
    @SerializedName("text") val text:String,
    @SerializedName("updatedAt") val updatedAt:String,
    @SerializedName("deleted") val deleted:Boolean,
    @SerializedName("source") val source:String,
    @SerializedName("sentCount") val sentCount:Long,
)

