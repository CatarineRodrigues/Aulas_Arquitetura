package br.com.zup.minhamusicafavorita.detalhes.albuns.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.minhamusicafavorita.detalhes.albuns.model.Album
import br.com.zup.minhamusicafavorita.detalhes.albuns.repository.AlbumRepository

class AlbumViewModel() : ViewModel() {
    private val repository = AlbumRepository()

    private val _response: MutableLiveData<List<Album>> = MutableLiveData()

    val response: LiveData<List<Album>> = _response

    fun getAllMovies() {
        try {
            _response.value = repository.getListAlbum()
        } catch (ex: Exception) {
            Log.i("Mensagem de erro", "erro")
        }
    }
}