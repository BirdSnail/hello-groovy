package com.birdsnail.training.groovy.script


def range = 0..4
println range.class
assert range instanceof List

// 转成字节码后，都是Java集合框架下面的实例
def name = ["zhangsan", "lisi", "wnagwu"]
println name.class
assert name instanceof Collection
assert name instanceof ArrayList

//  增删改查操作
def name1 = ["lisi", "zhaoliu", "yanghuadong"]
println name1
name1.add("aolafu")
name1 << "kapai"
name1[6] = "guafu"
println name1

def nums = [1, 2, 3, 4]
// 返回的是一个新的实例，原先的集合不会受到改变
println(nums - 1)
println(nums + 5)
def numsModify = nums - [1, 2]
println numsModify
println numsModify + [5, 6]
println numsModify

// 转成string，并指定拼接的字符
println("-----------spread operator--------------")
def num2 = [1, 2, 3, 4]
println num2.join("==")
println((num2 + 4).count(4))

def words = ["java", "maven", "groovy"]
println words*.toUpperCase()
println words
println(words.join("@"))
