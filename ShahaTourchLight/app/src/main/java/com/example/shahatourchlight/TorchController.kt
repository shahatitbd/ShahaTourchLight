package com.example.shahatourchlight

import android.content.Context
import android.hardware.camera2.CameraManager

object TorchController {
    private var isTorchOn = false

    fun toggleTorch(context: Context) {
        val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as CameraManager
        val cameraId = cameraManager.cameraIdList[0]
        isTorchOn = !isTorchOn
        cameraManager.setTorchMode(cameraId, isTorchOn)
    }
}
