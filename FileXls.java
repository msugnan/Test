import java.io.*;
class FileXls
{
public static void main(String args[]) throws IOException
{
	FileInputStream fin=new FileInputStream("sample.csv");
	FileOutputStream fou=new FileOutputStream("result.csv",true);
	int ch;
	while((ch=fin.read())!=-1)
	{
		//System.out.print((char)ch);
		//System.out.print("\n");
		fou.write((char)ch);
	}
	fin.close();
	fou.close();
}

}