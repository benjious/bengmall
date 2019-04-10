package com.vb.seckillserver.entity.seckill;

import java.util.List;

public class StudentWithList {
    private int id ;
    private String name ;
    private int teacherId;
    private List<Teacher> teachers;

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "StudentWithList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherId=" + teacherId +
                ", teachers=" + teachers +
                '}';
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
