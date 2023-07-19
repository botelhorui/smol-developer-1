```java
package com.todoapp.repository;

import com.todoapp.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jdbc.repository.query.Query;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    @Query("SELECT * FROM todo WHERE id = :id")
    Todo findTodoById(@Param("id") Long id);

    @Query("INSERT INTO todo (title, completed) VALUES (:title, :completed)")
    void saveTodo(@Param("title") String title, @Param("completed") Boolean completed);

    @Query("UPDATE todo SET title = :title, completed = :completed WHERE id = :id")
    void updateTodo(@Param("id") Long id, @Param("title") String title, @Param("completed") Boolean completed);

    @Query("DELETE FROM todo WHERE id = :id")
    void deleteTodo(@Param("id") Long id);
}
```