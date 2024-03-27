package com.example.breakdownassistanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.breakdownassistanceapp.Retrofit.OpenWeatherMapService;
import com.example.breakdownassistanceapp.Retrofit.ApiClient;
import com.example.breakdownassistanceapp.Retrofit.WeatherData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherActivity extends AppCompatActivity {

    private TextView weatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        weatherTextView = findViewById(R.id.weatherTextView);

        getWeatherData("London", "uk");
    }

    private void getWeatherData(String city, String country) {
        OpenWeatherMapService service = ApiClient.getInstance().create(OpenWeatherMapService.class);

        Call<WeatherData> call = service.getCurrentWeatherData(city + "," + country, "740ad0cf87fbd350cf44027f7f713e9f");

        call.enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                if (response.isSuccessful() && response.body() != null) {
                    WeatherData weatherData = response.body();
                    String weatherInfo = "City: " + weatherData.getCityName() + "\n"
                            + "Temperature: " + weatherData.getTemperature() + "°C\n"
                            + "Description: " + weatherData.getWeatherDescription();
                    weatherTextView.setText(weatherInfo);
                } else {
                    Toast.makeText(WeatherActivity.this, "Failed to get weather data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
                Toast.makeText(WeatherActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}