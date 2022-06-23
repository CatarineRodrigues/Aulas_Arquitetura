package br.com.zup.movieflix.register.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import br.com.zup.movieflix.databinding.ActivityRegisterBinding
import br.com.zup.movieflix.home.view.HomeActivity
import br.com.zup.movieflix.login.model.LoginModel
import br.com.zup.movieflix.register.model.RegisterModel
import br.com.zup.movieflix.register.viewmodel.RegisterViewModel

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private val viewModel: RegisterViewModel by lazy {
        ViewModelProvider(this)[RegisterViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }

    private fun registerConpleted(){
        binding.bvLogin.setOnClickListener {
            val user = getInformation()
            confirmation(user)
            viewModel.getRegistration(user)
        }

        startActivity(Intent(this, HomeActivity::class.java))
    }

    private fun getInformation(): RegisterModel{
        val userName = binding.etUserNameRegister.text.toString()
        val userEmail = binding.etEmailRegister.text.toString()
        val password = binding.etPasswordRegister.text.toString()
        val passwordConfirmation = binding.etConfirmPasswordRegister.text.toString()

        return RegisterModel(
            userName = userName,
            userEmail = userEmail,
            password = password,
            passwordConfirmation = passwordConfirmation
        )
    }

    private fun confirmation(newUser: RegisterModel): Boolean{
        viewModel.response(this){
            return if(newUser.password == newUser.passwordConfirmation){
                Toast.makeText(this, "Cadastro Concluído", Toast.LENGTH_LONG).show()
                true
            }else{
                Toast.makeText(this, "As senhas devem ser iguais", Toast.LENGTH_LONG).show()
                false
            }
        }
    }

}