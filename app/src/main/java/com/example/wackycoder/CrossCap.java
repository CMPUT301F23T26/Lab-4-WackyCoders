package com.example.wackycoder;

public class CrossCap extends Shape {
    private int z;

    String color = "metallic magenta with bright transparent mauve polka-dots";
    // for some reason, I am not seeing any merge conflicts when I merge this. there is nothing to resolve?

    public CrossCap() {
        this.z = 3;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
