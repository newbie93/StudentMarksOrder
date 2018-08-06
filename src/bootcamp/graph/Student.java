package bootcamp.graph;
import java.util.ArrayList;
import java.util.Arrays;

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
		Student s[]=new Student[3];
		s[0]=s1;
		s[1]=s3;
		s[2]=s2;
		Arrays.sort(s);
		for(Student students:s)
		{
			System.out.println(students.name);
		}
		
		
	}
	
}
	
