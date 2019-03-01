# Arm-test

This project exists to test arm PID on a side system. Plug your joystick in and tell the driver station that the joystick is in port 0. Also, you need to add the Spark MAX vendor library or else you will get dependency errors.

`git clone https://github.com/FRC6334/arm-test`
Open the cloned repo in VS code

# Library install:

Online Installation

You can use the online method to install the REV Robotics Java API if your development machine is connected to the internet:

    Open your robot project in VSCode.
    Click on the WPI icon in the corner to open the WPI Command Pallet (OR press ctrl-shift-p)
    Select Manage Vendor Libraries.
    Select Install new library (online).
    Enter the following installation URL and press ENTER:

    https://www.revrobotics.com/content/sw/max/sdk/REVRobotics.json

PID formula inspired by https://github.com/tekdemo/MiniPID-Java/blob/master/src/com/stormbots/MiniPID.java
