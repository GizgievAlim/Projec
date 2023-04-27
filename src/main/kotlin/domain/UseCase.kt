package domain

import models.СlothesType

interface UseCase {
    fun getClothesById(id :Long)
    fun getClothesByType(view :СlothesType)
    fun getClothesCount(view:СlothesType) :Int
}
