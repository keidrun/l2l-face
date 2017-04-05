# l2l-face

[![tests][tests]][tests-url]
[![coverage][cover]][cover-url]

L2L (Language To Language: Program conversion command) Plugin Interfaces

## Getting Started Developing the L2L Plugin
Please follow the below steps to develop your L2L plugin.

### Step 1: Add the configuration to your Gradle build script

You add the following configuration to your `build.gradle` file. `${version}` is release version.

```groovy
repositories {
    jcenter()
}

dependencies {
    compile "com.keidrun.l2l-face:l2l-face:${version}"
}
```

Or

```groovy
repositories {
    jcenter()

    maven {
        url "http://dl.bintray.com/keidrun/l2l-face"
    }
}

dependencies {
    compile "com.keidrun.l2l-face:l2l-face:${version}"
}
```

### Step 2: Implement interfaces

You need implement the following interface as the L2L plugin.

```java
com.keidrun.l2l.face.plugin.ConvertPlugin
```

### Step 3: Publish your plugin

Please publish your L2L plugin to `Jcenter` or `Maven Central Repository` or both.

[tests]:https://travis-ci.org/keidrun/l2l-face.svg?branch=master
[tests-url]:https://travis-ci.org/keidrun/l2l-face

[cover]:https://codecov.io/gh/keidrun/l2l-face/branch/master/graph/badge.svg
[cover-url]:https://codecov.io/gh/keidrun/l2l-face
