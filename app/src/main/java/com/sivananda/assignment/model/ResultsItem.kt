package com.sivananda.assignment.model

import com.google.gson.annotations.SerializedName

data class ResultsItem(@SerializedName("seed")
                       val seed: String = "",
                       @SerializedName("user")
                       val user: User,
                       @SerializedName("version")
                       val version: String = "")