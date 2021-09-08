package com.willvargas.appubicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.willvargas.appubicacion.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
        // Add a marker in Sydney and move the camera
        val rancherito1 = LatLng(6.36147, -75.49529)
        mMap.addMarker(MarkerOptions().position(rancherito1).title("Rancherito Copacabana"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(rancherito1))

        mMap.addMarker(MarkerOptions().position(LatLng(6.23264, -75.60438)).title("Rancherito Los Molinos"))
        mMap.addMarker(MarkerOptions().position(LatLng(6.22606, -75.57530)).title("Rancherito Mercado del Rio"))
        mMap.addMarker(MarkerOptions().position(LatLng(6.21843, -75.56473)).title("Rancherito Las Palmas"))
        mMap.addMarker(MarkerOptions().position(LatLng(6.17680, -75.59167)).title("Rancherito Viva envigado"))


    }
}