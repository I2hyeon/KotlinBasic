package com.example.kotlinbasic.day03

// 추상 클래스
// 추상 변수, 추상 메서드 사용할 때 abstract 키워드를 씀
// 추상 클래스는 자식에서 오버라이딩을 강제화 시킬때 사용
abstract class AbstractEx {

    abstract var a: String
    abstract fun some() // 추상 메서드

    fun some2() {
    }
}

class Child: AbstractEx() {
    override var a: String = "홍길동"
    override fun some() {
        TODO("Not yet implemented")
    }
}