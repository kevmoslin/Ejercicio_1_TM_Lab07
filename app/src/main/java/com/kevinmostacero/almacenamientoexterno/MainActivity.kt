package com.kevinmostacero.almacenamientoexterno

import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        guardarArchivo()
    }

    private fun guardarArchivo() {

        val texto = "Hola desde almacenamiento externo"

        val directorio =
            getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)

        val archivo =
            File(directorio, "archivo.txt")

        archivo.writeText(texto)

        Toast.makeText(
            this,
            "Archivo guardado",
            Toast.LENGTH_LONG
        ).show()
    }
}