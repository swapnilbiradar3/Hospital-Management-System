# Hospital-Management-System

This application is an application for Hospital Management System which can be used by Patient, Doctor, System Admin, Hospital Admin, Community Admin and others to view the encounters with doctor and to keeps recoreds in hsopital management system. The flow diagram of the application is as below.

<img width="1024" alt="Screen Shot 2022-10-30 at 11 23 05 PM" src="https://user-images.githubusercontent.com/113265708/198924535-2febbfe7-80f3-4a35-9599-3729f379a644.png">

The requirments of the application are as follows.

STEP 1
• SYSTEM ADMIN LOGS IN
• CREATES PERSON AND HIS CREDENTIALS – could be admin, doctor, patient
o CAN CRUD HOSPITALS
o CAN CRUD ENCOUNTERS
STEP 2
• COMMUNITY ADMIN LOGS IN
• ADDS CITY, COMMUNITY and HOUSES in the system
STEP 3¬
• HOSTPITAL ADMIN LOGS IN
• CREATES HOSPITALS to a hospital directory for a CITY
• LINKS A HOSPITAL TO THE COMMUNITY
• MANAGES Patients, doctors, and encounters
• WHEN PATIENT DETAILS ARE ADDED – FOR Address, we can use INFORMATION we already store in STEP 2 to populate CITY, COMMUNITY and HOUSE for a person
STEP 4
• PATIENT LOGS IN
• Patient looks for hospitals and doctors
• Patient can access his encounter history
• EDIT either personal details or encounters
STEP 5
• DOCTOR LOGS IN
• Manages Patient Encounter information
• Manages Vital Signs for encounter
STEP 6
• PATIENT VIEWS HIS ENCOUNTER with a DOCTOR
STEP 7
• SYSTEM ADMIN can view all the changes that have happened so far
• DEMO a DELETE operation on the resources asked by the TA

Samples of UI are as follows

UI Login Page
<img width="1123" alt="Screen Shot 2022-10-30 at 11 27 54 PM" src="https://user-images.githubusercontent.com/113265708/198925118-7f68bf61-62e5-408f-aeaf-829090eca81b.png">

System Admin Page
<img width="1234" alt="Screen Shot 2022-10-30 at 11 29 07 PM" src="https://user-images.githubusercontent.com/113265708/198925184-feddacda-cbab-495f-9173-413938fc9433.png">

Class Diagram of Assignment
![Class Diagram](https://user-images.githubusercontent.com/113265708/198923933-82f8aaed-f1e0-4075-abc9-aaceab99a258.jpg)

Sequence Diagram

![WhatsApp Image 2022-10-30 at 11 53 35 PM](https://user-images.githubusercontent.com/113265708/198927726-1fa1255f-301f-4ba2-a3cf-b1e569b3f53f.jpeg)
