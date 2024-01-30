package com.iambedant.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


private var _Logo: ImageVector? = null

val OrezIcons.Logo: ImageVector
    get() {
        if (_Logo != null) {
            return _Logo!!
        }
        _Logo = ImageVector.Builder(
            name = "Logo",
            defaultWidth = 42.dp,
            defaultHeight = 60.dp,
            viewportWidth = 42f,
            viewportHeight = 60f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF81B29A)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(28.4688f, 28.4687f)
                arcTo(14.2344f, 28.4687f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.2344f, 56.9374f)
                arcTo(14.2344f, 28.4687f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 28.4687f)
                arcTo(14.2344f, 28.4687f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.4688f, 28.4687f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF2CC8F)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(35.6486f, 33.5586f)
                arcTo(12.0153f, 24.0305f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.6333f, 57.5891f)
                arcTo(12.0153f, 24.0305f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.617999999999999f, 33.5586f)
                arcTo(12.0153f, 24.0305f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.6486f, 33.5586f)
                close()
            }
        }.build()
        return _Logo!!
    }

