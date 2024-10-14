package com.example.kotlinbasic.day04;

interface Example {
    void example(); // 추상메서드
}

public class AnonymousJava {

    public static void main(String[] args) {
        // 익명 클래스, 익명 객체
        // 원래 인터페이스는 객체로 생성할 수 없지만 내부에 추상메서드의 오버라이드를 하면 가능
        Example e = new Example() {
            @Override
            public void example() {
                System.out.println("hello world");
            }
        };

        e.example();
    }
}
