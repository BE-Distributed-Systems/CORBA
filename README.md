# CORBA
BE CORBA assignment

## Setup
 
 - Make sure the code is compiling with Java 1.8. Java 1.8 can download from [here](https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=391&field_java_package_target_id=396). Download the JDK as zip. Un-zip the zip file. 
 - Set the JDK in the environment variable.
     - Go to The PC -> properties -> Advance System Settings -> Environment Variable 
        - variable name : JAVA_HOME 
        - variable value : JDK path
     - Also set the JDK/bin path to the path variable of system variables. 
     
     Note : If path variable is not there you can create a new one with 
       - Variable Name : path 
       - Variable value : JDK/bin)
 - Make sure the eclipse is installed in the system [download](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2023-03/R/eclipse-inst-jre-win64.exe)
 - Right click on project in eclipse Go to properties->Java Compiler -> Set Java Compliance to 1.8

## Testing the System
 - Create a Java Project.
 - Set the JRE to point to JDK-1.8
 - Create a Java Class with main method.
 - Run basic *System.out.println("Running");* to check the system is ready with Java Setup.
 
## Running the program 
 - Open a terminal and run Start ordb server
      *orbd -ORBInitialPort 1050 -ORBInitialHost localhost*
     
 - Open another terminal run Calculator Server. Go to the CORBA\Bin and run
       *java edu.ait.ds.corba.server.CalculatorServer -ORBInitialPort 1050 -ORBInitialHost localhost*
      
 - Open another terminal and run the Client. Go to the CORBA\Bin and run
       *java edu.ait.ds.corba.client.CalculatorClient -ORBInitialPort 1050 -ORBInitialHost localhost* 
 
 - ClientRequest should call CalculatorServer and get the response as implemented mathematical operations. 
 - Server should started once and keep running until you close the server terminal but client should run every time.
 