package com.sebastian.pdm123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.*
import androidx.compose.material3.Surface
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.sebastian.pdm123.firstPartial.ExamenView
import com.sebastian.pdm123.firstPartial.ExamenViewModel
import com.sebastian.pdm123.ui.theme.Pdm123Theme
import com.sebastian.pdm123.navigation.NavBarItems
import com.sebastian.pdm123.navigation.NavRoutes
import com.sebastian.pdm123.secondPartial.SecondPartialView
import com.sebastian.pdm123.thirdPartial.ThirdPartialView
import com.sebastian.pdm123.firstPartial.FirstPartialView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pdm123Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { TopAppBar(title = { Text("ULSA CHIHUAHUA")})},
        content = {it
            NavigationHost(navController = navController)},
        bottomBar = { BottomNavigationBar(navController = navController)}
    )
}

/**
 * Esta funcion sera la encargadda de manejar los
 * tabs de la aplicacion
 */

@Composable
fun NavigationHost(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = NavRoutes.firstpartial.route
    ){
        composable(NavRoutes.firstpartial.route){
            FirstPartialView(navController = navController)
        }
        composable(NavRoutes.secondpartial.route){
            SecondPartialView()
        }
        composable(NavRoutes.thirdpartial.route){
            ThirdPartialView()
        }
        composable(NavRoutes.examenprimerparcial.route){
            ExamenView(navController = navController, viewModel = ExamenViewModel())
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController){
    BottomNavigation{
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route

        NavBarItems.NavBarItems.forEach{ navItem ->

            BottomNavigationItem(

                selected = currentRoute == navItem.route,
                onClick = {
                    navController.navigate(navItem.route){
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(imageVector = navItem.image,
                        contentDescription = navItem.title)
                },
                label = {
                    Text(text = navItem.title)
                }
            )

        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Pdm123Theme {
        MainScreen()
    }
}
