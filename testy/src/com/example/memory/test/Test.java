package com.example.memory.test;


import com.example.memory.MainActivity;
import com.example.memory.R;

import android.graphics.Rect;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.Button;
//import static junit.framework.Assert.*;

public class Test extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mainActivity;
	private Button newGameButton;
	private Button hiscoresButton;
	private Button soundsButton;
	private Button aboutButton;
	private Button exitButton;
	private View mainLayout;
	
	@SuppressWarnings("deprecation")
	public Test() {
		  super("com.example.memory",MainActivity.class);
	}
	
	 public void setUp() throws Exception {
	 super.setUp();
	 mainActivity=getActivity();
	 newGameButton=(Button) mainActivity.findViewById(R.id.newGameButton);
	 hiscoresButton=(Button) mainActivity.findViewById(R.id.hiscores);
	 soundsButton=(Button) mainActivity.findViewById(R.id.sounds);
	 aboutButton=(Button) mainActivity.findViewById(R.id.about);
	 exitButton=(Button) mainActivity.findViewById(R.id.exit);
	 mainLayout = (View) mainActivity.findViewById(R.id.mainLayout);  
	}
	
	public void testWidocznosc() {
		int fullWidth = mainLayout.getWidth();
		int fullHeight = mainLayout.getHeight();
		
		int[] mainLayoutLocation = new int[2];
		mainLayout.getLocationOnScreen(mainLayoutLocation);// 0 50
		
		int[] newGameLocation = new int[2]; // 75 150
		int[] hiscoresLocation = new int[2]; 
		int[] soundsLocation = new int[2]; 
		int[] aboutLocation = new int[2];
		int[] exitLocation = new int[2]; 
		
		newGameButton.getLocationOnScreen(newGameLocation);
		hiscoresButton.getLocationOnScreen(hiscoresLocation);
		soundsButton.getLocationOnScreen(soundsLocation);
		aboutButton.getLocationOnScreen(aboutLocation);
		exitButton.getLocationOnScreen(exitLocation);
		
		//wielkosci przyciskow
		Rect newGameButtonRect = new Rect();  
		newGameButton.getDrawingRect(newGameButtonRect);
		Rect hiscoresButtonRect = new Rect();  
		hiscoresButton.getDrawingRect(hiscoresButtonRect);
		Rect soundsButtonRect = new Rect();  
		soundsButton.getDrawingRect(soundsButtonRect);
		Rect aboutButtonRect = new Rect();  
		aboutButton.getDrawingRect(aboutButtonRect);
		Rect exitButtonRect = new Rect();  
		exitButton.getDrawingRect(exitButtonRect);
		

		
		assertTrue("newGame znajduje sie w layoucie", newGameLocation[0] >= mainLayoutLocation[0]);
		assertTrue("newGame znajduje sie w layoucie", newGameLocation[1] >= mainLayoutLocation[1]);
		assertTrue("newGame znajduje sie w layoucie", newGameLocation[0] + newGameButtonRect.width()<= mainLayoutLocation[0]+fullWidth);
		assertTrue("newGame znajduje sie w layoucie", newGameLocation[1] + newGameButtonRect.height()<= mainLayoutLocation[1]+fullHeight);
		
		assertTrue("hiscores znajduje sie w layoucie", hiscoresLocation[0] >= mainLayoutLocation[0]);
		assertTrue("hiscores znajduje sie w layoucie", hiscoresLocation[1] >= mainLayoutLocation[1]);
		assertTrue("hiscores znajduje sie w layoucie", hiscoresLocation[0] + hiscoresButtonRect.width()<= mainLayoutLocation[0]+fullWidth);
		assertTrue("hiscores znajduje sie w layoucie", hiscoresLocation[1] + hiscoresButtonRect.height()<= mainLayoutLocation[1]+fullHeight);
		
		assertTrue("sounds znajduje sie w layoucie", soundsLocation[0] >= mainLayoutLocation[0]);
		assertTrue("sounds znajduje sie w layoucie", soundsLocation[1] >= mainLayoutLocation[1]);
		assertTrue("sounds znajduje sie w layoucie", soundsLocation[0] + soundsButtonRect.width()<= mainLayoutLocation[0]+fullWidth);
		assertTrue("sounds znajduje sie w layoucie", soundsLocation[1] + soundsButtonRect.height()<= mainLayoutLocation[1]+fullHeight);
		
		assertTrue("about znajduje sie w layoucie", aboutLocation[0] >= mainLayoutLocation[0]);
		assertTrue("about znajduje sie w layoucie", aboutLocation[1] >= mainLayoutLocation[1]);
		assertTrue("about znajduje sie w layoucie", aboutLocation[0] + aboutButtonRect.width()<= mainLayoutLocation[0]+fullWidth);
		assertTrue("about znajduje sie w layoucie", aboutLocation[1] + aboutButtonRect.height()<= mainLayoutLocation[1]+fullHeight);
		
		assertTrue("exit znajduje sie w layoucie", exitLocation[0] >= mainLayoutLocation[0]);
		assertTrue("exit znajduje sie w layoucie", exitLocation[1] >= mainLayoutLocation[1]);
		assertTrue("exit znajduje sie w layoucie", exitLocation[0] + exitButtonRect.width()<= mainLayoutLocation[0]+fullWidth);
		assertTrue("exit znajduje sie w layoucie", exitLocation[1] + exitButtonRect.height()<= mainLayoutLocation[1]+fullHeight);
		
	}
	
	public void testUlozenie(){
		int[] mainLayoutLocation = new int[2];
		mainLayout.getLocationOnScreen(mainLayoutLocation);// 0 50
		
		int[] newGameLocation = new int[2]; // 75 150
		int[] hiscoresLocation = new int[2]; 
		int[] soundsLocation = new int[2]; 
		int[] aboutLocation = new int[2];
		int[] exitLocation = new int[2]; 
		
		newGameButton.getLocationOnScreen(newGameLocation);
		hiscoresButton.getLocationOnScreen(hiscoresLocation);
		soundsButton.getLocationOnScreen(soundsLocation);
		aboutButton.getLocationOnScreen(aboutLocation);
		exitButton.getLocationOnScreen(exitLocation);
		
		assertTrue("hiscores button pod new game button", newGameLocation[1] < hiscoresLocation[1]);
		assertTrue("sounds button pod hiscores button", hiscoresLocation[1] < soundsLocation[1]);
		assertTrue("about button pod sounds button", soundsLocation[1] < aboutLocation[1]);
		assertTrue("exit button pod about button", aboutLocation[1] < exitLocation[1]);
	}
	
	public void testRozdzielnosc() {
		
		
		int[] mainLayoutLocation = new int[2];
		mainLayout.getLocationOnScreen(mainLayoutLocation);// 0 50
		
		int[] newGameLocation = new int[2]; // 75 150
		int[] hiscoresLocation = new int[2]; 
		int[] soundsLocation = new int[2]; 
		int[] aboutLocation = new int[2];
		int[] exitLocation = new int[2]; 
		
		newGameButton.getLocationOnScreen(newGameLocation);
		hiscoresButton.getLocationOnScreen(hiscoresLocation);
		soundsButton.getLocationOnScreen(soundsLocation);
		aboutButton.getLocationOnScreen(aboutLocation);
		exitButton.getLocationOnScreen(exitLocation);
		
		//wielkosci przyciskow
		Rect newGameButtonRect = new Rect();  
		newGameButton.getDrawingRect(newGameButtonRect);
		Rect hiscoresButtonRect = new Rect();  
		hiscoresButton.getDrawingRect(hiscoresButtonRect);
		Rect soundsButtonRect = new Rect();  
		soundsButton.getDrawingRect(soundsButtonRect);
		Rect aboutButtonRect = new Rect();  
		aboutButton.getDrawingRect(aboutButtonRect);
		Rect exitButtonRect = new Rect();  
		exitButton.getDrawingRect(exitButtonRect);
		
		
		
		assertTrue("hiscores button i new game button", newGameLocation[1] + newGameButtonRect.height()< hiscoresLocation[1]);
		assertTrue("sounds button i hiscores button", hiscoresLocation[1] + hiscoresButtonRect.height()< soundsLocation[1]);
		assertTrue("about button i sounds button", soundsLocation[1] + soundsButtonRect.height()< aboutLocation[1]);
		assertTrue("exit button i about button", aboutLocation[1] + aboutButtonRect.height()< exitLocation[1]);
	}

