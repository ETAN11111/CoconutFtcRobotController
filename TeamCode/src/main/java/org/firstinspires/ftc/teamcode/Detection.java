package org.firstinspires.ftc.teamcode;

import android.util.Size;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.tfod.Recognition;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.tfod.TfodProcessor;

import java.util.List;
import java.util.Locale;

@TeleOp
public class Detection extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException{
        int frameCount = 0;
        VisionPortal visionPortal = new VisionPortal.Builder()
                .enableLiveView(true)
                .setCamera(hardwareMap.get(WebcamName.class, "webcam 1"))
                .setCameraResolution(new Size(640, 480))
                .build();

        waitForStart();

        visionPortal.saveNextFrameRaw(String.format(Locale.US, "CameraFrameCapture-%06d", frameCount++));








    }


}
