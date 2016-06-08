package run1;

public class CalcStart {
	double fed1, fed2;
	double rate;
	double y1,y2,y3,y4;
	
	public CalcStart(double a, double b){
		fed1=a;
		fed2=b;
		rate=1.0429;
		calc();
	}
	public CalcStart(double a, double b, double r){
		fed1=a;
		fed2=b;
		rate=1+r;
		calc();
	}
	public void calc(){
		y1=fed1+fed2*rate;
		y2=y1+fed1+fed2*Math.pow(rate,2);
		y3=y2+fed1+fed2*Math.pow(rate,3);
		y4=y3+fed1+fed2*Math.pow(rate,4);
	}
}
