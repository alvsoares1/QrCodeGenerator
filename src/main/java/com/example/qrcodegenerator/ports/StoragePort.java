package com.example.qrcodegenerator.ports;

public interface StoragePort {

    String uploadFile(byte[] file, String fileName, String contentType);
}
