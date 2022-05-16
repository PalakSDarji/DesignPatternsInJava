package com.palak.designpatterns.behavioural.visitor.demo2

class PriceDiscountVisitor : Visitor<Any> {
    override fun visit(visitable: Visitable<Any>?) {
        when (visitable) {
            is Book -> {
                if(visitable.price > 3){
                    visitable.price -= 1
                }
            }
            is Fruit -> {
                //fruits are considered under discount per kg.
                if(visitable.totalKG > 4){
                    visitable.price -= 1
                }
            }
        }
    }
}