package br.com.zup.minhamusicafavorita.detalhes.albuns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.minhamusicafavorita.databinding.FragmentFotosBinding
import br.com.zup.minhamusicafavorita.detalhes.albuns.adapter.AlbumAdapter

class FotosFragment : Fragment() {
    private lateinit var binding: FragmentFotosBinding
    private val albumAdapter: AlbumAdapter by lazy {
        AlbumAdapter(arrayListOf())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFotosBinding.inflate(inflater, container, false)
        exibirRecyclerView()


        return binding.root
    }

    private fun exibirRecyclerView(){
        binding.rvListaAlbums.adapter = albumAdapter
        binding.rvListaAlbums.layoutManager = GridLayoutManager(context, 2)
    }
}