package uabc.edu.mx.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.navigation.NavigationView
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation_view.setNavigationItemSelectedListener(object: OnNavigationItemSelectedListener)
        override fun onNavigationItemSelected(item: MenuItem) : Boolean {
            drawer_layout.closeDrawers()

            when(item.itemId){
                R.id.page_kotlin -> {
                    web_view.loadUrl( "https://kotlinlang.org/")
                    return true
                }
                R.id.page_kotlin_reference -> {
                    web_view.loadUrl( "https://kotlinlang.org/docs/reference/")
                    return true
                }
                R.id.page_android -> {
                    web_view.loadUrl( "https://developer.android.com/index.html")
                    return true
                }
                else -> return true

            }
        }
    }
}
