package com.birdsnail.training.groovy.script


def map = [name: "yanghuadong", "age": 25]
println map.getClass()
println map
println map.age.class
// 多种赋值和取值的写法
map.size = 172
println map
map["gender"] = "male"
println map["gender"]
println map.gender

map.put("gj", "china")
println map.get("gj")
println map