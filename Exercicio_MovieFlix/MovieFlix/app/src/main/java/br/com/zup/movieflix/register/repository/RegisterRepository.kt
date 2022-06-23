package br.com.zup.movieflix.register.repository
import br.com.zup.movieflix.register.model.RegisterModel

class RegisterRepository {

    fun registration(): List<RegisterModel> {
        val listRegister = mutableListOf<RegisterModel>()
        listRegister.add(getUser())
        return listRegister
    }

    private fun getUser(): RegisterModel {
        return RegisterModel(
            userName = "",
            userEmail = "",
            password = "",
            passwordConfirmation = "")
    }
}