package com.example.aplikasicrudraka

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DataItem : Serializable {
    @field:SerializedName( value = "staff_name")
    val staffName: String? = null

    @field:SerializedName( value = "staff_id")
    val staffId: String? = null

    @field:SerializedName( value = "staff_handphone")
    val staffHandphone: String? = null

    @field:SerializedName( value = "staff_address")
    val staffAddress: String? = null
}