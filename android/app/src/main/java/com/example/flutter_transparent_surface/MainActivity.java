package com.example.flutter_transparent_surface;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.TransparencyMode;

public class MainActivity extends FlutterActivity {
    @Override
    public TransparencyMode getTransparencyMode() {
        return TransparencyMode.transparent;
    }
}
