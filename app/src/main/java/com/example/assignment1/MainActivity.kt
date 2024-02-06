package com.example.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1.ui.theme.Assignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AssignmentLayout()
                }
            }
        }
    }
}

@Composable
fun AssignmentLayout(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFBBD4BB))
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = stringResource(R.string.android_logo),
            modifier = Modifier
                .width(125.dp)
                .height(125.dp)
                .background(color = Color(0xFF002C3F))
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Text(
            text = stringResource(R.string.title_name),
            fontSize = 40.sp,
            lineHeight = 40.sp,
            color = Color(0xFF002C3F)
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Text(
            text = stringResource(R.string.subtitle),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 20.sp,
            color = Color(0xFF106D40)
        )
    }

    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Filled.Phone,
                    contentDescription = stringResource(R.string.icon_desc1),
                    tint = Color(0xFF106D40)
                )

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Text(
                    text = stringResource(R.string.icon_content1),
                    fontSize = 15.sp,
                    color = Color(0xFF002C3F)
                )
            }

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Filled.Share,
                    contentDescription = stringResource(R.string.icon_desc2),
                    tint = Color(0xFF106D40)
                )

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Text(
                    text = stringResource(R.string.icon_content2),
                    fontSize = 15.sp,
                    color = Color(0xFF002C3F)
                )
            }

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Filled.Email,
                    contentDescription = stringResource(R.string.icon_desc3),
                    tint = Color(0xFF106D40)
                )

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Text(
                    text = stringResource(R.string.icon_content3),
                    fontSize = 15.sp,
                    color = Color(0xFF002C3F)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AssignmentLayoutPreview() {
    Assignment1Theme {
        AssignmentLayout()
    }
}