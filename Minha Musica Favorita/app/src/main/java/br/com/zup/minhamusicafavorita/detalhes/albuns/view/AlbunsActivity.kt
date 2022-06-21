package br.com.zup.minhamusicafavorita.detalhes.albuns.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minhamusicafavorita.ALBUM_KEY
import br.com.zup.minhamusicafavorita.DETALHES_KEY
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityAlbunsBinding
import br.com.zup.minhamusicafavorita.detalhes.albuns.albumSelecionado.view.AlbumSelecionadoFragment
import br.com.zup.minhamusicafavorita.detalhes.albuns.model.Album

class AlbunsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlbunsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbunsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acessarActionBar()
        recuperarAlbumSelecionado()
    }

    private fun acessarActionBar() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhe_do_Album)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun recuperarAlbumSelecionado() {
        val album = intent.getParcelableExtra<Album>(ALBUM_KEY)
        if (album != null) {
            enviarDadosParaFragmento(album)
        }
    }

    private fun enviarDadosParaFragmento(album: Album) {
        val fragmentoAlbumSelecionado = AlbumSelecionadoFragment().apply {
            arguments = Bundle().apply {
                putParcelable(ALBUM_KEY, album)
            }
        }
        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, fragmentoAlbumSelecionado)
            .addToBackStack(DETALHES_KEY)
            .commit()
    }
}