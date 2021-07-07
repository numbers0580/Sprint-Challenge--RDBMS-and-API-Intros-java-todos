package com.lambdaschool.todos.views;

import com.lambdaschool.todos.models.Todos;

import java.util.List;

public interface UserNameCountTodos
{
    String getUsername();
    List<Todos> getTodos();
    //String getDescription();
}
