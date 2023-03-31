package com.whyelab;


interface Student3 {
    public void data();

}

class avi implements Student3 {
    public void data() {
        String name = "avinash";
        int rollno = 68;
        System.out.println(name);
        System.out.println(rollno);
    }
}

public class inter_face {
    public static void main(String args[]) {
        avi h = new avi();
        h.data();
    }
}
