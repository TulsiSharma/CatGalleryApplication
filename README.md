# CatGalleryApplication
Create a Cat Gallery app that fetches cat images from "The Cat API" (https://api.thecatapi.com/v1/images/search?limit=10) and displays them in a list. The app must be implemented using Jetpack Compose for the user interface.
Requirements:

User Interface (UI):
● The app should have a single screen with a vertical list of cat images.
● Each list item should display a cat image along with any additional
information you find relevant or any dummy text is also acceptable.
● Implement the UI using Jetpack Compose features such as LazyColumn,
Image, etc.
Networking:
● Fetch cat images from the provided API.
● You are free to choose any networking library for API requests.
Optional: Architecture (MVVM/MVI):
● Optionally, implement the MVVM/MVI architecture for better separation of
concerns.
● Optionally, create a ViewModel to manage the data and interact with the
UI.
● Optionally, use LiveData or other observable patterns to update the UI
when new data is available.
Optional: Dependency Injection:
● Optionally, if you're comfortable, use Dagger 2, Hilt, or any other
Dependency Injection framework to inject dependencies into your
components.

Optional: Unit Testing:
● Optionally, write unit tests for critical parts of your app (e.g., ViewModel,
Repository).
● Optionally, use JUnit and Mockito or any other testing framework you are
comfortable with.
