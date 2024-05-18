package com.example.fintrack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fintrack.Data.Expense

// funcao do adapter: adaptacao entre data class e o item layout
// recyclerView : recicla os itens para salvar memoria
class ExpenseListAdapter :


    ListAdapter<Expense, ExpenseListAdapter.ExpenseListViewHolder>(ExpenseDiffUtils()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.id.rv_list, parent, false)
        return ExpenseListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ExpenseListViewHolder, position: Int) {
    }


    // view holder: view que segura os dados p/ mostrar pro usuario(nome, telefone)
    class ExpenseListViewHolder(view: View) : RecyclerView.ViewHolder(view) {


    }

    //compara mudanca na lista (atualizada)
    class ExpenseDiffUtils : DiffUtil.ItemCallback<Expense>() {
        override fun areItemsTheSame(oldItem: Expense, newItem: Expense): Boolean {
            return oldItem == newItem

        }

        override fun areContentsTheSame(oldItem: Expense, newItem: Expense): Boolean {
            return oldItem.name == newItem.name
        }

    }

}
