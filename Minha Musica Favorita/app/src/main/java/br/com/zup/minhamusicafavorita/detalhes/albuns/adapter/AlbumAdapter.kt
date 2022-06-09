package br.com.zup.minhamusicafavorita.detalhes.albuns.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minhamusicafavorita.databinding.AlbumItemBinding
import br.com.zup.minhamusicafavorita.model.Album

class AlbumAdapter(
    private var listaAlbum: MutableList<Album>
): RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumAdapter.ViewHolder {
        val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumAdapter.ViewHolder, position: Int) {
        val album = listaAlbum[position]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder(val binding: AlbumItemBinding): RecyclerView.ViewHolder(binding.root){
        fun exibirAlbunsView(album: Album){
            binding.imgFotoItem
        }
    }
}