package io.felipe.app

import android.os.Build
import android.support.v7.widget.RecyclerView
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_layout.view.*

/**
 * Created by felipe on 05/04/18.
 */
class WorkerAdapter(private val list: List<Worker>) : RecyclerView.Adapter<WorkerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val worker = list[position]
        holder?.let {
            holder.bindView(worker)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(worker: Worker) {
            val name = itemView.name
            val job = itemView.job
            val comment = itemView.comment
            val expand = itemView.expand
            val rootLayout = itemView.root_layout
            val invisibleContent = itemView.invisible_content

            name.text = worker.name
            job.text = worker.job
            comment.text = worker.comment
            expand.setOnClickListener {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(rootLayout)
                }
                expand.setImageResource(if (invisibleContent.visibility == GONE) R.drawable.ic_arrow_upward else R.drawable.ic_arrow_downward)
                invisibleContent.visibility = if (invisibleContent.visibility == GONE) VISIBLE else GONE
            }
        }
    }
}