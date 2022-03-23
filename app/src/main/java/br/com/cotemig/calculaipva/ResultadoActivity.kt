package br.com.cotemig.calculaipva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.NumberFormat
import java.util.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var ipva = intent.getDoubleExtra("valor_ipva", 0.0)
        var parcela = intent.getDoubleExtra("valor_parcela", 0.0)

        var valorIpva = findViewById<TextView>(R.id.valorIpva)
        var valorParcela = findViewById<TextView>(R.id.valorParcela)

        var f = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-br"))

        valorIpva.text = f.format(ipva)
        valorParcela.text = f.format(parcela)

    }
}