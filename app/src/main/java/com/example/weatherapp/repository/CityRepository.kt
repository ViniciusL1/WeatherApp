package com.example.weatherapp.repository

import com.example.weatherapp.server.ApiServices

class CityRepository(val api:ApiServices) {

    fun getCities(q:String, limit:Int) =
        api.getCitiesList(q,limit,"44398adc3ec3548bb89493d466a80cc6")

}