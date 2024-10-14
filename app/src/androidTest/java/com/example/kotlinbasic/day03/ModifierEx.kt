package com.example.kotlinbasic.day03

class ModifierEx {

    var a: Int = 0 // 기본으로 public 선언이 들어감 - 어디서나 호출 가능
    private var b: Int = 0 // 해당 클래스 내부에서만 사용 가능
    protected var c: Int = 0 // 해당 클래스 내부와 자식 클래스에서 접근 가능
    internal var d: Int = 0 // 같은 모듈 안에서만 접근 가능
}