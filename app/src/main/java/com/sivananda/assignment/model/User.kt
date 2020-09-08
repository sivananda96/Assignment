package com.sivananda.assignment.model

import com.google.gson.annotations.SerializedName

data class User(@SerializedName("salt")
                val salt: String = "",
                @SerializedName("gender")
                val gender: String = "",
                @SerializedName("sha256")
                val sha256: String = "",
                @SerializedName("registered")
                val registered: String = "",
                @SerializedName("cell")
                val cell: String = "",
                @SerializedName("picture")
                val picture: String = "",
                @SerializedName("SSN")
                val ssn: String = "",
                @SerializedName("sha1")
                val sha1: String = "",
                @SerializedName("password")
                val password: String = "",
                @SerializedName("phone")
                val phone: String = "",
                @SerializedName("dob")
                val dob: String = "",
                @SerializedName("name")
                val name: Name,
                @SerializedName("location")
                val location: Location,
                @SerializedName("email")
                val email: String = "",
                @SerializedName("username")
                val username: String = "",
                @SerializedName("md5")
                val md: String = "")