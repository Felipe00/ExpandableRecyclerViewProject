package io.felipe.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayout.VERTICAL

        workerList.adapter = WorkerAdapter(getWorkerList())
        workerList.layoutManager = layoutManager
    }

    private fun getWorkerList(): List<Worker> {
        val list: MutableList<Worker> = ArrayList()
        list.add(Worker("Felipe Costa", "Just a Developer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."))
        list.add(Worker("Peter Parker", "Student", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."))
        list.add(Worker("Tony Stark", "Eu? Eu Sou o Homem De Ferro", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."))
        list.add(Worker("Hulk", "Hulk SMASH!", "Lorem ipsum dolor sit amet"))
        list.add(Worker("Doctor Strange", "Doctor Surgeon", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."))
        list.add(Worker("Clark Kent", "Reporter", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."))
        list.add(Worker("Bruce Wayne", "I'm Rich B!tch", "Cadê o Coringa? >:P"))
        list.add(Worker("Doctor Xavier", "Android Developer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam."))
        list.add(Worker("Magneto", "Good Villain", "..."))
        return list
    }
}
