package com.example.kotlinbasic.day03

fun main() {

    // 문제 1
    // 두 개의 정수 `a`와 `b`가 주어졌을 때, 더 큰 값을 반환하는 함수를 작성하세요.
    // 조건
    // 함수 이름은 `maxNumber`로 하세요.
    // 함수는 두 개의 정수를 입력받고, 더 큰 값을 반환합니다.
    // `if-else` 문을 사용하세요.

    var a = 10
    var b = 20

    var result = maxNumber(a, b)
    println("더 큰 수는: $result")

    // 문제 2
    // nullable 타입의 문자열 `name`을 선언하세요.
    // name 변수가 null이 아닐 때만, "Hello, {name}"을 출력하세요.
    // name 변수가 null이면 아무 출력도 하지 마세요.
    // let 함수를 사용하여 이 문제를 해결하세요.

    val name: String? = null

    name?.let {
        println("Hello, $name")
    }

    // 문제 3
    // 각 문자열을 반복하여 출력한다.
    // 문자열의 길이가 4글자 이상이면 대문자로 변환한 후 출력한다.

    val words = listOf("apple", "cat", "banana", "dog")

    for (i in words) {
        if(i.length >= 4) print(i.uppercase() + " ") else print("$i ")
    }


}

fun maxNumber(a: Int, b: Int): Int {
    return if (a > b) a else b
}