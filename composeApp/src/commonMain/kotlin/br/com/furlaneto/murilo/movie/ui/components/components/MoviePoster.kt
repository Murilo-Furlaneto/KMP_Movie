package br.com.furlaneto.murilo.movie.ui.components.movies.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import br.com.furlaneto.murilo.movie.domain.model.Movie
import coil3.compose.AsyncImage
import movie.composeapp.generated.resources.Res
import movie.composeapp.generated.resources.minecraft_movie
import org.jetbrains.compose.resources.painterResource

@Composable
fun MoviePoster(
    movie: Movie,
    modifier: Modifier = Modifier
) {
     Column (
         modifier = modifier.width(14.dp)
     ){
         Card(
             modifier = Modifier.width(14.dp)
                 .height(210.dp),
             shape = RoundedCornerShape(12.dp)
         ){
             AsyncImage(
                 model = movie.posterUrl,
                 contentDescription = null,
                 contentScale = ContentScale.Crop,
                 modifier =   Modifier.fillMaxWidth(),
             )
         }

         Text(
             movie.title,
             maxLines = 1,
             overflow = TextOverflow.Ellipsis,
             style = MaterialTheme.typography.titleMedium,
         )
     }
}