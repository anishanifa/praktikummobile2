// Anis Hanifa
// 2010817320010
// NIM 0/1 Tema Pekerjaan

package com.example.jobrecycleview.model

interface inter_job {
    fun GetImage(): Int;
    fun GetJob(): String;
    fun GetAnnual(): String;
    fun GetHourly(): String;
}

abstract class Pekerjaan : inter_job
{
    protected abstract val _name:  String;
    protected abstract val _annual: String;
    protected abstract val _hourly: String;
    protected abstract val _image: Int;
}

class Work (
    name: String,
    annual: String,
    hourly: String,
    image: Int = 0) : Pekerjaan()
{
    override val _name: String;
    override val _annual: String;
    override val _hourly: String;
    override val _image: Int;

    init {
        _name = name;
        _annual = annual;
        _hourly = hourly
        _image = image;
    }

    override fun GetJob(): String {
        return _name;
    }

    override fun GetAnnual(): String {
        return _annual
    }

    override fun GetHourly(): String {
        return _hourly
    }

    override fun GetImage(): Int {
    return _image;
    }
}
