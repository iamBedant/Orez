package com.iambedant.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


private var _Info: ImageVector? = null

public val OrezIcons.Info: ImageVector
    get() {
        if (_Info != null) {
            return _Info!!
        }
        _Info = ImageVector.Builder(
            name = "Info",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF020202)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.91f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 10f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.09f, 13.89f)
                lineTo(13.91f, 13.89f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF020202)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.91f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 10f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.09f, 8.16f)
                lineTo(12f, 8.16f)
                lineTo(12f, 13.89f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF020202)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.91f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 10f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(1.5f, 5.3f)
                verticalLineToRelative(9.54f)
                arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.82f, 3.82f)
                horizontalLineTo(7.23f)
                verticalLineToRelative(2.86f)
                lineTo(13f, 18.66f)
                horizontalLineToRelative(5.73f)
                arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.82f, -3.82f)
                verticalLineTo(5.3f)
                arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.82f, -3.82f)
                horizontalLineTo(5.32f)
                arcTo(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 5.3f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF020202)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.91f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 10f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.05f, 5.3f)
                lineTo(12.95f, 5.3f)
            }
        }.build()
        return _Info!!
    }

