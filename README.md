# Minutes To Read

This simple library helps in calculating the number of minutes required to read a particular String. Its very simple to use.

## Getting Started

Add this in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Add the dependency

	dependencies {
	        compile 'com.github.knightcube:minutes-to-read:0.1.0'
	}

## Usage
 
  ```MinutesToRead.getMinutesToRead("PASS ANY STRING HERE");```
  
  Please store the value in an int data type variable because the getMinutesToRead() function returns Integer i.e the average number of minutes required to read a particular string
  
Thats all :)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
