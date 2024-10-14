package com.example.kotlinbasic.day04

// 코틀린
class CompanionObject {
    
    val name: String = "홍길동"
    
    // 일반 내부 클래스
    inner class Inner1 {
        val name: String = "a"
        fun example(): String {
           return name
        }
    }

    // inner 클래스가 없는 클래스는 사실상 static
    // 외부 클래스의 인스턴스와 독립적으로 존재함
    class Inner2 {
        var a: String = "a"
/*        fun example(): String {
            return name // 외부 클래스에 접근 불가
        }*/
    }

    // 코틀린에서는 static 키워드가 없어서 static 메서드 표현 companion object 안에서 생성
    // companion = static
    // object = 싱글톤
    companion object {
        fun method() {
            // static 메서드임
        }
    }
}

fun main() {
    val a = CompanionObject().Inner1() // 일반 내부 클래스 객체 생성
    // CompanionObject의 인스턴스와 무관하게 접근할 수 있으므로 ()를 붙이지 않고 사용 가능
    val b = CompanionObject.Inner2() // static 내부 클래스 객체 생성
    CompanionObject.method() // static 메서드
}