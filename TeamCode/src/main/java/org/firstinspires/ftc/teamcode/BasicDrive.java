package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous
public class BasicDrive extends LinearOpMode{

    private DcMotor         backleft   = null;
    private DcMotor         frontleft  = null;
    private DcMotor         backright   = null;
    private DcMotor         frontright  = null;

    public void runOpMode() {



        backleft  = hardwareMap.get(DcMotor.class, "back_left");
        frontleft = hardwareMap.get(DcMotor.class, "front_left");
        backright  = hardwareMap.get(DcMotor.class, "back_right");
        frontright = hardwareMap.get(DcMotor.class, "front_right");


        waitForStart();


    }






}
