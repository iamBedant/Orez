package com.iambedant.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _Bluetooth: ImageVector? = null

public val OrezIcons.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) {
            return _Bluetooth!!
        }
        _Bluetooth = ImageVector.Builder(
            name = "Bluetooth",
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
                moveTo(2f, 7f)
                lineTo(14f, 17f)
                lineTo(8f, 22f)
                verticalLineTo(2f)
                lineTo(14f, 7f)
                lineTo(2f, 17f)
                moveTo(20.1445f, 6.5f)
                curveTo(21.2581f, 8.048f, 21.914f, 9.9474f, 21.914f, 12f)
                curveTo(21.914f, 14.0526f, 21.2581f, 15.952f, 20.1445f, 17.5f)
                moveTo(17f, 8.85724f)
                curveTo(17.6214f, 9.7481f, 17.9858f, 10.8315f, 17.9858f, 12.0001f)
                curveTo(17.9858f, 13.1686f, 17.6214f, 14.2521f, 17f, 15.143f)
            }
        }.build()
        return _Bluetooth!!
    }

