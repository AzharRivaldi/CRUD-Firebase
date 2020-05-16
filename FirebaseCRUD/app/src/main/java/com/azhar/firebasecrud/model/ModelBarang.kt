package com.azhar.firebasecrud.model

class ModelBarang {

    var key: String? = null
    var nama: String? = null
    var merk: String? = null
    var harga: String? = null

    constructor() {}

    constructor(namaBarang: String?, merkBarang: String?, hargaBarang: String?) {
        nama = namaBarang
        merk = merkBarang
        harga = hargaBarang
    }
}