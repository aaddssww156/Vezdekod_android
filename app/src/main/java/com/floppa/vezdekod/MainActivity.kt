package com.floppa.vezdekod

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.floppa.vezdekod.ui.theme.VezdekodTheme
import com.floppa.vezdekod.ui.theme.models.Goods
import com.floppa.vezdekod.ui.theme.screens.Navigation
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VezdekodTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Navigation()
                }
            }
        }

        val jsonFileString = readJSONFile(this, "Goods_file.json")
        val gson = Gson()
        val listGoodsType = object: TypeToken<List<Goods>>() {}.type
        val goods: List<Goods> = gson.fromJson(jsonFileString, listGoodsType)
        //val goods
        //private fun AssetManager.readAssetsFile(fileName: String): String = open(fileName).bufferedReader().use {it.readText()}
    }


    private fun readJSONFile(context: Context, fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }

        return jsonString
    }
}
