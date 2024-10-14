package com.example.kotlinbasic.day02;

// 코틀린에서 파일(패키지)명과 클래스명이 반드시 일치해야 하는 것은 아니다
class Person {

    var name: String ="홍길동"
    var age: Int? = null // 코틀린은 반드시 초기값이 지정이 되어야 함
    lateinit var addr: String // 초기값 미루기 - 나중에 초기화 해야함
    val pay: Int by lazy { // 변수를 초기화 하면서 실행시킬 구문이 있다면 by lazy - val 변수만 됨
        println("hello world")
        10 // 10을 초기화
    }
    fun info() {
        println("$name 입니다")
    }

}

fun main() {
    val p = Person() // 객체 생성
    println(p.name)
    p.info()
    
    p.addr = "서울시"
    println(p.addr) // lateinit 변수는 반드시 초기화 후에 사용되어야 함
    
    println( p.pay ) // 초기화는 한 번만 실행됨, 한 번 이후에 Hello World는 실행되지 않고 이미 초기화된 pay 값인 10만 출력된다.
    println( p.pay )
}
