package br.com.zup.minhamusicafavorita.detalhes.albuns

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.FragmentFotosBinding
import br.com.zup.minhamusicafavorita.detalhes.albuns.adapter.AlbumAdapter
import br.com.zup.minhamusicafavorita.model.Album

import android.content.Intent
class FotosFragment : Fragment() {
    private lateinit var binding: FragmentFotosBinding
    private val albumAdapter: AlbumAdapter by lazy {
        AlbumAdapter(arrayListOf(), ::irParaDetalheAlbum)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFotosBinding.inflate(inflater, container, false)
        adicionarItensListaAlbum()
        exibirRecyclerView()

        return binding.root
    }

    private fun adicionarItensListaAlbum() {
        val listaNovaAlbum = mutableListOf<Album>()
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_tf,
                "Taylor Swift",
                2006,
                "Big Machine Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "Música pop, Country pop"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_fearless,
                "Taylor Swift",
                2008,
                "Big Machine Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "Country pop"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_speak_now,
                "Taylor Swift",
                2012,
                "lBig Machine Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "pop"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_1989,
                "Taylor Swift",
                2014,
                "Big Machine Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "Pop, Synthpop; Electropop"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_reputation,
                "Taylor Swift",
                2017,
                "Big Machine Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "Pop; Synthpop; Electropop"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_lover,
                "Taylor Swift",
                2019,
                "Republic Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "Pop; Synthpop; Electropop"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_folklore,
                "Taylor Swift",
                2020,
                "Republic Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "Indie folk; rock alternativo; electro-folk; chamber pop"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_evermore,
                "Taylor Swift",
                2020,
                "Republic Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "Country; pop; eletrônico"
            )
        )
        albumAdapter.atualizarListaAlbum(listaNovaAlbum)
    }

    private fun exibirRecyclerView() {
        binding.rvListaAlbums.adapter = albumAdapter
        binding.rvListaAlbums.layoutManager = GridLayoutManager(context, 2)
    }

    private fun irParaDetalheAlbum(album: Album) {

        val intent = Intent(this, AlbunsActivity::class.java).apply {
            putExtra("Album", album)
        }
        startActivity(intent)
    }



}