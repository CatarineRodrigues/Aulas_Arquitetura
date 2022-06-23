package br.com.zup.movieflix.register.repository
import br.com.zup.movieflix.register.model.RegisterModel

class RegisterRepository {

    fun registration(user: RegisterModel): List<RegisterModel> {
        val listRegister = mutableListOf<RegisterModel>()
        listRegister.add(user)
        return listRegister
    }
}