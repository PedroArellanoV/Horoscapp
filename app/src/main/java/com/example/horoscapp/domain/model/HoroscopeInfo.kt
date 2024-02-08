package com.example.horoscapp.domain.model

import com.example.horoscapp.R

sealed class HoroscopeInfo(val name: Int, val img: Int){

    data object Aries: HoroscopeInfo(R.string.aires, R.drawable.aries)
    data object Taurus: HoroscopeInfo(R.string.taurus, R.drawable.taurus)
    data object Gemini: HoroscopeInfo(R.string.gemini, R.drawable.gemini)
    data object Cancer: HoroscopeInfo(R.string.cancer, R.drawable.cancer)
    data object Leo: HoroscopeInfo(R.string.leo, R.drawable.leo)
    data object Virgo: HoroscopeInfo(R.string.virgo, R.drawable.virgo)
    data object Libra: HoroscopeInfo(R.string.libra, R.drawable.libra)
    data object Scorpio: HoroscopeInfo(R.string.scorpio, R.drawable.scorpio)
    data object Sagittarius: HoroscopeInfo(R.string.sagittarius, R.drawable.sagittarius)
    data object Capricorn: HoroscopeInfo(R.string.capricorn, R.drawable.capricorn)
    data object Aquarius: HoroscopeInfo(R.string.aquarius, R.drawable.aquarius)
    data object Pisces: HoroscopeInfo(R.string.pisces, R.drawable.pisces)


}
