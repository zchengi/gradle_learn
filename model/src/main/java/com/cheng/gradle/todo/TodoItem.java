package com.cheng.gradle.todo;

/**
 * @author cheng
 *         2018/10/24 16:31
 */
public class TodoItem {

    /**
     * 待办事项名称
     */
    private String name;

    /**
     * 已完成
     */
    private boolean hasDown;

    @Override
    public String toString() {
        return name + (hasDown ? " hanDown" : " need to do") + "!";
    }

    public TodoItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
