package di

import adapter.ClothesAdapter
import data.DataSource
import data.DataSourceImpl
import data.RepositoryImpl
import domain.Repository
import domain.UseCase
import domain.UseCaseImpl

object DI {
    private fun injectDataSource(): DataSource = DataSourceImpl()
    private fun injectRepository(): Repository = RepositoryImpl(dataSource = injectDataSource())
    private fun injectUseCase(): UseCase = UseCaseImpl(repository = injectRepository())
    fun injectAdapter(): ClothesAdapter =ClothesAdapter(useCase = injectUseCase())
}