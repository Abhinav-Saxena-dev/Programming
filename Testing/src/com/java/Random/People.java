package com.java.Random;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class People {
    enum Gender {
        MAN,
        WOMAN;
    }

    private String name;
    private int age;
    private Gender gender;

    public People(String name, int age, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{name="+this.name+", age="+this.age+", gender=" + this.gender+"}";
    }
}

class Implementation {
    public List<People> liableForMilitaryService(List<People> list) {
        List<People> list1 = new ArrayList<People>();
        Iterator<People> it = list.iterator();
        for(People p : list){
            if(p.getGender() == (People.Gender.MAN)) {
                if(p.getAge() >= 18 && p.getAge() <= 27) {
                    list1.add(p);
                }
            }
        }
        return list1;
    }

    public People findNameWithAge(List<People> list, String name, int age){
        for(People p : list){
            if(p.getName().equals(name) && p.getAge() == age){
                return p;
            }
        }
        return null;
    }
}

class Source{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        People people = new People("Bhaga", 27, People.Gender.valueOf("man".toUpperCase()));
        People people2 = new People("Jhaga", 17, People.Gender.valueOf("man".toUpperCase()));
        People people3 = new People("NAGA", 19, People.Gender.valueOf("man".toUpperCase()));
        People people4 = new People("ri", 28, People.Gender.valueOf("woman".toUpperCase()));

        List<People> list = new ArrayList<People>();
        list.add(people);
        list.add(people2);
        list.add(people3);
        list.add(people4);

        Implementation obj = new Implementation();
        System.out.println(obj.liableForMilitaryService(list));
        System.out.println(obj.findNameWithAge(list, "ri", 28));

    }
}