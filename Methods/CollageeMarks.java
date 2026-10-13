class CollageeMarks{
	public static void main(String[] args){
		
		System.out.println("Marks for 1 subject");
		int softwareDeveopment=90;
		CollageeMarks.theMarksFor1Subject(softwareDeveopment);
		
		System.out.println("Marks for 2 subject");
		int computerNetwork=89;
		int theoryOfComputation=70;
		CollageeMarks.theMarksFor2Subject(computerNetwork,theoryOfComputation);
		
		System.out.println("Marks for 3 subject");
		int artificialIntelligence=99;
		int careerDevolopment=80;
		int dbms=88;
		CollageeMarks.theMarksFor3Subject(artificialIntelligence,careerDevolopment,dbms);
		
		System.out.println("Marks for 4 subject");
		int java=96;
		int phyton=67;
		int advancedJava=77;
		int c=90;
		CollageeMarks.theMarksFor4Subject(java,phyton,advancedJava,c);
		
		System.out.println("Marks for 5 subject");
		int aplitute=91;
		int chemistry=100;
		int physics=56;
		int biology=98;
		int kannada=50;
		CollageeMarks.theMarksFor5Subject(aplitute,chemistry,physics,biology,kannada);
	}
	
	static void theMarksFor1Subject(int sd){
		System.out.println("softwareDeveopment="+sd);
	}
	
	static void theMarksFor2Subject(int a,int b){
		System.out.println("computerNetwork="+a);
		System.out.println("theoryOfComputation="+b);
	}
	
	static void theMarksFor3Subject(int c,int d,int e){
		System.out.println("artificialIntelligence="+c);
		System.out.println("careerDevolopment="+d);
		System.out.println("careerDevolopment="+e);
	}
	
	static void theMarksFor4Subject(int q,int r,int u,int o){
		System.out.println("java="+q);
		System.out.println("phyton="+r);
		System.out.println("advancedJava="+u);
		System.out.println("c="+o);
	}
	static void theMarksFor5Subject(int f,int g,int k,int m,int n){
		System.out.println("aplitute="+f);
		System.out.println("chemistry="+g);
		System.out.println("physics="+k);
		System.out.println("biology="+m);
		System.out.println("kannada="+n);
	}
}
		