package com.hllbr.javamaps_mytravelbookproject_2021;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.hllbr.javamaps_mytravelbookproject_2021.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        /*
        Harita hazır olduğunda yapılacak işlemler dizini ==>>
        Latitude = enlem Longitude = boylam
         */

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //addmarker = işaretçi olarak ifade edebiliriz.


        //Latlng = enlem ve boylamı bir arada tutmak için oluşturulmuş karma bir sınıf diyebiliriz.
        LatLng eiffel = new LatLng(48.8559713,2.2930037);
        //illa addmarker oluşturmamıza gerek yok işaretçi olmaksızın kameramızı direkt lokasyona çevirebiliriz.

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(eiffel));//daha detaylı bir gösterim yok var newLatlngZoom yaparak gösterimi efektif bir hale getirebiliriz.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(eiffel,15));//zoom yapısının bir sınırı 0 ile 25 arasında bir tercih yapmamız gerekmektedir.




        /*
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

         */
    }
}