package com.example.aplikasicrudraka

import com.google.gson.annotations.SerializedName

class ResultStaff {
    @field: SerializedName ( value = "pesan")
    val pesan: String? = null

    @field: SerializedName ( value = "staff")
    val staff: List<DataItem>? = null

    @field: SerializedName ( value = "status")
    val status: Int?= null
}