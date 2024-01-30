package com.iambedant.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


private var _Home: ImageVector? = null

public val OrezIcons.Home: ImageVector
    get() {
        if (_Home != null) {
            return _Home!!
        }
        _Home = ImageVector.Builder(
            name = "Home",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8.12602f, 14.0002f)
                curveTo(8.5701f, 15.7255f, 10.1362f, 17.0002f, 12f, 17.0002f)
                curveTo(13.8638f, 17.0002f, 15.4299f, 15.7255f, 15.874f, 14.0002f)
                moveTo(11.0177f, 2.76424f)
                lineTo(4.23539f, 8.03937f)
                curveTo(3.782f, 8.392f, 3.5553f, 8.5683f, 3.392f, 8.7891f)
                curveTo(3.2474f, 8.9847f, 3.1396f, 9.205f, 3.074f, 9.4393f)
                curveTo(3f, 9.7038f, 3f, 9.9909f, 3f, 10.5653f)
                verticalLineTo(17.8002f)
                curveTo(3f, 18.9203f, 3f, 19.4804f, 3.218f, 19.9082f)
                curveTo(3.4097f, 20.2845f, 3.7157f, 20.5905f, 4.092f, 20.7822f)
                curveTo(4.5198f, 21.0002f, 5.0799f, 21.0002f, 6.2f, 21.0002f)
                horizontalLineTo(17.8f)
                curveTo(18.9201f, 21.0002f, 19.4802f, 21.0002f, 19.908f, 20.7822f)
                curveTo(20.2843f, 20.5905f, 20.5903f, 20.2845f, 20.782f, 19.9082f)
                curveTo(21f, 19.4804f, 21f, 18.9203f, 21f, 17.8002f)
                verticalLineTo(10.5653f)
                curveTo(21f, 9.9909f, 21f, 9.7038f, 20.926f, 9.4393f)
                curveTo(20.8604f, 9.205f, 20.7526f, 8.9847f, 20.608f, 8.7891f)
                curveTo(20.4447f, 8.5683f, 20.218f, 8.392f, 19.7646f, 8.0394f)
                lineTo(12.9823f, 2.76424f)
                curveTo(12.631f, 2.491f, 12.4553f, 2.3544f, 12.2613f, 2.3018f)
                curveTo(12.0902f, 2.2555f, 11.9098f, 2.2555f, 11.7387f, 2.3018f)
                curveTo(11.5447f, 2.3544f, 11.369f, 2.491f, 11.0177f, 2.7642f)
                close()
            }
        }.build()
        return _Home!!
    }

