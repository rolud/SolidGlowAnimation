# **SolidGlowAnimation** 

![Platform](https://img.shields.io/badge/platform-Android-brightgreen)
![Jitpack](https://img.shields.io/badge/jitpack-v1.0-brightgreen)
![Kotlin](https://img.shields.io/badge/made%20with-Kotlin-orange)


Android component to fast implements a glow animation behind views.

SolidGlowAnimation allows to create an animated glow around views. It supports:
- layers
- up to 5 different colors
- rounded corners
- customizable duration
- customizable start delay 

 ![example](https://media1.giphy.com/media/MDlqewpg2nWQFqCi1p/giphy.gif)


 ## **Usage**

In XML layout, wrap the view you want to add animation with SolidGlowAnimation:

```xml
<SolidGlowAnimation
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="50dp"
        app:layers="3"
        app:color1="#f00"
        app:color2="#0f0"
        app:color3="#00f"
        app:duration="1000"
        app:scaleMax="1.5"
        android:radius="20dp" >

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="50dp"
            android:text="SolidGlowAnimation"/>
    </com.rolud.solidglowanimation.SolidGlowAnimation>
```

### Available attributes
- **layers** (integer) : number of animated layers.
- **color1**, **color2**, **color3**, **color4**, **color5**  (color)
- **duration** (integer) : single layer animation duration in milliseconds
- **startDelay** (integer) : delay with which the animation starts, in milliseconds
- **radius** (dimension) : set coner radius
- **scaleMax** (float) : set max dimension of the animation


## **Gradle**

To use SolidGlowAnimation, in project's build.gradle add:

```gradle
allProjecs {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

In app's build.gradle add:
 
```gradle
dependencies {
    implementation 'om.github.rolud:SolidGlowAnimation:1.0'
}
```


---
[License](./LICENSE.md)