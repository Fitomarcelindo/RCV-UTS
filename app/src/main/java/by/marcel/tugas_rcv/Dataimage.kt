package by.marcel.tugas_rcv

object Dataimage {
    private val OSjudul = arrayOf(
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",
        "bakso",

        )

    private val OSdetail = arrayOf(


        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bika ambon terbuat dari bahan-bahan utama pembuat kue, seperti telur, gula dan santan..",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
        " Bakso, si makanan berbentuk bulat ini terbuat dari sapi, ayam ataupun ikan.",
    )

    private val Osimage = intArrayOf(

        R.drawable.bakso,
        R.drawable.bikaambon,
        R.drawable.gadogado,
        R.drawable.gorengan,
        R.drawable.gudeg,
        R.drawable.keraktelur,
        R.drawable.nasigoreng,
        R.drawable.opor,
        R.drawable.pempek,
        R.drawable.pepes,
        R.drawable.rawon,
        R.drawable.rendang,
        R.drawable.sate,
        R.drawable.sopbuntut,
        R.drawable.soto,
    )

    val listData: ArrayList<Osmarcel>
        get() {
            val list = arrayListOf<Osmarcel>()
            for (position in OSjudul.indices){
                val marcel =  Osmarcel()
                marcel.judul = OSjudul[position]
                marcel.detail = OSdetail[position]
                marcel.foto = Osimage[position]

                list.add(marcel)
            }
            return list
        }
}