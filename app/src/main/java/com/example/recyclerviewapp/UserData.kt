package com.example.recyclerviewapp

object UserData {
    private val userName = arrayOf(
        "Jeff Bezos",
        "Mark Zuckerberg",
        "Nadiem Makarim",
        "Steve Jobs",
        "Bob Sadino"
    )

    val fotoUser = intArrayOf(
        R.drawable.foto_profile_1,
        R.drawable.foto_profile_2,
        R.drawable.foto_profile_3,
        R.drawable.foto_profile_4,
        R.drawable.foto_profile_5
    )

    private val emailUser = arrayOf(
        "jeffbezos@gmail.com",
        "markzuckerberg@yahoo.com",
        "nadiemmakarim@gmail.com",
        "stevejobs@gmail.com",
        "bobsadino@gmail.com"
    )

    private val semesterUser = intArrayOf(
        8,
        7,
        6,
        4,
        2,
    )

    private val majorUser = arrayOf(
        "Teknik Elektro dan Komputer",
        "Ilmu Komputer dan Psikologi",
        "Hubungan Internasional",
        "Seni",
        "Bisnis"
    )

    val listData: ArrayList<ItemsViewModel>
        get() {
            val list = arrayListOf<ItemsViewModel>()
            for (position in userName.indices) {
                val user = ItemsViewModel()
                user.image = fotoUser[position]
                user.name = userName[position]
                user.email = emailUser[position]
                user.semester = semesterUser[position]
                user.major = majorUser[position]
                list.add(user)
            }
            return list
        }
}