public void testRownosci() {
		
		
		int[] mainLayoutLocation = new int[2];
		mainLayout.getLocationOnScreen(mainLayoutLocation);// 0 50
		
		int[] newGameLocation = new int[2]; // 75 150
		int[] hiscoresLocation = new int[2]; 
		int[] soundsLocation = new int[2]; 
		int[] aboutLocation = new int[2];
		int[] exitLocation = new int[2]; 
		
		newGameButton.getLocationOnScreen(newGameLocation);
		hiscoresButton.getLocationOnScreen(hiscoresLocation);
		soundsButton.getLocationOnScreen(soundsLocation);
		aboutButton.getLocationOnScreen(aboutLocation);
		exitButton.getLocationOnScreen(exitLocation);
		
		//wielkosci przyciskow
		Rect newGameButtonRect = new Rect();  
		newGameButton.getDrawingRect(newGameButtonRect);
		Rect hiscoresButtonRect = new Rect();  
		hiscoresButton.getDrawingRect(hiscoresButtonRect);
		Rect soundsButtonRect = new Rect();  
		soundsButton.getDrawingRect(soundsButtonRect);
		Rect aboutButtonRect = new Rect();  
		aboutButton.getDrawingRect(aboutButtonRect);
		Rect exitButtonRect = new Rect();  
		exitButton.getDrawingRect(exitButtonRect);
		
		int[] odleglosc = new int[4];
		odleglosc[0] = hiscoresLocation[1] - newGameLocation[1]
				- newGameButtonRect.height();
		odleglosc[1] = soundsLocation[1] - hiscoresLocation[1]
				- hiscoresButtonRect.height();
		odleglosc[2] = aboutLocation[1] - soundsLocation[1]
				- soundsButtonRect.height();
		odleglosc[3] = exitLocation[1] - aboutLocation[1]
				- aboutButtonRect.height();
		assertTrue("hiscores button i new game button", odleglosc[0]==odleglosc[1]);
		assertTrue("sounds button i hiscores button", odleglosc[1]==odleglosc[2]);
		assertTrue("about button i sounds button", odleglosc[2]==odleglosc[3]);
		assertTrue("exit button i about button", odleglosc[3]==odleglosc[0]);
	}

}
