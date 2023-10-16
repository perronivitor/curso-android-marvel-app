package com.example.testing.model

import com.example.core.domain.model.Character
import com.example.testing.model.CharactersFactory.Hero.ABom
import com.example.testing.model.CharactersFactory.Hero.ThreeDMan

class CharactersFactory {

    fun create(hero: Hero) = when (hero) {
        ThreeDMan -> Character(
            "3-D Man",
            "https://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784/standard_incredible.jpg"
        )

        ABom -> Character(
            "A-Bomb (HAS)",
            "https://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784/standard_incredible.jpg"
        )
    }

    sealed class Hero {
        object ThreeDMan : Hero()
        object ABom : Hero()
    }
}
