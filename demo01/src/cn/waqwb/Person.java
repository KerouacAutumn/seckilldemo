package cn.waqwb;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 7592930394427200495L;

    /*public static void main(String[] args) {
        System.out.println();
        String[] strs = {"aaa","asd","asdd"};
        for (String str : strs){
            try {
                System.out.println(str);//ctrl+alt+t
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }*/
    private  String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }
}
