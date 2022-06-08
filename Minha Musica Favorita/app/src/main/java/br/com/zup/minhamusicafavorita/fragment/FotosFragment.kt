package br.com.zup.minhamusicafavorita.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.FragmentFotosBinding

class FotosFragment : Fragment() {
    private lateinit var binding: FragmentFotosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFotosBinding.inflate(inflater, container, false)
        return binding.root
    }
}