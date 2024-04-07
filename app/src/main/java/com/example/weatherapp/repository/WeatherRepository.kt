package com.example.weatherapp.repository

import com.example.weatherapp.server.ApiServices

class WeatherRepository(
    val api: ApiServices
){
    fun getCurrentWeather(lat: Double, log:Double, unit: String) =
        api.getCurrentWeather(lat,log,unit,"44398adc3ec3548bb89493d466a80cc6")

    fun getForecastWeather(lat: Double, log:Double, unit: String) =
        api.getForecastWeather(lat,log,unit,"44398adc3ec3548bb89493d466a80cc6")
}