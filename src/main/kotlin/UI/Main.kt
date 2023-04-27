package UI

import adapter.ClothesAdapter
import di.DI

fun main(args: Array<String>) {
    val adapter = DI.injectAdapter()
    adapter.getClothesId(10)
}