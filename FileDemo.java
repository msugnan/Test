import java.io.*;
class FileDemo
{
public static void main(String args[]) throws IOException
{
DataInputStream d=new DataInputStream(System.in);
FileOutputStream f=new FileOutputStream("qwe.txt",true);
String ch;//=new String();;
//char ch;
System.out.println("entet any text end #");
while((ch=d.readLine())!="#")
{
	//for(int i=0;i<ch.length();i++)
	byte b[]=ch.getBytes();
f.write(b);

//f.write(charAt(ch[i]));
}
f.close();
}
}
