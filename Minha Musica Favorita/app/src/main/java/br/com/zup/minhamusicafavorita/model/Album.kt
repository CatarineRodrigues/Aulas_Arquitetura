package br.com.zup.minhamusicafavorita.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Album(
    private var imagem: Int = 0,
    private var nomeAlbum: String = "",
    private var artista: String = "",
    private var lancamento: Int = 0,
    private var gravadora: String = "",
    private var estudio: String = "",
    private var formato: String = "",
    private var genero: String = ""
) : Parcelable {
    fun getImagem() = this.imagem
    fun getNomeAlbum() = this.nomeAlbum
    fun getArtista() = this.artista
    fun getLancamento() = this.lancamento
    fun getGravadora() = this.gravadora
    fun getEstudio() = this.estudio
    fun getFormato() = this.formato
    fun getGenero() = this.genero
}