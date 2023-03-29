package com.JavaBasics.Oops.Inheritance;


class University{
	public void Regulations() {
		System.out.println("HeadOffice rules should be Followed By :-");
	}
}
class MallaReddyUniversity extends University{
	public void MRU() {
		System.out.println("MallaReddyUniversity");
	}
}
class TKRUniversity extends University {
	public void TKRU() {
		System.out.println("TKRUniversity ");
	}
}
class MLRUniversity extends University{
	public void MLRU() {
		System.out.println("MLRUniversity");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		MallaReddyUniversity mallaReddyUniversity=new MallaReddyUniversity();
		mallaReddyUniversity.Regulations();
		mallaReddyUniversity.MRU();
		
		
		TKRUniversity tkrUniversity= new TKRUniversity();
		tkrUniversity.Regulations();
		tkrUniversity.TKRU();
		
		MLRUniversity mlrUniversity= new MLRUniversity();
		mlrUniversity.Regulations();
		mlrUniversity.MLRU();
		
		

	}

}
