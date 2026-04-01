package com.serah.sokohub.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.serah.sokohub.ui.theme.Darkbrown

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        TopAppBar(
            title = { Text(text = "Home") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },

            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Cart"
                    )
                }

                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications"
                    )
                }
            },

                    colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Darkbrown,

            titleContentColor = androidx.compose.ui.graphics.Color.White,
            navigationIconContentColor = androidx.compose.ui.graphics.Color.White,
            actionIconContentColor = androidx.compose.ui.graphics.Color.White
        )




















        )

























    }










}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()



}

