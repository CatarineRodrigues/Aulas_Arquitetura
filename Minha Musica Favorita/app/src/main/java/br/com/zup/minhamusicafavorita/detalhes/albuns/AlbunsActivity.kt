package br.com.zup.minhamusicafavorita.detalhes.albuns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityAlbunsBinding
import br.com.zup.minhamusicafavorita.detalhes.FragmentoClick
import br.com.zup.minhamusicafavorita.detalhes.albuns.albumSelecionado.AlbumSelecionadoFragment
import br.com.zup.minhamusicafavorita.model.Album
import kotlinx.android.parcel.Parcelize

class AlbunsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlbunsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbunsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acessarActionBar()

        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, AlbumSelecionadoFragment())
            .commit()
        recuperarAlbumSelecionado()
    }

    private fun acessarActionBar() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhe_da_banda)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

//    private fun irParaDetalheAlbum(album: Album) {
//        val intent = Intent(this, AlbunsActivity::class.java).apply {
//            putExtra("Album", album)
//        }
//        startActivity(intent)
//    }

    private fun recuperarAlbumSelecionado() {
        val album = intent.getParcelableExtra<Album>("Album")
//        binding.container.id =
            supportFragmentManager.getFragment(Bundle(), "Album")
    }
}