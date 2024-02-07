package com.example.horoscapp.domain.model

import com.example.horoscapp.R

sealed class HoroscopeInfo(val name: Int, val img: Int){

    object Aries: HoroscopeInfo(R.string.aires, R.drawable.aries)
    object Taurus: HoroscopeInfo(R.string.taurus, R.drawable.taurus)
    object Gemini: HoroscopeInfo(R.string.gemini, R.drawable.gemini)
    object Cancer: HoroscopeInfo(R.string.cancer, R.drawable.cancer)
    object Leo: HoroscopeInfo(R.string.leo, R.drawable.leo)
    object Virgo: HoroscopeInfo(R.string.virgo, R.drawable.virgo)
    object Libra: HoroscopeInfo(R.string.libra, R.drawable.libra)
    object Scorpio: HoroscopeInfo(R.string.scorpio, R.drawable.scorpio)
    object Sagittarius: HoroscopeInfo(R.string.sagittarius, R.drawable.sagittarius)
    object Capricorn: HoroscopeInfo(R.string.capricorn, R.drawable.capricorn)
    object Aquarius: HoroscopeInfo(R.string.aquarius, R.drawable.aquarius)
    object Pisces: HoroscopeInfo(R.string.pisces, R.drawable.pisces)


}
