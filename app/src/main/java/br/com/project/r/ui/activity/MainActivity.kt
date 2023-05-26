package br.com.project.r.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.project.r.R
import br.com.project.r.databinding.ActivityMainBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edNome = binding.edUsuario
        val btLogin = binding.btLogin

        btLogin.setOnClickListener {
            if(edNome.text.toString()=="User") {
                val inten = Intent(this, RegistraExameActivity::class.java)
                val texto = edNome.text.toString()
                inten.putExtra("nome", texto)
                startActivity(inten)

                val database = Firebase.database
                val myRef = database.getReference("message")

                myRef.setValue("Hello, World!")
            }
            if(edNome.text.toString()=="UserAdmin") {
                val inten = Intent(this, ListaVagasActivity::class.java)
                val texto = edNome.text.toString()
                inten.putExtra("nome", texto)
                startActivity(inten)

                val database = Firebase.database
                val myRef = database.getReference("message")

                myRef.setValue("Hello, World!")
            }
            else{
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            }
        }
        //setContentView(R.layout.activity_main)
    }
}