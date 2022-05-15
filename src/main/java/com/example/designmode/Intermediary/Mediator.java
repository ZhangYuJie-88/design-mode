package com.example.designmode.Intermediary;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-mode</h3>
 * <p>中介者</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-05-15 14:40
 **/

public class Mediator {
    private static List<Student> maleStudents = new ArrayList<>();
    private static List<Student> femaleStudents = new ArrayList<>();

    public static void add(Student student) {
        if ("male".equals(student.getSex())) {
            maleStudents.add(student);
        } else {
            femaleStudents.add(student);
        }
    }

    public static void sendMessageToAll(Student student, String message) {
        for (Student stu : maleStudents) {
            if (student.getName().equals(stu.getName())) {
                continue;
            }
            stu.receiveMessage(student.getName() + ":" + message);
        }
        for (Student stu : femaleStudents) {
            if (student.getName().equals(stu.getName())) {
                continue;
            }
            stu.receiveMessage(student.getName() + ":" + message);
        }
    }

    public static void sendMessageToSameSex(Student student, String message) {
        List<Student> tempList = "male".equals(student.getSex()) ? maleStudents : femaleStudents;
        for (Student stu : tempList) {
            if (student.getName().equals(stu.getName())) {
                continue;
            }
            stu.receiveMessage(student.getName() + ":" + message);
        }
    }

}
