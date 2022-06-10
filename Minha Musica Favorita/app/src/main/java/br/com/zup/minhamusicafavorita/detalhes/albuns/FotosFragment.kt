package br.com.zup.minhamusicafavorita.detalhes.albuns

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.FragmentFotosBinding
import br.com.zup.minhamusicafavorita.detalhes.albuns.adapter.AlbumAdapter
import br.com.zup.minhamusicafavorita.model.Album

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
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adicionarItensListaAlbum()
        exibirRecyclerView()
    }

    private fun adicionarItensListaAlbum() {
        val listaNovaAlbum = mutableListOf<Album>()
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_tf,
                "Taylor Swift",
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
                "Fearless",
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
                "Speak Now",
                "Taylor Swift",
                2010,
                "lBig Machine Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "pop"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_red,
                "Red",
                "Taylor Swift",
                2012,
                "lBig Machine Records",
                "Vários",
                "CD; download digital; LP; streaming",
                "Pop, Rock, Country pop, Pop rock"
            )
        )
        listaNovaAlbum.add(
            Album(
                R.drawable.img_album_1989,
                "1989",
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
                "Reputation",
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
                "Lover",
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
                "Folklore",
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
                "Evermore",
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
        val intent = Intent(context, AlbunsActivity::class.java).apply {
            putExtra("Album", album)
        }
        startActivity(intent)
    }
}