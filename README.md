# Movie Catalog

Movie Catalog is an Android application developed as part of the
Mobile Application Development course.

The application allows users to browse a collection of movies, view
movie details and actors, search for movies, add movies to favorites,
and rate movies using Like and Dislike options.

## Features

- Display of 20 movies using RecyclerView
- Movie poster, title, genre and rating
- Detailed information about each movie
- Actors displayed in a horizontal RecyclerView
- Search movies by title
- Add and remove movies from Favorites
- Favorites screen
- Like and Dislike movie rating
- Dark cinema-inspired user interface
- Toolbar/AppBar navigation

## Technologies

- Java
- XML
- Android Studio
- Android SDK
- RecyclerView
- Git and GitHub

## Project Structure

The application contains several Java classes and activities:

- `MainActivity` – displays the movie list and search functionality
- `MovieDetailsActivity` – displays information about the selected movie
- `FavoritesActivity` – displays favorite movies
- `Movie` – data model for movies
- `Actor` – data model for actors
- `MovieData` – contains local movie and actor data
- `MovieAdapter` – RecyclerView adapter for movies
- `ActorAdapter` – RecyclerView adapter for actors

## How to Run

1. Clone or download the repository.
2. Open the project in Android Studio.
3. Wait for Gradle synchronization to finish.
4. Connect an Android device or start an Android emulator.
5. Run the application from Android Studio.

## Usage

On the main screen, users can browse the available movies or search
for a movie by title.

Selecting a movie opens the details screen, where the user can view
the movie information and actors, add the movie to Favorites, and
rate it using Like or Dislike.

Favorite movies can be accessed through the Favorites button in the
Toolbar.

## Data Storage

Movie and actor data are stored locally in the application using
Java `ArrayList` collections. The application does not require an
internet connection or external database.

## Author

Azra Atic

Mobile Application Development

