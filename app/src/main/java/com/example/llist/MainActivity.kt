package com.example.llist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var todoAdapter: TodoAdapter
    private val todoList = mutableListOf<Todo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTodo = findViewById<EditText>(R.id.etTodo)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val rvTodoList = findViewById<RecyclerView>(R.id.rvTodoList)

        // 어댑터 연결
        todoAdapter = TodoAdapter(todoList) { position ->
            todoList.removeAt(position)
            todoAdapter.notifyItemRemoved(position)
        }

        rvTodoList.adapter = todoAdapter
        rvTodoList.layoutManager = LinearLayoutManager(this)

        // 버튼 클릭 시 할 일 추가
        btnAdd.setOnClickListener {
            val todoText = etTodo.text.toString()
            if (todoText.isNotBlank()) {
                todoList.add(Todo(todoText))
                todoAdapter.notifyItemInserted(todoList.size - 1)
                etTodo.text.clear()
            }
        }
    }
}
