package com.example.miniweatherdashboard.data.model


import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("last_updated_epoch")
    val last_updated_epoch: Int,
    @SerializedName("last_updated")
    val last_updated: String,
    @SerializedName("temp_c")
    val temp_c: Double,
    @SerializedName("temp_f")
    val temp_f: Double,
    @SerializedName("is_day")
    val is_day: Int,
    @SerializedName("condition")
    val condition: Condition,
    @SerializedName("wind_mph")
    val wind_mph: Double,
    @SerializedName("wind_kph")
    val wind_kph: Double,
    @SerializedName("wind_degree")
    val wind_degree: Int,
    @SerializedName("wind_dir")
    val wind_dir: String,
    @SerializedName("pressure_mb")
    val pressure_mb: Double,
    @SerializedName("pressure_in")
    val pressure_in: Double,
    @SerializedName("precip_mm")
    val precip_mm: Double,
    @SerializedName("precip_in")
    val precip_in: Double,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("cloud")
    val cloud: Int,
    @SerializedName("feelslike_c")
    val feelslike_c: Double,
    @SerializedName("feelslike_f")
    val feelslike_f: Double,
    @SerializedName("windchill_c")
    val windchill_c: Double,
    @SerializedName("windchill_f")
    val windchill_f: Double,
    @SerializedName("heatindex_c")
    val heatindex_c: Double,
    @SerializedName("heatindex_f")
    val heatindex_f: Double,
    @SerializedName("dewpoint_c")
    val dewpoint_c: Double,
    @SerializedName("dewpoint_f")
    val dewpoint_f: Double,
    @SerializedName("vis_km")
    val vis_km: Double,
    @SerializedName("vis_miles")
    val vis_miles: Double,
    @SerializedName("uv")
    val uv: Double,
    @SerializedName("gust_mph")
    val gust_mph: Double,
    @SerializedName("gust_kph")
    val gust_kph: Double,
    @SerializedName("short_rad")
    val short_rad: Int,
    @SerializedName("diff_rad")
    val diff_rad: Int,
    @SerializedName("dni")
    val dni: Int,
    @SerializedName("gti")
    val gti: Int
)