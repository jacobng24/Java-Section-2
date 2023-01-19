//HCS_2_2


public class Spinner {
	private int sector;
	private int lastvalue;
	private int run = 0;
		
public Spinner(int s) {
			sector = s;
	}
public int Spin() {
	int spinval= (int)(Math.random()*sector + 1);
	if (spinval==lastvalue)
	{
		run++;
	}
	else
	{
		run = 1;
	}
lastvalue = spinval;
return spinval;

	}
public int currentRun() {
	return run;
	}
}
