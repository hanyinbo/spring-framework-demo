package com.gvn.container;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Document getDocument(String xmlPath) throws Exception {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            return db.parse(xmlPath);
        } catch (Exception e) {
            throw new Exception("");
        }
    }

    public static List<Teacher> getTeacher(String path) throws Exception {
        Document document = getDocument(path);
        List<Teacher> teacherList = new ArrayList<Teacher>();
        NodeList tNodeList = document.getElementsByTagName("teacher");
        for(int i =0 ; i<tNodeList.getLength();i++){
            Element item = (Element)tNodeList.item(i);
            Teacher teacher = new Teacher();
            teacher.setName(item.getElementsByTagName("name").item(0).getTextContent());
            teacher.setAge(Integer.valueOf(item.getElementsByTagName("age").item(0).getTextContent()));
            teacherList.add(teacher);
        }
        return teacherList;
    }

    public static void main(String[] args) throws Exception {
        List<Teacher> teacher = getTeacher("D:\\doc\\learning\\spring-framework-demo\\src\\main\\resources\\teacher.xml");
        System.out.println("解析dom:"+teacher);
    }
}