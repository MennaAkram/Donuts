package com.menna.donuts.screens.home.composable

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.menna.donuts.R
import com.menna.donuts.ui.theme.Background
import com.menna.donuts.ui.theme.Primary

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
) {
    Scaffold (
        bottomBar = {
            BottomAppBar(
                containerColor = Background,
                modifier = modifier.padding(bottom = 16.dp),
                tonalElevation = 0.dp
            ) {
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Icon(painter = painterResource(R.drawable.home),
                        contentDescription = "", tint = Primary,
                        modifier = Modifier.size(32.dp))
                    })
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Icon(painter = painterResource(R.drawable.heart),
                        contentDescription = "", tint = Primary,
                        modifier = Modifier.size(32.dp))
                })
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Icon(painter = painterResource(R.drawable.notification),
                        contentDescription = "", tint = Primary,
                        modifier = Modifier.size(32.dp))
                })
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Icon(painter = painterResource(R.drawable.buy),
                        contentDescription = "", tint = Primary,
                        modifier = Modifier.size(32.dp))
                })
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Icon(painter = painterResource(R.drawable.mingcute_user),
                        contentDescription = "", tint = Primary,
                        modifier = Modifier.size(32.dp))
                })
            }
        }
    ){  PaddingValues( 8.dp)
    }
}