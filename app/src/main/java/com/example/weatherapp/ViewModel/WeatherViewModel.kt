package com.example.weatherapp.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weatherapp.repository.WeatherRepository
import com.example.weatherapp.server.ApiClient
import com.example.weatherapp.server.ApiServices

class WeatherViewModel(
    val repository: WeatherRepository
):ViewModel(){

    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat:Double, lon:Double, unit:String)=
        repository.getCurrentWeather(lat,lon,unit)

    fun loadForecastWeather(lat:Double, lon:Double, unit:String)=
        repository.getForecastWeather(lat,lon,unit)
}