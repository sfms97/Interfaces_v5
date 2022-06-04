package com.example.test2

import android.view.View
import androidx.fragment.app.Fragment
import com.example.test2.R

class CustomMapFragment : Fragment() {
    /*private var googleMap: GoogleMap? = null
    private var mapView: MapView? = null
    private var mapsSupported = true
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            MapsInitializer.initialize(activity)
        } catch (e: GooglePlayServicesNotAvailableException) {
            mapsSupported = false
        }
        if (mapView != null) {
            mapView.onCreate(savedInstanceState)
        }
        initializeMap()
    }

    private fun initializeMap() {
        if (googleMap == null && mapsSupported) {
            mapView = requireActivity().findViewById<View>(R.id.map) as MapView
            googleMap = mapView.getMap()
            //setup markers etc...
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val parent: LinearLayout =
            inflater.inflate(R.layout.nearby_layout, container, false) as LinearLayout
        mapView = parent.findViewById(R.id.map) as MapView
        return parent
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
        initializeMap()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }*/
}