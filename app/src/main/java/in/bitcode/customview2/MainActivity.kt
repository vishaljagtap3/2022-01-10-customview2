package `in`.bitcode.customview2

import `in`.bitcode.customview2.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    private lateinit var btnExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)

        /*btnExit = ExitButton(this)
        setContentView(btnExit)*/


        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.txtTitle.text = "BitCode Custom View Demo"

        activityMainBinding.chkExitState.setOnCheckedChangeListener { buttonView, isChecked ->

            activityMainBinding.btnExit.exitable = isChecked

            /*if(isChecked == true) {
                activityMainBinding.btnExit.exitable = true
            }
            else {
                activityMainBinding.btnExit.exitable = false
            }*/

        }


        //way 1
        /*activityMainBinding.txtTitle.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(v: View?) {

                }
            }
        )*/

        //way 2
        //activityMainBinding.txtTitle.setOnClickListener( TxtTitleClickListener() )

        /*activityMainBinding.txtTitle.setOnClickListener {
            Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_LONG).show()
        }*/

    }

    class ChkListener : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        }
    }

    private inner class TxtTitleClickListener : View.OnClickListener {
        override fun onClick(v: View?) {

        }
    }
}