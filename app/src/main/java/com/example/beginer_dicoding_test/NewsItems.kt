package com.example.beginer_dicoding_test

object NewsItems {
    private val newsTitle= arrayOf(
        "Tanpa Merah Putih, Evan Dimas Menangis Saat Nyanyikan Indonesia Raya - CNN Indonesia",
        "Mengenang Skuad Barcelona Terakhir Kali Bermain Di Piala UEFA/Liga Europa Sebelum 2022, Siapa Saja? - Goal.com",
        "Dua Mantan Persib Diskusikan Kekalahan Maung Bandung dari Persebaya, Firman Utina: Jarang Makan Gorengan - PRFM News - PRFMNews",
        "Max Biaggi: Valentino Rossi adalah Pilar Terakhir dari Generasi Saya - Bola.net",
        "Perjuangan Chelsea Makin Berat, Azpilicueta Minta Rekan-rekannya Terima Kenyataan - Gilabola.com",
        "Mengejutkan! Media Korsel Sebut Cuma Timnas Indonesia yang Bisa Gagalkan Vietnam Juara Piala AFF 2020 - Bola Okezone",
        "Eks Asisten Luis Milla Puji Skuat Timnas Indonesia di Piala AFF 2020 - Bolasport.com",
        "Lebih Lemah dari 4 Klub, Juventus Hanya Targetkan Lolos ke Perempat Final Liga Champions - Bolasport.com",
        "Rennes: Laga Lawan Tottenham Belum Batal, Masih Tunggu UEFA - detikSport",
        "Sejarah Baru Pemain Ekspor Timnas Indonesia di Piala AFF - CNN Indonesia",

    )
    private val newsDetail= arrayOf(
        "Susunan pemain Timnas Indonesia vs Kamboja pada pertandingan Grup B Piala AFF 2021 (Piala AFF 2020) telah dirilis.",
        "Here's the full list of the leading goal scorers in the 2021-22 UEFA Champions League in the final round of group-stage matches."
    ,"Ketika dua mantan pemain Persib (M Ridwan dan Firman Utina) berdiskusi soal kekalahan Maung Bandung dari Persebaya, kuliner gorengan muncul.",
        "Max Biaggi merasa emosional saat Valentino Rossi pensiun dari MotoGP. Pasalnya, The Doctor adalah rider terakhir dari generasinya.",
        "Kapten Chelsea Cesar Azpilicueta marah saat timnya gagal bertengger di puncak klasemen Grup H Liga Champions usai ditahan imbang Zenit St Petersburg, 3-3.",
        "Media Korsel menulis hanya Timnas Indonesia yang bisa gagalkan ambisi Vietnam juara Piala AFF 2020.",
        "Mantan asisten Luis Milla, Bayu Eka Sari alias Bang Bes, memberikan pujian kepada para pemain timnas Indonesia di Piala AFF 2020.",
        "Juventus hanya menargetkan lolos ke babak perempat final Liga Champions 2021-2022 karena merasa lebih lemah dari empat klub.",
        "Pembatalan laga Tottenham Hotspur vs Rennes di Europa Conference League kabarnya dilakukan sepihak. Rennes masih ingin memainkan duel tersebut tepat waktu.",
        "Untuk pertama kali dalam sejarah, ada enam pemain 'ekspor' di dalam Timnas Indonesia saat tampil di Piala AFF 2021 (Piala AFF 2020).",


    )
    private val newsImage= intArrayOf(
        R.drawable.evan_dimas,
        R.drawable.squad_barca,
        R.drawable.emmm,
        R.drawable.rosi,
        R.drawable.kiper,
        R.drawable.winner,
        R.drawable.juve,
        R.drawable.totenham,
        R.drawable.toss,
        R.drawable.coach
    )
    private val authorNews= arrayOf(
        "Tri Indriawati",
        "Ramdani Bur",
        "Alif Mardiansyah",
        "Adhi Prasetya",
        "Murniati",
        "Ramdani Bur",
        "Ramdani Bur",
        "Setiawati",
        "Alif Mardiansyah",
        "Murniati"
    )
    val listData:ArrayList<News>
    get() {
        val list = arrayListOf<News>()
        for (position in newsTitle.indices) {
            val news = News()
            news.name = newsTitle[position]
            news.detail = newsDetail[position]
            news.image = newsImage[position]
            news.author= authorNews[position]
            list.add(news)
        }
        return list
    }
}