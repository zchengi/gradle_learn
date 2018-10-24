package com.cheng.gradle.todo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cheng
 *         2018/10/24 18:00
 */
public class TodoRepository {

    private static Map<String, TodoItem> items = new HashMap<>();

    /**
     * 保存待办事项
     *
     * @param item
     */
    public void save(TodoItem item) {
        items.put(item.getName(), item);
        System.out.println(item);
    }

    /**
     * 查询待办事项
     *
     * @param name
     * @return
     */
    public String query(String name) {
        for (String s : items.keySet()) {
            if (s.equals(name)) {
                return name;
            }
        }

        return null;
    }
}
