package com.iambedant.icons

import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _Search: ImageVector? = null

public val OrezIcons.Search: ImageVector
    get() {
        if (_Search != null) {
            return _Search!!
        }
        _Search = ImageVector.Builder(
            name = "SearchSvgrepoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.77f, 18.3f)
                curveTo(9.2807f, 18.3f, 7.8248f, 17.8584f, 6.5865f, 17.031f)
                curveTo(5.3483f, 16.2036f, 4.3831f, 15.0275f, 3.8132f, 13.6516f)
                curveTo(3.2433f, 12.2757f, 3.0941f, 10.7616f, 3.3847f, 9.301f)
                curveTo(3.6752f, 7.8403f, 4.3924f, 6.4986f, 5.4455f, 5.4455f)
                curveTo(6.4986f, 4.3924f, 7.8403f, 3.6752f, 9.301f, 3.3847f)
                curveTo(10.7616f, 3.0941f, 12.2757f, 3.2433f, 13.6516f, 3.8132f)
                curveTo(15.0275f, 4.3831f, 16.2036f, 5.3483f, 17.031f, 6.5865f)
                curveTo(17.8584f, 7.8248f, 18.3f, 9.2807f, 18.3f, 10.77f)
                curveTo(18.3f, 11.7588f, 18.1052f, 12.738f, 17.7268f, 13.6516f)
                curveTo(17.3484f, 14.5652f, 16.7937f, 15.3953f, 16.0945f, 16.0945f)
                curveTo(15.3953f, 16.7937f, 14.5652f, 17.3484f, 13.6516f, 17.7268f)
                curveTo(12.738f, 18.1052f, 11.7588f, 18.3f, 10.77f, 18.3f)
                close()
                moveTo(10.77f, 4.74999f)
                curveTo(9.5833f, 4.75f, 8.4233f, 5.1019f, 7.4366f, 5.7612f)
                curveTo(6.4499f, 6.4205f, 5.6808f, 7.3575f, 5.2267f, 8.4539f)
                curveTo(4.7726f, 9.5503f, 4.6538f, 10.7566f, 4.8853f, 11.9205f)
                curveTo(5.1168f, 13.0844f, 5.6882f, 14.1535f, 6.5274f, 14.9926f)
                curveTo(7.3665f, 15.8317f, 8.4356f, 16.4032f, 9.5994f, 16.6347f)
                curveTo(10.7633f, 16.8662f, 11.9697f, 16.7474f, 13.0661f, 16.2933f)
                curveTo(14.1624f, 15.8391f, 15.0995f, 15.0701f, 15.7588f, 14.0834f)
                curveTo(16.4181f, 13.0967f, 16.77f, 11.9367f, 16.77f, 10.75f)
                curveTo(16.77f, 9.1587f, 16.1379f, 7.6326f, 15.0126f, 6.5073f)
                curveTo(13.8874f, 5.3821f, 12.3613f, 4.75f, 10.77f, 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 20.75f)
                curveTo(19.9015f, 20.7504f, 19.8038f, 20.7312f, 19.7128f, 20.6934f)
                curveTo(19.6218f, 20.6557f, 19.5392f, 20.6001f, 19.47f, 20.53f)
                lineTo(15.34f, 16.4f)
                curveTo(15.2075f, 16.2578f, 15.1354f, 16.0697f, 15.1388f, 15.8754f)
                curveTo(15.1422f, 15.6811f, 15.221f, 15.4958f, 15.3584f, 15.3583f)
                curveTo(15.4958f, 15.2209f, 15.6812f, 15.1422f, 15.8755f, 15.1388f)
                curveTo(16.0698f, 15.1354f, 16.2578f, 15.2075f, 16.4f, 15.34f)
                lineTo(20.53f, 19.47f)
                curveTo(20.6704f, 19.6106f, 20.7493f, 19.8012f, 20.7493f, 20f)
                curveTo(20.7493f, 20.1987f, 20.6704f, 20.3893f, 20.53f, 20.53f)
                curveTo(20.4608f, 20.6001f, 20.3782f, 20.6557f, 20.2872f, 20.6934f)
                curveTo(20.1962f, 20.7312f, 20.0985f, 20.7504f, 20f, 20.75f)
                close()
            }
        }.build()
        return _Search!!
    }

