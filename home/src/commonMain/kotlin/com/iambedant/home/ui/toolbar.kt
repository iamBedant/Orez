package com.iambedant.home.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iambedant.icons.Logo
import com.iambedant.icons.OrezIcons
import com.iambedant.icons.Search
import com.iambedant.theme.OrezColors

@Composable
fun ToolBar(){
    Row(
        Modifier.fillMaxWidth().background(OrezColors.primaryColorDarkBlue).padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = OrezIcons.Logo,
            contentDescription = "Logo",
            tint = Color.Unspecified,
            modifier = Modifier.height(40.dp)
        )
        Spacer(Modifier.width(12.dp))
        Text(
            "O  R  E  z",
            fontSize = 20.sp,
            fontWeight = FontWeight.Black,
            color = OrezColors.secondaryColorYellowLight
        )
        Spacer(Modifier.weight(1F))
        Icon(
            imageVector = OrezIcons.Search,
            contentDescription = "Search",
            modifier = Modifier.clip(CircleShape).clickable { }.size(48.dp).padding(8.dp),
            tint = Color.White,
        )
    }
}