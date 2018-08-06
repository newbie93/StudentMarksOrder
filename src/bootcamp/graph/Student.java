package bootcamp.graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Student implements Comparable<Student> {
	public String name;
	public ArrayList<Integer> marks = new ArrayList<Integer>();
	public Student(String name,ArrayList<Integer> marks)
	{
		this.name=name;
		this.marks=marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int greater=0;
		int lesser = 0;
		for(int i=0;i<this.marks.size();i++)
		{
			if(marks.get(i) > o.marks.get(i))
			{
			greater++;	
			}
			else if(marks.get(i)<o.marks.get(i))
			{
			lesser++;	
			}
		}
		if(greater == this.marks.size())
			return -1;
		else if(lesser == this.marks.size())
			return 1;
		else
		return 0;
	}	
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(14);
		al.add(16);
		Student s1=new Student("a",al);
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(17);
		al1.add(20);
		al1.add(23);
		Student s2=new Student("c",al1);
		ArrayList<Integer> al2= new ArrayList<Integer>();
		al2.add(5);
		al2.add(6);
		al2.add(7);
		Student s3 = new Student("b",al2);
		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s3);
		studentlist.add(s2);
		HashSet<String> hs=new HashSet<String>();
	
		for(int i=0;i<studentlist.size();i++)
		{
			for(int j=0;j<studentlist.size();j++)
			{
				if(studentlist.get(i).compareTo(studentlist.get(j)) <0)
				{  
					String s=studentlist.get(i).name+studentlist.get(j).name;
					hs.add(s);
				}
			}
		}
		HashSet<String> hset = new HashSet<String>();
		for(String s:hs)
		{
			hset.add(s);
			//System.out.println(s);
		}
		for(String s:hs)
		{
			for(String str1: hs)
			{
				if(s!=str1)
				{
					char a[] = s.toCharArray();
					char b[] = str1.toCharArray();
					if(a[1] == b[0])
					{
						char newstr[]={a[0],b[1]};
						String toberemoved=new String(newstr);
						if(hset.contains(toberemoved))
						{
							hset.remove(toberemoved);
						}
					}
				}
			}
		}
		for(String s:hset)
		{
			System.out.println(s);
		}
		
	}
	
}
	
