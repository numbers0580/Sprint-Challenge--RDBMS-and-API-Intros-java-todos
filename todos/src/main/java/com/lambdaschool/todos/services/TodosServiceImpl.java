package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodosRepository;
import com.lambdaschool.todos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService {
    @Autowired
    TodosRepository todosrepos;

    @Autowired
    UserRepository userrepos;

    @Transactional
    @Override
    public void markComplete(long todoid) {
        todosrepos.findById(todoid).get().setCompleted(true);
    }

    @Override
    public Todos save(Todos todos) {
        return null;
    }
}
