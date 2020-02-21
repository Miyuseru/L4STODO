package app.miyuseru.l4stodo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create.*

class CreateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        class CreateActivity (var titleText: String)

        fun create(view: View){
            val titleText : String = titleeditText.toString()
            val text2 : String = contenteditText.toString()



        }


       createButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

           finish()
        }


    }

}

