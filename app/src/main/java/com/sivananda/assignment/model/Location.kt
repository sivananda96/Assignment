package com.sivananda.assignment.model

import com.google.gson.annotations.SerializedName

data class Location(@SerializedName("zip")
                    val zip: String = "",
                    @SerializedName("city")
                    val city: String = "",
                    @SerializedName("street")
                    val street: String = "",
                    @SerializedName("state")
                    val state: String = "")