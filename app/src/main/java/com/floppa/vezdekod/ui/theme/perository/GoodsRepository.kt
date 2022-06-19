package com.floppa.vezdekod.ui.theme.perository

import android.content.Context
import android.content.res.AssetManager
import com.floppa.vezdekod.ui.theme.models.Goods
import java.io.IOException
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class GoodsRepository {
    fun getAllData(): List<Goods> {
        return listOf(
            Goods(
                id = 0,
                category_id = 0,
                name = "Test_name1",
                description = "Test_description1",
                image = "image_1.jpg",
                price_current = 100,
                price_old = null,
                measure = 10,
                measure_unit = "г.",
                energy_per_100_grams = 100.1f,
                proteins_per_100_grams = 100.1f,
                fats_per_100_grams = 100.1f,
                carbohydrates_per_100_grams = 100.1f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
            Goods(
                id = 1,
                category_id = 1,
                name = "Test_name2",
                description = "Test_description2",
                image = "image_1.jpg",
                price_current = 200,
                price_old = null,
                measure = 20,
                measure_unit = "г.",
                energy_per_100_grams = 100.2f,
                proteins_per_100_grams = 100.2f,
                fats_per_100_grams = 100.2f,
                carbohydrates_per_100_grams = 100.2f,
                tag_ids = null
            ),
        )
    }

    lateinit var goodsLists: List<Goods>
    fun setGoodsList(goods: List<Goods>) { goodsLists = goods}
    @JvmName("getGoodsLists1")
    fun getGoodsLists(): List<Goods> = goodsLists
}

