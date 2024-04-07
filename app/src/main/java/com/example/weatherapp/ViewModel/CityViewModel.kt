package com.example.weatherapp.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weatherapp.model.CityResponseApi
import com.example.weatherapp.repository.CityRepository
import com.example.weatherapp.server.ApiClient
import com.example.weatherapp.server.ApiServices

class CityViewModel(val repository: CityRepository): ViewModel() {

    constructor():this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q:String, limit:Int)=
        repository.getCities(q, limit)
}