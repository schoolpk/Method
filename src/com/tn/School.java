package com.tn;

public class School {
    public int sum(int num1, int num2){
        System.out.println("Run is sum");
        System.out.println("Num: " + num1);
        System.out.println("Num: " + num2);

        int result = num1 + num2;
        return result;
    }

    public int multip(int a, int b){
        System.out.println("Run is multip");
        System.out.println("Num: " + a);
        System.out.println("Num: " + b);
        int multiple = a * b;
        return multiple;
    }

    public float divi(float c, float d){
        System.out.println("Run is chia");
        System.out.println("Num: " + c);
        System.out.println("Num: " + d);
        float division = c / d;
        return division;
    }

    // tạo 1 method truyền vào firts name, last name in ra full name. Nếu first name hoặc last name trống , trả về thông báo trống

    public String getFullName(String firtsname, String lastname){
        System.out.println("Run is fullname");
        if (firtsname.trim().equals("") || lastname.trim().equals("")) {
            return "firtsname or lastname isn't empty";
        }
        String fullName = firtsname + " " + lastname;

        return fullName;
    }
}
