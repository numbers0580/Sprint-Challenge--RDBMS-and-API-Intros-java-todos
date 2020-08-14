package com.lambdaschool.todos.services;

import com.lambdaschool.todos.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "todosService")
public class TodosServiceImpl implements TodosService {
    @Autowired
    TodosRepository todosrepos;

    @Override
    public void markComplete(long todoid) {
        //
    }
}
