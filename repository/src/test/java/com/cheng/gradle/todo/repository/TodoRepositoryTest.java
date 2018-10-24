package com.cheng.gradle.todo.repository;

import com.cheng.gradle.todo.TodoItem;
import com.cheng.gradle.todo.TodoRepository;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author cheng
 *         2018/10/24 18:27
 */
public class TodoRepositoryTest {

    private TodoRepository todoRepository = new TodoRepository();

    @Test
    public void testSave() {

        TodoItem todoItem = new TodoItem("cheng");
        todoRepository.save(todoItem);

        // 测试失败
//        Assert.assertNull(todoRepository.query(todoItem.getName()));

        // 测试成功
        Assert.assertNotNull(todoRepository.query(todoItem.getName()));
    }
}
