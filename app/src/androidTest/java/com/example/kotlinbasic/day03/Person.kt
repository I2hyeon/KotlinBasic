package com.example.kotlinbasic.day03

// 코틀린 클래스는 기본이 final 클래스라서 상속을 허용하려면 open을 붙입니다
open class Person(val name: String, val age: Int) {

    open fun info() {
        println("부모님 메서드 info")
    }

}

// 서브클래스가 슈퍼클래스의 주생성자를 호출하려면, 슈퍼클래스에서 요구하는 매개변수를 반드시 제공해야 함
// name과 age가 Student의 생성자로 전달되고, 이것이 다시 Person의 생성자로 전달되는 구조
class Student(name: String, age: Int): Person(name, age)  {
    override fun info() {
        println("자식의 오버라이드 한 메서드 info")
    }

    // 오버로딩
    fun abc() {}
    fun abs(a: Int) {}
}

fun main() {

    val s = Student("홍길동", 20)

    println(s.name)
    println(s.age)
    s.info()
}