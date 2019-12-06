package com.birdsnail.training.groovy.script

def repeat(val) {
    for (i = 0; i < 5; i++) {
        println val
    }
}

repeat("hello world")

def repeat1(val) {
    for (i in 0..5) {
        println(val)
    }
}

repeat1("hello")

def repeat2(val, repeat2 = 3) {
    for (i in 1..repeat2) {
        println(val)
    }
}
repeat2("hello groovy")
repeat2("groovy", 1)
repeat2("proud", 2)