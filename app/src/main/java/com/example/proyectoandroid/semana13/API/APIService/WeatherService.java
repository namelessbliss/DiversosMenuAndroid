package com.example.proyectoandroid.semana13.API.APIService;

import com.example.proyectoandroid.semana13.Models.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    /**
     * Obtiene los datos meteorologicos del API, pasandole como parametro la ciudad como objetivo
     *
     * @param city
     * @param key
     * @return City
     */
    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key);

    /**
     * Obtiene los datos meteorologicos del API, pasandole como parametro la ciudad, unidad de medida de temperatura como objetivo
     *
     * @param city
     * @param key
     * @return City
     */
    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key, @Query("units") String value);

    /**
     * Obtiene los datos meteorologicos del API, pasandole como parametro la ciudad, unidad de medida de temperatura, idioma como objetivo
     *
     * @param city
     * @param key
     * @return City
     */
    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key, @Query("units") String value, @Query("lang") String lang);

}
