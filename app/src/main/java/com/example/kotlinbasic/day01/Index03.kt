package com.example.kotlinbasic.day01

import java.util.Arrays
import kotlin.math.ln

fun main() {

    // 3가지의 유형의 배열
    // 1. Array
    // 2. 불변 list
    // 3. ArrayList

    // 1-1. Array
    var arr1 = arrayOf(1, 2, 3)
    var arr2 = arrayOf(1, "홍길동", "이순신") // 다른 타입도 저장이 가능
    var arr3 = arrayOf<Int>(1, 2, 3) // 숫자 타입의 배열 선언은 제네릭을 붙여주면 된다

    arr1[0] = 100 // 배열의 사용

    // 1-2. Array 2번째 방법
    val arr4 = Array(10, {i -> i + 1}) // 크기, 초기값

    println(Arrays.toString(arr1))
    println(Arrays.toString(arr2))
    println(Arrays.toString(arr3))
    println(Arrays.toString(arr4))

    println("----------------------------------------------------")

    // 2. 불변 listof -> 값의 변경은 불가능하고, 사용만 가능한 리스트
    val arr5 = listOf(1, 2, 3)
    val arr6 = listOf<String>("a","b","c")
//    arr5[0] = 100 // err

    println("----------------------------------------------------")

    // 3. arrayListOf -> 자바 ArrayListof와 같음(동적 배열 생성)
    val list = arrayListOf<Int>()
    val list2 = arrayListOf(1,2,3)

    list.add(1) // 값 추가
    list.add(2)

    val x = list[0] // 값 조회
    val y = list.get(0) // 값 조회

}