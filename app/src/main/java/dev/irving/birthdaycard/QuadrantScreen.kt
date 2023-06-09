package dev.irving.birthdaycard

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.irving.birthdaycard.ui.theme.Pink40
import dev.irving.birthdaycard.ui.theme.Pink80
import dev.irving.birthdaycard.ui.theme.Purple40
import dev.irving.birthdaycard.ui.theme.Purple80

@Composable
fun QuadrantView(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            SquareView(
                titleResource = R.string.text_composable_title,
                summaryResource = R.string.text_composable_summary,
                backgroundColor = Purple80,
                modifier = Modifier.weight(1f)
            )
            SquareView(
                titleResource = R.string.image_composable_title,
                summaryResource = R.string.image_composable_summary,
                backgroundColor = Purple40,
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            SquareView(
                titleResource = R.string.row_composable_title,
                summaryResource = R.string.row_composable_summary,
                backgroundColor = Pink40,
                modifier = Modifier.weight(1f)
            )
            SquareView(
                titleResource = R.string.column_composable_title,
                summaryResource = R.string.column_composable_summary,
                backgroundColor = Pink80,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun SquareView(
    @StringRes
    titleResource: Int,
    @StringRes
    summaryResource: Int,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.background(color = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = stringResource(id = titleResource),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = stringResource(id = summaryResource),
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun QuadrantViewPrev() {
    QuadrantView()
}
