package domain

import models.СlothesType

class UseCaseImpl (private val repository: Repository) :UseCase{
    override fun getClothesById(id :Long){
    }
    override fun getClothesByType(view : СlothesType){

    }
    override fun getClothesCount(view: СlothesType) :Int{
        return 1
    }
}