package com.birdsnail.training.groovy.script

def str = ["java", "groovy", "flink"]
str.each({
    println it
})

str.each {value -> println value}

def excite = {word ->
    return "${word}!!"
}
println excite("hello")

def excite1 = {"hello groovy"}
println(excite1.call())
