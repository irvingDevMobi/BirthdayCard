package dev.irving.birthdaycard

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.irving.birthdaycard.ui.theme.BirthdayCardTheme

@Composable
fun BusinessCardView() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ProfileView(
            modifier = Modifier.align(Alignment.Center)
        )
        Column(
            modifier = Modifier.align(Alignment.BottomEnd),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom
        ) {
            IconText(
                imageResource = R.drawable.baseline_email_24,
                labelResource = R.string.my_email,
                contentDescriptionResource = R.string.email
            )
            IconText(
                imageResource = R.drawable.github_mark,
                labelResource = R.string.my_github,
                contentDescriptionResource = R.string.github
            )
            IconText(
                imageResource = R.drawable.logo_of_twitter,
                labelResource = R.string.my_twitter,
                contentDescriptionResource = R.string.twitter
            )
            IconText(
                imageResource = R.drawable.facebook_icon,
                labelResource = R.string.my_facebook,
                contentDescriptionResource = R.string.facebook
            )
        }
    }
}

@Composable
fun ProfileView(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(156.dp)
        )
        Text(
            text = stringResource(id = R.string.my_name),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        )
        Text(
            text = stringResource(id = R.string.my_seniority),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic
        )
    }
}

@Composable
fun IconText(
    @DrawableRes
    imageResource: Int,
    @StringRes
    labelResource: Int,
    @StringRes
    contentDescriptionResource: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.padding(4.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = stringResource(id = contentDescriptionResource)
        )
        Text(text = stringResource(id = labelResource))
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun BusinessCardPreview() {
    BirthdayCardTheme {
        BusinessCardView()
    }
}
