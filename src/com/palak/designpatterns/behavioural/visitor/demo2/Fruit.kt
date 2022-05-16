package com.palak.designpatterns.behavioural.visitor.demo2

data class Fruit(
    val fruitName: String = "",
    val totalKG: Double = 0.0,
    var price: Double = 0.0
) : Visitable<Any> {
    override fun accept(visitor: Visitor<*>?) {
        visitor?.visit(this)
    }
}