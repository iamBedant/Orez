package com.iambedant.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


private var _Download: ImageVector? = null

public val OrezIcons.Download: ImageVector
    get() {
        if (_Download != null) {
            return _Download!!
        }
        _Download = ImageVector.Builder(
            name = "Download",
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
                moveTo(17f, 17f)
                horizontalLineTo(17.01f)
                moveTo(17.4f, 14f)
                horizontalLineTo(18f)
                curveTo(18.9319f, 14f, 19.3978f, 14f, 19.7654f, 14.1522f)
                curveTo(20.2554f, 14.3552f, 20.6448f, 14.7446f, 20.8478f, 15.2346f)
                curveTo(21f, 15.6022f, 21f, 16.0681f, 21f, 17f)
                curveTo(21f, 17.9319f, 21f, 18.3978f, 20.8478f, 18.7654f)
                curveTo(20.6448f, 19.2554f, 20.2554f, 19.6448f, 19.7654f, 19.8478f)
                curveTo(19.3978f, 20f, 18.9319f, 20f, 18f, 20f)
                horizontalLineTo(6f)
                curveTo(5.0681f, 20f, 4.6022f, 20f, 4.2346f, 19.8478f)
                curveTo(3.7446f, 19.6448f, 3.3552f, 19.2554f, 3.1522f, 18.7654f)
                curveTo(3f, 18.3978f, 3f, 17.9319f, 3f, 17f)
                curveTo(3f, 16.0681f, 3f, 15.6022f, 3.1522f, 15.2346f)
                curveTo(3.3552f, 14.7446f, 3.7446f, 14.3552f, 4.2346f, 14.1522f)
                curveTo(4.6022f, 14f, 5.0681f, 14f, 6f, 14f)
                horizontalLineTo(6.6f)
                moveTo(12f, 15f)
                verticalLineTo(4f)
                moveTo(12f, 15f)
                lineTo(9f, 12f)
                moveTo(12f, 15f)
                lineTo(15f, 12f)
            }
        }.build()
        return _Download!!
    }

