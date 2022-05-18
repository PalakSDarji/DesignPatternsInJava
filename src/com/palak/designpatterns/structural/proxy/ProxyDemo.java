package com.palak.designpatterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage();
        proxyImage.displayImage();

        ProxyImageCache proxyImageCache = new ProxyImageCache();
        proxyImageCache.displayImage();
    }
}
