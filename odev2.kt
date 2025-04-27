package com.example.kotlin.odevlerim

fun main() {
    val kenarSayisi = 5
    println("İç Açılar Toplamı: ${icAciToplami(kenarSayisi)}°")

    val gunSayisi = 25
    println("Toplam Maaş: ${maasHesapla(gunSayisi)} ₺")

    val kota = 70
    println("İnternet Ücreti: ${kotaUcretiHesapla(kota)} ₺")

    val derece = 25
    println("Fahrenheit: ${dereceyiFahrenheitCevir(derece)}°F")

    val kenar1 = 10
    val kenar2 = 20
    println("Dikdörtgen Çevresi: ${dikdortgenCevresi(kenar1, kenar2)}")

    val sayi = 5
    println("Faktöriyel: ${faktoriyelHesapla(sayi)}")

    val kelime = "Ankara"
    println("a harfi sayısı: ${aHarfiniSay(kelime)}")
}

// 1. Dereceyi Fahrenheit'a çeviren metod
fun dereceyiFahrenheitCevir(celsius: Int): Double {
    return celsius * 1.8 + 32
}

// 2. Dikdörtgen çevresini hesaplayan metod
fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
    return 2 * (kisaKenar + uzunKenar)
}

// 3. Faktoriyel hesaplayan metod
fun faktoriyelHesapla(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

// 4. Kelime içinde kaç adet 'a' harfi olduğunu bulan metod
fun aHarfiniSay(kelime: String): Int {
    var sayac = 0
    for (harf in kelime.lowercase()) {
        if (harf == 'a') {
            sayac++
        }
    }
    return sayac
}

// 5. Kenar sayısına göre iç açılar toplamı hesaplayan metod
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// 6. Gün sayısına göre maaş hesabı yapan metod
fun maasHesapla(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiUcret = 20
    val calismaSaati = gunSayisi * 8

    return if (calismaSaati <= 160) {
        calismaSaati * saatlikUcret
    } else {
        val mesaiSaati = calismaSaati - 160
        (160 * saatlikUcret) + (mesaiSaati * mesaiUcret)
    }
}

// 7. Kota miktarına göre internet ücreti hesaplayan metod
fun kotaUcretiHesapla(kota: Int): Int {
    return if (kota <= 50) {
        100
    } else {
        val asimMiktari = kota - 50
        100 + (asimMiktari * 4)
    }
}
