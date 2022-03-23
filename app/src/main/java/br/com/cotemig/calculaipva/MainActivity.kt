package br.com.cotemig.calculaipva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var valor = findViewById<EditText>(R.id.valor)
        var calcular = findViewById<Button>(R.id.calcular)

        calcular.setOnClickListener {
            calcularClick(valor.text.toString().toDouble())
        }

    }

    fun calcularClick(valor: Double){

        var ipva = valor * 0.04
        var parcela = ipva / 3.0

        var intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("valor_ipva", ipva)
        intent.putExtra("valor_parcela", parcela)
        startActivity(intent)

    }
}