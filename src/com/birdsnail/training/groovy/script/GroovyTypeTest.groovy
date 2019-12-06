package com.birdsnail.training.groovy.script

println("hello world")

def s = "hello world"
println "\$s"
println "$s"
// 单引号是字符串
println '$s'

println s
println s.class

s= 1
println s.class

s= 1.0
println s.class

s= 1.00
println s.class

s= true
println(s.class)