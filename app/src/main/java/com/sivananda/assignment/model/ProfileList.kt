package com.sivananda.assignment.model

import com.google.gson.annotations.SerializedName

data class ProfileList(@SerializedName("results")
                       val results: List<ResultsItem>?)