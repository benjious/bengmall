package com.vb.seckillserver.entity.seckill;


public class StudentWithTeacher {
    private int id ;
    private String name ;
    private Teacher teacher;
    private int teacherId;

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "StudentWithTeacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", teacherId=" + teacherId +
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
