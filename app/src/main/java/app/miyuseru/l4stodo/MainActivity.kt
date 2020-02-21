package app.miyuseru.l4stodo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_create.*
import kotlinx.android.synthetic.main.activity_main.*
import app.miyuseru.l4stodo.CreateActivity as CreateActivity1


class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(realmConfig)




        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        listView.adapter = adapter



        // Button（IDがbutton）をタップされた際の処理
        button1.setOnClickListener {
            startActivity(Intent(this, app.miyuseru.l4stodo.CreateActivity::class.java))
        }

        val title = CreateActivity1(titleText.toSoring())

    }


}
