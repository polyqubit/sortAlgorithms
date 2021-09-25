import pkg.*;
import java.util.ArrayList;
import java.time.Clock;

public class Maths {
	double mathnumber;
	private Clock clo;
	
	Maths (double inp) {
		mathnumber = inp;
	}
	
	//floor, takes double
	int floorD() {
		return (int) mathnumber;
	}
	
	//ceiling command, takes double
	int ceilD() {
		int benchmark = (int) mathnumber;
		if(mathnumber>0){
			if(mathnumber>benchmark){return (int) mathnumber+1;}
			else if(mathnumber==benchmark){return (int) mathnumber;}
			else{return 0;}
		}
		else{
			if(mathnumber<benchmark){return (int) mathnumber-1;}
			else if(mathnumber==benchmark){return (int) mathnumber;}
			else{return 0;}
		}
	}
	
	//round command, takes double
	int round() {
		double benchmark = (int) mathnumber+0.5;
		if(mathnumber<benchmark){return (int) mathnumber;}
		else if(mathnumber>benchmark){return (int) mathnumber+1;}
		else{return (int) mathnumber+1;}
	}
	
	//absolute value command, takes double
	double abs() {
		if(mathnumber>0){return mathnumber;}
		else{return mathnumber*(-1);}
	}
	
	//maximum command, takes unlimited doubles
	double max(double[] inp) {
		double maxinp = inp[0];
		for(int i=1;i<inp.length;i++) {
			if (inp[i]>maxinp) {maxinp=inp[i];}
		}
		return maxinp;
	}
	
	//minimum command, takes unlimited doubles
	double min(double[] inp) {
		double mininp = inp[0];
		for(int i=1;i<inp.length;i++) {
			if (inp[i]<mininp) {mininp=inp[i];}
		}
		return mininp;
	}
	
	//power command, takes a double base and an int exponent
	double pow(int exp) {
		if(exp<=0) {return 1;}
		int c = 1;
		double d = mathnumber;
		while(c<exp) {d=d*mathnumber;c++;}
		return d;
	}
	
	//root command, takes a double base
	//note: not my code, couldn't figure out a way to do this
	double sqrt() {
		if(mathnumber<0){return 0;}
		double a = 0;
		double sqt = mathnumber/2;
		while((a-sqt)!=0){
			a = sqt;
			sqt = (a+(mathnumber/a))/2;
		}
		return sqt;
	}
	
	//averaging function, takes unlimited doubles
	double avg(double[] inp) {
		double sum = 0;
		for(int i=0;i<inp.length;i++) {
			sum += inp[i];
		}
		return sum/inp.length;
	}
	
	//random command, takes an integer upper bound
	double rand(int limit) {
		if(limit>100000000) {limit=100000000;}
		double tiom = System.currentTimeMillis()*System.currentTimeMillis()*30109.14159265358979;
		int[] list = new int[limit+1];
		for(int i=0;i<list.length;i++){
			list[i]=i;
		}
		if(limit%2==0){
			if(tiom<0) {tiom = tiom%(limit+1)*(-1);}
			else {tiom = tiom%(limit+1);}
		}
		else{
			if(tiom<0) {tiom = tiom%(limit)*(-1);}
			else {tiom = tiom%(limit);}
		}
		int toim = (int) tiom;
		return list[toim];
	}
}



class nMath extends Maths {
	double num = 0;
	public nMath(double inp) {
		super(inp);
	}
	public int floorD(int flag) {
		int x = super.floorD();
		if((flag & 0b0000000001) !=0) {System.out.print(x);};
		return(x);
	}
	public int ceilD(int flag) {
		int x = super.ceilD();
		if((flag & 0b0000000010) !=2) {System.out.print(x);};
		return(x);
	}
	
	public int round(int flag) {
		int x = super.round();
		if((flag & 0b0000000100) !=4) {System.out.print(x);};
		return(x);
	}
	
	public double abs(int flag) {
		double x = super.abs();
		if((flag & 0b0000001000) !=8) {System.out.print(x);};
		return(x);
	}
	
	public double max(int flag, double ... inp) {
		double x = super.max(inp);
		if((flag & 0b0000010000) !=16) {System.out.print(x);};
		return(x);
	}
	
	public double min(int flag, double ... inp) {
		double x = super.min(inp);
		if((flag & 0b0000100000) !=32) {System.out.print(x);};
		return(x);
	}

	public double pow(int flag, int exp) {
		double x = super.pow(exp);
		if((flag & 0b0001000000) !=64) {System.out.print(x);};
		return(x);
	}

	public double sqrt(int flag) {
		double x = super.sqrt();
		if((flag & 0b0010000000) !=128) {System.out.print(x);};
		return(x);
	}
	

	public double avg(int flag, double ... inp) {
		double x = super.avg(inp);
		if((flag & 0b0100000000) !=256) {System.out.print(x);};
		return(x);
	}

	public double rand(int flag, int limit) {
		double x = super.rand(limit);
		if((flag & 0b1000000000) !=512) {System.out.print(x);};
		return(x);
	}
}







