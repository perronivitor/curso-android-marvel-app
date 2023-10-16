package com.example.marvelapp.framework.di

import com.example.core.usecase.base.GetCharactersUseCase
import com.example.core.usecase.base.GetCharactersUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {

    @Binds
    fun bindCharactersUseCase(useCase: GetCharactersUseCaseImpl): GetCharactersUseCase
}
