package adapter

import domain.UseCase

class ClothesAdapter(private val useCase: UseCase) {
    fun getClothesId(id :Long) = useCase.getClothesById(id)
}