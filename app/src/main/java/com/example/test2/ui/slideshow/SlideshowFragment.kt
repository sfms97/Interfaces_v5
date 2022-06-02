package com.example.test2.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.test2.R
import com.example.test2.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.textSlideshow
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root
    }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navCtrl = this.findNavController()
        var btn12: TextView = view.findViewById(R.id.txtAadir)
        btn12.setOnClickListener {
            navCtrl.navigate(R.id.crearAsignatura)
        }

       var btnEliminar: TextView = view.findViewById(R.id.txtEliminar)
       btnEliminar.setOnClickListener {
           navCtrl.navigate(R.id.eliminarFragment)
       }

       var btnCalendario: ImageView = view.findViewById(R.id.imageView2)
       btnCalendario.setOnClickListener {
           navCtrl.navigate(R.id.nav_home)
       }
       var btnOcio: ImageView = view.findViewById(R.id.imageView)
       btnOcio.setOnClickListener {
           navCtrl.navigate(R.id.nav_gallery)
       }
       var btnFisica: TextView = view.findViewById(R.id.txtFsica)
       btnFisica.setOnClickListener {
           navCtrl.navigate(R.id.apuntesFisica)
       }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}