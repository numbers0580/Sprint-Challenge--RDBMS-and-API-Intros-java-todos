package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodosRepository;
import com.lambdaschool.todos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "todosService")
public class TodosServiceImpl implements TodosService {
    @Autowired
    TodosRepository todosrepos;

    @Autowired
    UserRepository userrepos;

    @Override
    public void markComplete(long todoid) {
        //
    }

    @Override
    public Todos save(Todos todos) {
        return null;
    }
}
