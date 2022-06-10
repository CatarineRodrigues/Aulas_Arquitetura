package br.com.zup.minhamusicafavorita.detalhes.albuns.albumSelecionado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.minhamusicafavorita.databinding.FragmentAlbumSelecionadoBinding
import br.com.zup.minhamusicafavorita.model.Album

class AlbumSelecionadoFragment : Fragment() {
    private lateinit var binding: FragmentAlbumSelecionadoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlbumSelecionadoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recuperarAlbum()
    }

    private fun recuperarAlbum() {
        val album = arguments?.getParcelable<Album>("Album")
        if (album != null) {
            exibirInformacoes(album)
        }
    }

    private fun exibirInformacoes(album: Album) {
        binding.imgAlbum.setImageResource(album.getImagem())
        binding.tvNomeAlbum.text = album.getNomeAlbum()
        binding.tvCantora.text = album.getArtista()
        binding.tvLancamento.text = album.getLancamento().toString()
        binding.tvGravadora.text = album.getGravadora()
        binding.tvEstudio.text = album.getEstudio()
        binding.tvFormato.text = album.getFormato()
        binding.tvGenero.text = album.getGenero()
    }
}