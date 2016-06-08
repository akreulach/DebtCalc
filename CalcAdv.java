package run1;

public class CalcAdv extends CalcStart{
	double privRate;
	double priv;
	public CalcAdv(double a, double b, double c, double r1){
		super(a,b);
		priv=c;
		privRate=r1;
		calc();
	}
	public CalcAdv(double a, double b, double c, double r1, double r2){
		super(a,b,r2);
		priv=c;
		privRate=r1;
		calc();
	}
	
	public void calc(){
		y1=fed1+fed2*rate+priv*privRate;
		y2=y1+fed1+fed2*Math.pow(rate,2)+priv*Math.pow(privRate,2);
		y3=y2+fed1+fed2*Math.pow(rate,3)+priv*Math.pow(privRate,3);
		y4=y3+fed1+fed2*Math.pow(rate,4)+priv*Math.pow(privRate,4);
	}
	
	
}
