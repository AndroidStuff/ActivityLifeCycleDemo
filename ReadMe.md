## Activity
  	- can roughly can be translated to a screen (a resource of a layout) in Android :)
	- self-contained screen
	- every screen in app corresponds to its own activity in code
  	- Android App = MainActivity + OtherActivity + OtherActivity + ...
	- Activities are self-contained units of functionality.
	  It includes both the functionality and the activity itself, along with the corresponding user interface


## Life-cycle methods of an Activity
	- Activity Life-cycle Events - onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy(), onRestart()
	- onCreate() - It is recommended to initialize all the variables and widgets
	- soon after onCreate() is executed onStart() starts to execute
	- soon after onStart() is executed onResume() starts to execute
	- soon after onResume() is executed, user starts to see the Activity screen
	- Let's say a user clicks a button in the screen, with the intention to see the next screen (say Activity-B) in UI, 
		   this current activity (say Activity-A) steps into onPause() state
	- When the next activity, Activity-B, enters onResume() state,
		   Activity-A enters onStop(), leaving room for Activity-B to be displayed on screen.
	- When a Back button is pressed after Activity-B is shown on screen, 
		   the life-cycle of Activity goes through onPause() and onStop().
		   Further it kicks onReStart() and onStart() methods of Activity-A. 
		   When the  Activity-A gets to onResume() method, Activity-B's onDestroy() is invoked paving way for Activity-A to be displayed.
	- The only way an activity talks to another activity is through Intents.
	- There are some predefined set of activities baked in the Android OS. Some examples are the back button, power mgmt., etc.   