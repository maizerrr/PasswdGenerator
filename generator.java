
import java.util.Scanner;
import java.io.*;

public class generator {
	public static void main (String args[]) throws IOException{
		//echo
		Scanner input=new Scanner(System.in);
		System.out.print("Elements: ");
		String str=input.next()+",";
		System.out.print("min: ");
		int min=input.nextInt();
		System.out.print("max: ");
		int max=input.nextInt();
        System.out.print("save as: ");
        String name=input.next();
		//collected
		int range=range(str);
		String[] elements=new String[range];
		elements=collect(elements,str);
		name=name+".txt";
		File file=new File(name);
		for(int i=min;i<=max;i++){
			series(elements,new String[i],i-1,name);
		}
	}

	
	public static int range(String str){
		int num=0;
		for(int i=0;i<str.length();i++){
			if (str.substring(i,i+1).equals(",")){
				num++;
			}
		}
		return num;
	}
	
	public static String[] collect(String[] elements,String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.substring(i,i+1).equals(",")){
				elements[count]=str.substring(0,i);
				str=str.substring(i+1,str.length());
				i=0;
				count++;
			}
		}
		return elements;
	}
	
	public static String compose(String[] elements,int range,int n){
		String str="";
		n=n+1;
		for(int i=0;i<range;i++){
			str=str+elements[i];
		}
		return str;
	}
	
	public static void series(String[] elements,String[] eachline,int n,String name) throws IOException{
		if(n==-1){
			for(int i=eachline.length-1;i>=0;i--){
				/*System.out.print(eachline[i]+" ");*/
				writer(eachline[i],name);
			}
			/*System.out.println();*/
			writer("\r\n",name);
			return;
		}
		for(int i=0;i<elements.length;i++){
			eachline[n]=elements[i];
			series(elements,eachline,n-1,name);
		}
	}
	
	public static void writer(String context,String filename) throws IOException{
		BufferedWriter w=new BufferedWriter(new FileWriter(filename,true));
		w.write(context);
		
		w.close();
	}
}

