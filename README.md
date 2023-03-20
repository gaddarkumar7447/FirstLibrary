# FirstLibrary

> How to
- To get a Git project into your build:

> Step 1. Add the JitPack repository to your build file


```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```

> Step 2. Add the dependency

```dependencies
      dependencies {
	        implementation 'com.github.gaddarkumar7447:FirstLibrary:version'
	    }
  ```
 
 ## version : 1.0.0
