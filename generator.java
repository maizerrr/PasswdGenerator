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
		double count=0.0;
		double total=0.0;
		for(int i=min;i<=max;i++){
			total=total+Math.pow(range,i);
		}
		System.out.print("Processing: 0% ");
		for(int i=min;i<=max;i++){
			count=series(elements,new String[i],i-1,name,count,total);
		}
		System.out.println("100%");
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
	
	public static double series(String[] elements,String[] eachline,int n,String name,double count,double total) throws IOException{
		if(n==-1){
			for(int i=eachline.length-1;i>=0;i--){
				/*System.out.print(eachline[i]+" ");*/
				writer(eachline[i],name);
			}
			/*System.out.println();*/
			writer("\r\n",name);
			count++;
			int temp=(int)(count/total*100);
			int rul=(int)(total/100);
			if(rul<200) rul=200;
			if(count%rul==0&&count>=rul){
				System.out.print(temp+"% ");
			}
			return count;
		}
		for(int i=0;i<elements.length;i++){
			eachline[n]=elements[i];
			count=series(elements,eachline,n-1,name,count,total);
		}
		return count;
	}
	
	public static void writer(String context,String filename) throws IOException{
		BufferedWriter w=new BufferedWriter(new FileWriter(filename,true));
		w.write(context);
		/*w.write("\r\n");*/
		w.close();
	}
}
